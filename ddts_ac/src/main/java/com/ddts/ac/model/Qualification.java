package com.ddts.ac.model;

import java.util.*;

public class Qualification
{
    protected int ID = 0; 
	protected String QualificationCode = ""; 
	protected String QualificationName = ""; 
	protected String QualificationDescription = ""; 
	protected String QualificationLevel = ""; 
	protected String QualificationType = ""; 
	protected String Issuedby = ""; 
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
    
	public String getQualificationCode()
	{
		return QualificationCode; 
	}
	public void setQualificationCode(String _QualificationCode)
	{
		 this.QualificationCode = _QualificationCode ;
	}
    
	public String getQualificationName()
	{
		return QualificationName; 
	}
	public void setQualificationName(String _QualificationName)
	{
		 this.QualificationName = _QualificationName ;
	}
    
	public String getQualificationDescription()
	{
		return QualificationDescription; 
	}
	public void setQualificationDescription(String _QualificationDescription)
	{
		 this.QualificationDescription = _QualificationDescription ;
	}
    
	public String getQualificationLevel()
	{
		return QualificationLevel; 
	}
	public void setQualificationLevel(String _QualificationLevel)
	{
		 this.QualificationLevel = _QualificationLevel ;
	}
    
	public String getQualificationType()
	{
		return QualificationType; 
	}
	public void setQualificationType(String _QualificationType)
	{
		 this.QualificationType = _QualificationType ;
	}
    
	public String getIssuedby()
	{
		return Issuedby; 
	}
	public void setIssuedby(String _Issuedby)
	{
		 this.Issuedby = _Issuedby ;
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
