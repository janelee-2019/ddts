package com.ddts.ac.model;

import java.util.*;

public class Role
{
    protected int ID = 0; 
	protected String RoleCode = ""; 
	protected String RoleName = ""; 
	protected String RoleLevel = ""; 
	protected String RoleDescription = ""; 
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
    
	public String getRoleCode()
	{
		return RoleCode; 
	}
	public void setRoleCode(String _RoleCode)
	{
		 this.RoleCode = _RoleCode ;
	}
    
	public String getRoleName()
	{
		return RoleName; 
	}
	public void setRoleName(String _RoleName)
	{
		 this.RoleName = _RoleName ;
	}
    
	public String getRoleLevel()
	{
		return RoleLevel; 
	}
	public void setRoleLevel(String _RoleLevel)
	{
		 this.RoleLevel = _RoleLevel ;
	}
    
	public String getRoleDescription()
	{
		return RoleDescription; 
	}
	public void setRoleDescription(String _RoleDescription)
	{
		 this.RoleDescription = _RoleDescription ;
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
    
          
   
}    
