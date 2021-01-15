package com.ddts.ac.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import com.ddts.ac.common.Constant;

import oracle.jdbc.OracleTypes;

public class BaseDao
{
	private Connection con = null;
	private PreparedStatement ps;

	// The PreparedStatement interface is inherited from the Statement interface. The difference is:
	// A PreparedStatement represents an object of a precompiled SQL, which can be used to execute the SQL efficiently multiple times.
	private String db_driver = "oracle.jdbc.driver.OracleDriver"; // The oracle driver
	private String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; // Contains 4 parts: 1- The mode to connect to Oracle; 2- Database address; 3-Port; 4-Database name
	private String db_user = "ac_dba";
	private String db_password = "123";

	public BaseDao()
	{
		Properties prop = new Properties();
		BufferedReader br = null;
		String cur_path = Constant.CONTEXT.getRealPath("");
		try
		{
			// The properties file under the project directory cannot be obtained when running on Server,
			// because the Web project is managed by Tomcat and the current path is under the Apache Server webapps directory.
			// br = new BufferedReader(new FileReader("src/pdm.properties")); // when app running in eclipse
			br = new BufferedReader(new FileReader(cur_path + "\\WEB-INF\\classes\\jdbc.properties")); // when app running on server
			try
			{
				prop.load(br);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		db_driver = prop.getProperty("driver");
		db_url = prop.getProperty("url");
		db_user = prop.getProperty("username");
		db_password = prop.getProperty("password");
	}

	public boolean openDB()
	{
		try
		{
			Class.forName(db_driver); // load db driver
			con = DriverManager.getConnection(db_url, db_user, db_password); // establish a connection
			// System.out.println("con: " + con.toString());
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean closeDB()
	{
		try
		{
			if (ps != null)
			{
				ps.close();
				ps = null;
			}
			if (con != null)
			{
				con.close();
				con = null;
			}
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public int excuteUpdate(String sql)
	{
		int upd_rows = -1;
		try
		{
			if (openDB())
			{
				ps = con.prepareStatement(sql);
				upd_rows = ps.executeUpdate();
				closeDB();
			}
			return upd_rows;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			closeDB();
			return upd_rows;
		}
	}

	public int excuteUpdate(String sql, Object[] paras)
	{
		int upd_rows = -1;
		try
		{
			if (openDB())
			{
				ps = con.prepareStatement(sql);
				int i = 1;
				for (Object p : paras)
				{
					ps.setObject(i, p);
					i++;
				}
				upd_rows = ps.executeUpdate();
				closeDB();
			}
			return upd_rows;
		}
		catch (SQLException e)
		{

			closeDB();
			return upd_rows;
		}
	}

	public int excuteBatchUpdate(List<String> lst_sql, List<Object[]> lst_paras)
	{
		int i = 0;
		try
		{
			if (openDB())
			{
				for (String sql : lst_sql)
				{
					ps = con.prepareStatement(sql);
					Object[] paras = lst_paras.get(i);
					// System.out.println(sql);
					// System.out.println(Arrays.toString(paras));
					int j = 1;
					for (Object p : paras)
					{
						ps.setObject(j, p);
						j++;
					}
					ps.executeUpdate();
					i++;
				}
			}
			closeDB();
			System.out.println(i);
			return i;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			closeDB();
			return i;
		}
	}

	public ResultSet excuteQuery(String sql)
	{
		ResultSet rs = null;
		try
		{
			if (openDB())
			{
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				// closeDB( ) ;
			}
			return rs;
		}
		catch (Exception e)
		{
			// System.out.println(e.toString( )) ;
			closeDB();
			return null;
		}
	}

	public ResultSet excuteQuery(String sql, Object[] paras)
	{
		ResultSet rs = null;
		try
		{
			if (openDB())
			{
				ps = con.prepareStatement(sql);
				int i = 1;
				for (Object p : paras)
				{
					ps.setObject(i, p);
					i++;
				}
				rs = ps.executeQuery();
				closeDB();
			}
			return rs;
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
			closeDB();
			return null;
		}
	}

	private String getProcParasSql(int paras_count)
	{
		String sql = "(";
		if (paras_count > 0)
		{
			for (int i = 1; i < paras_count + 1; i++)
			{
				sql += "?,";
			}
			sql = sql.substring(0, sql.length() - 2) + ")";
		}
		else
		{
			sql += ")";
		}
		return sql;
	}

	public boolean callProcedure(String proc_name, Object[] in_paras)
	{
		try
		{
			if (openDB())
			{
				String sql_para = getProcParasSql(in_paras.length);
				String sql = "{call " + proc_name + sql_para + "}";
				CallableStatement cs = con.prepareCall(sql);
				int i = 1;
				for (Object p : in_paras)
				{
					cs.setObject(i, p);
					i++;
				}
				cs.execute();
				closeDB();
			}
			return true;
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
			closeDB();
			return false;
		}
	}

	@SuppressWarnings("rawtypes")
	public ResultSet callProcedure(String proc_name, Object[] in_paras, Object[] out_paras)
	{
		if (proc_name == null || proc_name.length() == 0)
		{
			return null;
		}

		if (out_paras == null)
		{
			if (callProcedure(proc_name, in_paras))
				return null;
		}

		try
		{
			ResultSet rs = null;
			if (openDB())
			{
				int in_paras_count = in_paras == null ? 0 : in_paras.length;
				int out_paras_count = out_paras == null ? 0 : out_paras.length;
				String sql_para = getProcParasSql(in_paras_count + out_paras_count);
				String sql = "{call " + proc_name + sql_para + "}";
				CallableStatement cs = con.prepareCall(sql);
				if (in_paras_count > 0)
				{
					String in_paras_type = null;
					int i = 1;
					for (Object p : in_paras)
					{
						cs.setObject(i, p);
						in_paras_type = p.getClass().getName().toString();
						i++;
					}
				}
				cs.registerOutParameter(in_paras_count + 1, OracleTypes.CURSOR);
				cs.execute();
				rs = (ResultSet) cs.getObject(in_paras_count + 1);
				closeDB();
			}
			return rs;
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
			closeDB();
			return null;
		}
	}
}
