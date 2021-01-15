package com.ddts.ac.model;

import java.util.*;

public class Authorization
{
    protected int ID = 0; 
    protected int RoleID = 0; 
    protected int FunctionID = 0; 
    protected boolean IsUsable = false; 
	protected Date CreatedDate = new Date();
	protected String Creator = ""; 
	protected Date ModifiedDate = new Date();
	protected String Modifier = ""; 

    
	public int getID()
	{
		return ID; 
	}
	public void setID(int _ID)
	{
		 this.ID = _ID ;
	}
    
	public int getRoleID()
	{
		return RoleID; 
	}
	public void setRoleID(int _RoleID)
	{
		 this.RoleID = _RoleID ;
	}
    
	public int getFunctionID()
	{
		return FunctionID; 
	}
	public void setFunctionID(int _FunctionID)
	{
		 this.FunctionID = _FunctionID ;
	}
    
	public boolean getIsUsable()
	{
		return IsUsable; 
	}
	public void setIsUsable(boolean _IsUsable)
	{
		 this.IsUsable = _IsUsable ;
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
    
          
    protected String RoleName = ""; 
    protected String FunctionName = ""; 
   
            
    public String getRoleName()
	{
		return RoleName; 
	}
	public void setRoleName(String _RoleName)
	{
		 this.RoleName = _RoleName ;
	}
            
    public String getFunctionName()
	{
		return FunctionName; 
	}
	public void setFunctionName(String _FunctionName)
	{
		 this.FunctionName = _FunctionName ;
	}
}    
