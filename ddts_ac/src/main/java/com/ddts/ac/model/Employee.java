package com.ddts.ac.model;

import java.util.*;

public class Employee
{
    protected int ID = 0; 
    protected int CompanyID = 0; 
    protected int DepartmentID = 0; 
    protected int RoleID = 0; 
	protected String EmployeeCode = ""; 
	protected String EmployeeName = ""; 
    protected int ProfessionID = 0; 
    protected int QualificationID = 0; 
	protected String EmployeeTel = ""; 
	protected String EmployeeFax = ""; 
	protected String EmployeeEmail = ""; 
	protected String EmployeeAddress = ""; 
	protected String EmployeePicture = ""; 
	protected String EmployeeDescription = ""; 
	protected Date CreateDate = new Date();
	protected String Creator = ""; 
	protected Date ModifiedDate = new Date();
	protected String Modifier = ""; 
	protected String UserName = ""; 
	protected String UserPassword = ""; 
    protected int LoginCount = 0; 

    
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
    
	public int getDepartmentID()
	{
		return DepartmentID; 
	}
	public void setDepartmentID(int _DepartmentID)
	{
		 this.DepartmentID = _DepartmentID ;
	}
    
	public int getRoleID()
	{
		return RoleID; 
	}
	public void setRoleID(int _RoleID)
	{
		 this.RoleID = _RoleID ;
	}
    
	public String getEmployeeCode()
	{
		return EmployeeCode; 
	}
	public void setEmployeeCode(String _EmployeeCode)
	{
		 this.EmployeeCode = _EmployeeCode ;
	}
    
	public String getEmployeeName()
	{
		return EmployeeName; 
	}
	public void setEmployeeName(String _EmployeeName)
	{
		 this.EmployeeName = _EmployeeName ;
	}
    
	public int getProfessionID()
	{
		return ProfessionID; 
	}
	public void setProfessionID(int _ProfessionID)
	{
		 this.ProfessionID = _ProfessionID ;
	}
    
	public int getQualificationID()
	{
		return QualificationID; 
	}
	public void setQualificationID(int _QualificationID)
	{
		 this.QualificationID = _QualificationID ;
	}
    
	public String getEmployeeTel()
	{
		return EmployeeTel; 
	}
	public void setEmployeeTel(String _EmployeeTel)
	{
		 this.EmployeeTel = _EmployeeTel ;
	}
    
	public String getEmployeeFax()
	{
		return EmployeeFax; 
	}
	public void setEmployeeFax(String _EmployeeFax)
	{
		 this.EmployeeFax = _EmployeeFax ;
	}
    
	public String getEmployeeEmail()
	{
		return EmployeeEmail; 
	}
	public void setEmployeeEmail(String _EmployeeEmail)
	{
		 this.EmployeeEmail = _EmployeeEmail ;
	}
    
	public String getEmployeeAddress()
	{
		return EmployeeAddress; 
	}
	public void setEmployeeAddress(String _EmployeeAddress)
	{
		 this.EmployeeAddress = _EmployeeAddress ;
	}
    
	public String getEmployeePicture()
	{
		return EmployeePicture; 
	}
	public void setEmployeePicture(String _EmployeePicture)
	{
		 this.EmployeePicture = _EmployeePicture ;
	}
    
	public String getEmployeeDescription()
	{
		return EmployeeDescription; 
	}
	public void setEmployeeDescription(String _EmployeeDescription)
	{
		 this.EmployeeDescription = _EmployeeDescription ;
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
    
	public String getUserName()
	{
		return UserName; 
	}
	public void setUserName(String _UserName)
	{
		 this.UserName = _UserName ;
	}
    
	public String getUserPassword()
	{
		return UserPassword; 
	}
	public void setUserPassword(String _UserPassword)
	{
		 this.UserPassword = _UserPassword ;
	}
    
    
	public int getLoginCount()
	{
		return LoginCount; 
	}
	public void setLoginCount(int _LoginCount)
	{
		 this.LoginCount = _LoginCount ;
	}
    
          
    protected String CompanyName = ""; 
    protected String DepartmentName = ""; 
    protected String RoleName = ""; 
    protected String ProfessionName = ""; 
    protected String QualificationName = ""; 
   
            
    public String getCompanyName()
	{
		return CompanyName; 
	}
	public void setCompanyName(String _CompanyName)
	{
		 this.CompanyName = _CompanyName ;
	}
            
    public String getDepartmentName()
	{
		return DepartmentName; 
	}
	public void setDepartmentName(String _DepartmentName)
	{
		 this.DepartmentName = _DepartmentName ;
	}
            
    public String getRoleName()
	{
		return RoleName; 
	}
	public void setRoleName(String _RoleName)
	{
		 this.RoleName = _RoleName ;
	}
            
    public String getProfessionName()
	{
		return ProfessionName; 
	}
	public void setProfessionName(String _ProfessionName)
	{
		 this.ProfessionName = _ProfessionName ;
	}
            
    public String getQualificationName()
	{
		return QualificationName; 
	}
	public void setQualificationName(String _QualificationName)
	{
		 this.QualificationName = _QualificationName ;
	}
}    
