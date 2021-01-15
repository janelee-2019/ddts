package com.ddts.ac.dao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GenericDaoImpl<T> implements GenericDao<T>
{
	@SuppressWarnings("rawtypes")
	private Class c;
	private String c_name;
	private Field[] fs;
	private BaseDao dao;

	public GenericDaoImpl(T t)
	{
		c = t.getClass(); // gets the type class of the norm class (easy to do later), t.getClass()==T.class
		c_name = c.getSimpleName();
		fs = c.getDeclaredFields(); // Get "all" self-declared fields (or properties) of the class without asking for access rights
		dao = new BaseDao();
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private List<T> rsToList(ResultSet rs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException
	{
		List<T> lst = new ArrayList<T>();
		T t;
		if (rs != null)
		{
			while (rs.next())
			{
				ResultSetMetaData rsmd = rs.getMetaData(); // ResultSetMetaData include information of column of ResultSet
				int cols = rsmd.getColumnCount();
				t = (T) c.getDeclaredConstructor().newInstance();
				for (Field f : fs)
				{
					String f_name = f.getName(); // get field name
					String c_name = null;
					for (int i = 0; i < cols; i++)
					{
						if (rsmd.getColumnName(i + 1).equals(f_name)) // whether the column of ResultSet exists in the properties of the model
						{
							c_name = f_name;
							break;
						}
					}
					if (c_name == null)
						continue;
					Object o = rs.getObject(c_name); // get column value by column name, data type is Object
					if (o == null)
						continue;
					// Use BeanUtils to set value into the entity by the field name, use BeanUtils instead of PropertyUtils because BeanUtils automatically converts object types
					BeanUtils.setProperty(t, c_name, o);
					// System.out.println(f_name + ":" + o.toString());
				}
				lst.add((T) t);
			}
			return lst;
		}
		else
		{
			System.out.println("rs has nothing");
			return null;
		}
	}

	private String rsToJson(ResultSet rs) throws SQLException, JSONException
	{
		JSONArray json = new JSONArray();
		if (rs != null)
		{
			while (rs.next())
			{
				ResultSetMetaData rsmd = rs.getMetaData(); // ResultSetMetaData include information of column of ResultSet
				int col_count = rsmd.getColumnCount();
				JSONObject jo = new JSONObject();
				for (Field f : fs)
				{
					String f_name = f.getName(); // get field name
					String c_name = null;
					for (int i = 0; i < col_count; i++)
					{
						if (rsmd.getColumnName(i + 1).equals(f_name)) // whether the column of ResultSet exists in the properties of the model
						{
							c_name = f_name;
							break;
						}
					}
					if (c_name == null)
						continue;
					Object o = rs.getObject(c_name); // get column value by column name, data type is Object
					if (o == null)
						continue;
					jo.put(c_name, o);
				}
				json.put(jo);
			}
			System.out.println(json.toString());
			return json.toString();
		}
		else
		{
			System.out.println("rs has nothing");
			return null;
		}
	}

	private Object getValueByFieldName(Object t, String f_name)
	{
		try
		{
			String getter = "get" + f_name;
			Method method = t.getClass().getMethod(getter, new Class[] {});
			Object value = method.invoke(t, new Object[] {});
			return value;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean insert(T t) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		String f_name = "";
		Object f_value = "";
		String sql = "";
		String sql_field = "";
		String sql_value = "";
		ArrayList lst_para = new ArrayList();
		for (Field f : fs)
		{
			f_name = f.getName();
			f_value = getValueByFieldName(t, f_name);
			if (f_name != "ID" & f_value != null)
			{
				sql_field += "\"" + f_name + "\",";
				sql_value += "?,";
				lst_para.add(f_value);
			}
		}
		sql_field = sql_field.substring(0, sql_field.length() - 1);
		sql_value = sql_value.substring(0, sql_value.length() - 1);
		sql = "INSERT INTO \"" + c_name + "\" (" + sql_field + ") VALUES (" + sql_value + ");";
		Object[] paras = (Object[]) lst_para.toArray(new Object[lst_para.size()]);
		// System.out.println(sql) ;
		// System.out.println(paras) ;
		if (dao.excuteUpdate(sql, paras) > 0)
			return true;
		else
			return false;
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int insertBatch(List<T> lst) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		ArrayList<String> lst_sql = new ArrayList<>();
		ArrayList<Object[]> lst_paras = new ArrayList<>();
		for (T t : lst)
		{
			String f_name = "";
			Object f_value = null;
			String sql = "";
			String sql_field = "";
			String sql_value = "";
			ArrayList lst_para = new ArrayList();
			for (Field f : fs)
			{
				f_name = f.getName();
				f_value = getValueByFieldName(t, f_name);
				if (f_name != "ID" & f_value != null)
				{
					sql_field += "\"" + f_name + "\",";
					sql_value += "?,";
					lst_para.add(f_value);
				}
			}
			sql_field = sql_field.substring(0, sql_field.length() - 1);
			sql_value = sql_value.substring(0, sql_value.length() - 1);
			sql = "INSERT INTO \"" + c_name + "\" (" + sql_field + ") VALUES (" + sql_value + ");";
			lst_sql.add(sql);
			Object[] paras = (Object[]) lst_para.toArray(new Object[lst_para.size()]);
			lst_paras.add(paras);
		}
		return dao.excuteBatchUpdate(lst_sql, lst_paras);
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean update(T t) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		String f_name = "";
		Object f_value = "";
		String sql = "";
		String sql_set = "";
		ArrayList lst_para = new ArrayList();
		for (Field f : fs)
		{
			f_name = f.getName();
			f_value = getValueByFieldName(t, f_name);
			if (f_name != "ID" & f_value != null)
			{
				sql_set += "\"" + f_name + "\"=?,";
				lst_para.add(f_value);
			}
		}
		lst_para.add(BeanUtils.getProperty(t, "ID"));
		sql_set = sql_set.substring(0, sql_set.length() - 1);
		sql = "UPDATE \"" + c_name + "\" SET " + sql_set + " WHERE (ID=?);";
		Object[] paras = (Object[]) lst_para.toArray(new Object[lst_para.size()]);
		// System.out.println(sql) ;
		// System.out.println(paras) ;
		if (dao.excuteUpdate(sql, paras) > 0)
			return true;
		else
			return false;
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int updateBatch(List<T> lst) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		ArrayList<String> lst_sql = new ArrayList<>();
		ArrayList<Object[]> lst_paras = new ArrayList<>();
		for (T t : lst)
		{
			String f_name = "";
			Object f_value = "";
			String sql = "";
			String sql_set = "";
			ArrayList lst_para = new ArrayList();
			for (Field f : fs)
			{
				f_name = f.getName();
				f_value = getValueByFieldName(t, f_name);
				if (f_name != "ID" & f_value != null)
				{
					sql_set += "\"" + f_name + "\"=?,";
					lst_para.add(f_value);
				}
			}
			lst_para.add(BeanUtils.getProperty(t, "ID"));
			sql_set = sql_set.substring(0, sql_set.length() - 1);
			sql = "UPDATE \"" + c_name + "\" SET " + sql_set + " WHERE (ID=?);";
			lst_sql.add(sql);
			Object[] paras = (Object[]) lst_para.toArray(new Object[lst_para.size()]);
			lst_paras.add(paras);
		}
		return dao.excuteBatchUpdate(lst_sql, lst_paras);
	}

	@Override
	public boolean delete(int id) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		String sql = "DELETE FROM \"" + c_name + "\" WHERE ID=?;";
		Object[] paras = new Object[] { id };
		// System.out.println(sql) ;
		// System.out.println(paras) ;
		if (dao.excuteUpdate(sql, paras) > 0)
			return true;
		else
			return false;
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int deleteBatch(List<T> lst) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		ArrayList<String> lst_sql = new ArrayList<>();
		ArrayList<Object[]> lst_paras = new ArrayList<>();
		for (T t : lst)
		{
			String f_name = "";
			Object f_value = "";
			String sql = "";
			String sql_cond = "";
			ArrayList lst_para = new ArrayList();
			for (Field f : fs)
			{
				f_name = f.getName();
				f_value = getValueByFieldName(t, f_name);
				if (f_value != null)
				{
					sql_cond += f_name + "=? AND ";
					lst_para.add(f_value);
				}
			}
			sql_cond = sql_cond.substring(0, sql_cond.length() - 4);
			sql = "DELETE FROM \"" + c_name + "\" WHERE (" + sql_cond + ");";
			lst_sql.add(sql);
			String[] paras = (String[]) lst_para.toArray(new String[lst_para.size()]);
			lst_paras.add(paras);
			// System.out.println(sql) ;
			// System.out.println(paras) ;
		}
		return dao.excuteBatchUpdate(lst_sql, lst_paras);
	}

	@Override
	public boolean deleteAll()
	{
		String sql = "DELETE * FROM \"" + c_name + "\"";
		if (dao.excuteUpdate(sql) > 0)
			return true;
		else
			return false;
	}

	@Override
	public String getOne(int id) throws InstantiationException, IllegalAccessException, InvocationTargetException, SQLException, IllegalArgumentException, NoSuchMethodException, SecurityException, JSONException
	{
		String sql = "SELECT FROM \"" + c_name + "\" WHERE ID=?;";
		Object[] paras = new Object[] { id };
		ResultSet rs = dao.excuteQuery(sql, paras);
		// System.out.println(sql);
		// System.out.println(Arrays.toString(paras));
		return rsToJson(rs);
	}

	@Override
	public String getAll() throws InstantiationException, IllegalAccessException, InvocationTargetException, SQLException, IllegalArgumentException, NoSuchMethodException, SecurityException, JSONException
	{
		String sql = "SELECT * FROM \"" + c_name + "\" ORDER BY ID;";
		ResultSet rs = dao.excuteQuery(sql);
		return rsToJson(rs);
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String getPart(T t) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException, SQLException, JSONException
	{
		String f_name = "";
		Object f_value = "";
		String sql = "";
		String sql_cond = "";
		ArrayList lst_para = new ArrayList();

		for (Field f : fs)
		{
			f_name = f.getName();
			f_value = getValueByFieldName(t, f_name);
			if (f_value != null)
			{
				sql_cond += "\"" + f.getName() + "\"=? AND ";
				lst_para.add(f_value);
				/*
				if (f_name == "ID")
				{
					if (Integer.parseInt(f_value) > 0)
					{
						sql_cond += f.getName() + "=? AND ";
						lst_para.add(f_value);
						i++;
					}
				}
				else
				{
					sql_cond += f.getName() + "=? AND ";
					lst_para.add(f_value);
					i++;
				}
				*/
			}
		}
		sql_cond = sql_cond.substring(0, sql_cond.length() - 4);
		sql = "SELECT * FROM \" " + c_name + "\" WHERE (" + sql_cond + ");";
		System.out.println(sql);
		Object[] paras = (Object[]) lst_para.toArray(new Object[lst_para.size()]);
		// System.out.println(lst_para);
		ResultSet rs = dao.excuteQuery(sql, paras);
		// System.out.println("rs_count: " + rs.getFetchSize());
		return rsToJson(rs);
	}

	@Override
	public String getPart(String sql, Object[] paras) throws InstantiationException, IllegalAccessException, InvocationTargetException, SQLException, IllegalArgumentException, NoSuchMethodException, SecurityException, JSONException
	{
		ResultSet rs = dao.excuteQuery(sql, paras);
		return rsToJson(rs);
	}

	@Override
	public int getCount(String sql, Object paras[]) throws SQLException
	{
		return dao.excuteQuery(sql, paras).getFetchSize();
	}

	@Override
	public boolean callProcedure(String proc_name, Object[] in_paras)
	{
		return dao.callProcedure(proc_name, in_paras);
	}

	@Override
	public String callProcedure(String proc_name, Object[] in_paras, Object[] out_paras) throws JSONException, SQLException
	{
		return rsToJson(dao.callProcedure(proc_name, in_paras, out_paras));
	}
}
