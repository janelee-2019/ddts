package com.ddts.ac.model;

import java.util.*;

public class Department
{
    protected int ID = 0; 
    protected int CompanyID = 0; 
    protected int DepartmentSuperiorID = 0; 
	protected String DepartmentCode = ""; 
	protected String DepartmentName = ""; 
	protected String DepartmentLevel = ""; 
    protected int DepartmentLeaderID = 0; 
	protected String DepartmentDescription = ""; 
	protected Date CreateDate = new Date();
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
    
	public int getCompanyID()
	{
		return CompanyID; 
	}
	public void setCompanyID(int _CompanyID)
	{
		 this.CompanyID = _CompanyID ;
	}
    
	public int getDepartmentSuperiorID()
	{
		return DepartmentSuperiorID; 
	}
	public void setDepartmentSuperiorID(int _DepartmentSuperiorID)
	{
		 this.DepartmentSuperiorID = _DepartmentSuperiorID ;
	}
    
	public String getDepartmentCode()
	{
		return DepartmentCode; 
	}
	public void setDepartmentCode(String _DepartmentCode)
	{
		 this.DepartmentCode = _DepartmentCode ;
	}
    
	public String getDepartmentName()
	{
		return DepartmentName; 
	}
	public void setDepartmentName(String _DepartmentName)
	{
		 this.DepartmentName = _DepartmentName ;
	}
    
	public String getDepartmentLevel()
	{
		return DepartmentLevel; 
	}
	public void setDepartmentLevel(String _DepartmentLevel)
	{
		 this.DepartmentLevel = _DepartmentLevel ;
	}
    
	public int getDepartmentLeaderID()
	{
		return DepartmentLeaderID; 
	}
	public void setDepartmentLeaderID(int _DepartmentLeaderID)
	{
		 this.DepartmentLeaderID = _DepartmentLeaderID ;
	}
    
	public String getDepartmentDescription()
	{
		return DepartmentDescription; 
	}
	public void setDepartmentDescription(String _DepartmentDescription)
	{
		 this.DepartmentDescription = _DepartmentDescription ;
	}
    
	public Date getCreateDate()
	{
		return CreateDate; 
	}
	public void setCreateDate(Date _CreateDate)
	{
		 this.CreateDate = _CreateDate ;
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
    
          
    protected String CompanyName = ""; 
    protected String DepartmentSuperiorName = ""; 
    protected String DepartmentLeaderName = ""; 
   
            
    public String getCompanyName()
	{
		return CompanyName; 
	}
	public void setCompanyName(String _CompanyName)
	{
		 this.CompanyName = _CompanyName ;
	}
            
    public String getDepartmentSuperiorName()
	{
		return DepartmentSuperiorName; 
	}
	public void setDepartmentSuperiorName(String _DepartmentSuperiorName)
	{
		 this.DepartmentSuperiorName = _DepartmentSuperiorName ;
	}
            
    public String getDepartmentLeaderName()
	{
		return DepartmentLeaderName; 
	}
	public void setDepartmentLeaderName(String _DepartmentLeaderName)
	{
		 this.DepartmentLeaderName = _DepartmentLeaderName ;
	}
}    
