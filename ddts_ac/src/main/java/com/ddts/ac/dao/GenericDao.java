package com.ddts.ac.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import org.json.JSONException;

public interface GenericDao<T>
{
	public boolean insert(T t) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;

	public int insertBatch(List<T> lst) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;

	public boolean update(T t) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;

	public int updateBatch(List<T> lst) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;

	public boolean delete(int id) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;

	public int deleteBatch(List<T> lst) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;

	public boolean deleteAll();

	public String getOne(int id) throws InstantiationException, IllegalAccessException, InvocationTargetException, SQLException, IllegalArgumentException, NoSuchMethodException, SecurityException, JSONException;

	public String getAll() throws InstantiationException, IllegalAccessException, InvocationTargetException, SQLException, IllegalArgumentException, NoSuchMethodException, SecurityException, JSONException;

	public String getPart(T t) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException, SQLException, JSONException;

	public String getPart(String sql, Object[] paras) throws InstantiationException, IllegalAccessException, InvocationTargetException, SQLException, IllegalArgumentException, NoSuchMethodException, SecurityException, JSONException;

	public int getCount(String sql, Object paras[]) throws SQLException;

	public boolean callProcedure(String proc_name, Object[] in_paras);

	public String callProcedure(String proc_name, Object[] in_paras, Object[] out_paras) throws JSONException, SQLException;
}
