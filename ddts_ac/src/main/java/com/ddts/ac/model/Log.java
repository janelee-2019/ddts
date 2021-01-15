package com.ddts.ac.model;

import java.util.Date;

public class Log
{
	protected int ID = 0;
	protected String OperateType = "";
	protected Date OperateDate = new Date();
	protected String OperateResult = "";
	protected String Operator = "";
	protected String LogType = "";
	protected String OperateIP = "";
	protected String MethodName = "";
	protected String MethodParameters = "";
	protected String Description = "";
	protected String ExceptionCode = "";
	protected String ExceptionDetail = "";

	public int getID()
	{
		return ID;
	}

	public void setID(int _ID)
	{
		this.ID = _ID;
	}

	public String getOperateType()
	{
		return OperateType;
	}

	public void setOperateType(String _OperateType)
	{
		this.OperateType = _OperateType;
	}

	public Date getOperateDate()
	{
		return OperateDate;
	}

	public void setOperateDate(Date _OperateDate)
	{
		this.OperateDate = _OperateDate;
	}

	public String getOperateResult()
	{
		return OperateResult;
	}

	public void setOperateResult(String _OperateResult)
	{
		this.OperateResult = _OperateResult;
	}

	public String getOperator()
	{
		return Operator;
	}

	public void setOperator(String _Operator)
	{
		this.Operator = _Operator;
	}

	public String getLogType()
	{
		return LogType;
	}

	public void setLogType(String _LogType)
	{
		this.LogType = _LogType;
	}

	public String getOperateIP()
	{
		return OperateIP;
	}

	public void setOperateIP(String _OperateIP)
	{
		this.OperateIP = _OperateIP;
	}

	public String getMethodName()
	{
		return MethodName;
	}

	public void setMethodName(String _MethodName)
	{
		this.MethodName = _MethodName;
	}

	public String getMethodParameters()
	{
		return MethodParameters;
	}

	public void setMethodParameters(String _MethodParameters)
	{
		this.MethodParameters = _MethodParameters;
	}

	public String getDescription()
	{
		return Description;
	}

	public void setDescription(String _Description)
	{
		this.Description = _Description;
	}

	public String getExceptionCode()
	{
		return ExceptionCode;
	}

	public void setExceptionCode(String _ExceptionCode)
	{
		this.ExceptionCode = _ExceptionCode;
	}

	public String getExceptionDetail()
	{
		return ExceptionDetail;
	}

	public void setExceptionDetail(String _ExceptionDetail)
	{
		this.ExceptionDetail = _ExceptionDetail;
	}

}
