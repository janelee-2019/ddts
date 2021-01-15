package com.ddts.ac.model;

import java.util.*;

public class Function
{
    protected int ID = 0; 
    protected int FunctionSuperiorID = 0; 
	protected String FunctionCode = ""; 
	protected String FunctionName = ""; 
	protected String FunctionLevel = ""; 
	protected String FunctionType = ""; 
	protected String FunctionObject = ""; 
	protected String FunctionDescription = ""; 
	protected Date CreatedDate = new Date();
	protected String Creator = ""; 
	protected Date ModifiedDate = new Date();
	protected String Modifier = ""; 
	protected String SystemID = ""; 
	protected String Uri = ""; 
	protected String Icon = ""; 
	protected String Status = ""; 

    
	public int getID()
	{
		return ID; 
	}
	public void setID(int _ID)
	{
		 this.ID = _ID ;
	}
    
	public int getFunctionSuperiorID()
	{
		return FunctionSuperiorID; 
	}
	public void setFunctionSuperiorID(int _FunctionSuperiorID)
	{
		 this.FunctionSuperiorID = _FunctionSuperiorID ;
	}
    
	public String getFunctionCode()
	{
		return FunctionCode; 
	}
	public void setFunctionCode(String _FunctionCode)
	{
		 this.FunctionCode = _FunctionCode ;
	}
    
	public String getFunctionName()
	{
		return FunctionName; 
	}
	public void setFunctionName(String _FunctionName)
	{
		 this.FunctionName = _FunctionName ;
	}
    
	public String getFunctionLevel()
	{
		return FunctionLevel; 
	}
	public void setFunctionLevel(String _FunctionLevel)
	{
		 this.FunctionLevel = _FunctionLevel ;
	}
    
	public String getFunctionType()
	{
		return FunctionType; 
	}
	public void setFunctionType(String _FunctionType)
	{
		 this.FunctionType = _FunctionType ;
	}
    
	public String getFunctionObject()
	{
		return FunctionObject; 
	}
	public void setFunctionObject(String _FunctionObject)
	{
		 this.FunctionObject = _FunctionObject ;
	}
    
	public String getFunctionDescription()
	{
		return FunctionDescription; 
	}
	public void setFunctionDescription(String _FunctionDescription)
	{
		 this.FunctionDescription = _FunctionDescription ;
	}
    
	public Date getCreatedDate()
	{
		return CreatedDate; 
	}
	public void setCreatedDate(Date _CreatedDate)
	{
		 this.CreatedDate = _CreatedDate ;
	}
    
	public String getCreator()
	{
		return Creator; 
	}
	public void setCreator(String _Creator)
	{
		 this.Creator = _Creator ;
	}
    
	public Date getModifiedDate()
	{
		return ModifiedDate; 
	}
	public void setModifiedDate(Date _ModifiedDate)
	{
		 this.ModifiedDate = _ModifiedDate ;
	}
    
	public String getModifier()
	{
		return Modifier; 
	}
	public void setModifier(String _Modifier)
	{
		 this.Modifier = _Modifier ;
	}
    
	public String getSystemID()
	{
		return SystemID; 
	}
	public void setSystemID(String _SystemID)
	{
		 this.SystemID = _SystemID ;
	}
    
	public String getUri()
	{
		return Uri; 
	}
	public void setUri(String _Uri)
	{
		 this.Uri = _Uri ;
	}
    
	public String getIcon()
	{
		return Icon; 
	}
	public void setIcon(String _Icon)
	{
		 this.Icon = _Icon ;
	}
    
	public String getStatus()
	{
		return Status; 
	}
	public void setStatus(String _Status)
	{
		 this.Status = _Status ;
	}
    
          
    protected String FunctionSuperiorName = ""; 
   
            
    public String getFunctionSuperiorName()
	{
		return FunctionSuperiorName; 
	}
	public void setFunctionSuperiorName(String _FunctionSuperiorName)
	{
		 this.FunctionSuperiorName = _FunctionSuperiorName ;
	}
}    
