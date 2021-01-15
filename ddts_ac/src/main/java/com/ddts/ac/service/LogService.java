package com.ddts.ac.service;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.ddts.ac.model.Log;

public interface LogService
{
	public boolean addLog(Log log) throws SQLException, IllegalAccessException, InvocationTargetException, NoSuchMethodException;
}