package com.ddts.ac.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ddts.ac.dao.GenericDao;
import com.ddts.ac.model.Log;
import com.ddts.ac.service.LogService;

@Service
public class LogServiceImpl implements LogService
{

	private GenericDao<Log> dao = new GenericDao<Log>(new Log());

	@Override
	public boolean addLog(Log log) throws SQLException, IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		return dao.insert(log);
	}

}