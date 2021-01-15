package com.ddts.ac.service.impl;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.xm.exam.annotation.LogAnno;
import cn.xm.exam.mapper.common.DictionaryMapper;
import cn.xm.exam.service.common.DictionaryService;

/**
 * 字典表的实现类
 * 
 * @author 
 *
 */
@Service
public class DictionaryServiceImpl implements DictionaryService
{

	@Resource
	private DictionaryMapper dictionaryMapper;

	/**
	* 1、添加字典信息
	*/
	@LogAnno(operateType = "添加了一个字典项")
	@Override
	public boolean addDictionary(Dictionary dictionary) throws SQLException
	{
		int result = dictionaryMapper.insert(dictionary);
		if (result > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}