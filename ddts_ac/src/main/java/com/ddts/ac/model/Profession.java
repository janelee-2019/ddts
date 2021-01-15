package com.ddts.ac.model;

import java.util.*;

public class Profession
{
    protected int ID = 0; 
	protected String ProfessionalCode = ""; 
	protected String ProfessionalName = ""; 
	protected String ProfessionalDescription = ""; 
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
    
	public String getProfessionalCode()
	{
		return ProfessionalCode; 
	}
	public void setProfessionalCode(String _ProfessionalCode)
	{
		 this.ProfessionalCode = _ProfessionalCode ;
	}
    
	public String getProfessionalName()
	{
		return ProfessionalName; 
	}
	public void setProfessionalName(String _ProfessionalName)
	{
		 this.ProfessionalName = _ProfessionalName ;
	}
    
	public String getProfessionalDescription()
	{
		return ProfessionalDescription; 
	}
	public void setProfessionalDescription(String _ProfessionalDescription)
	{
		 this.ProfessionalDescription = _ProfessionalDescription ;
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
