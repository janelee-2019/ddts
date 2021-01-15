package com.ddts.ac.model;

import java.util.*;

public class SOW
{
    protected int ID = 0; 
    protected int SRID = 0; 
	protected String Description = ""; 
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
    
	public int getSRID()
	{
		return SRID; 
	}
	public void setSRID(int _SRID)
	{
		 this.SRID = _SRID ;
	}
    
    
	public String getDescription()
	{
		return Description; 
	}
	public void setDescription(String _Description)
	{
		 this.Description = _Description ;
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
    
          
    protected String SRName = ""; 
   
            
    public String getSRName()
	{
		return SRName; 
	}
	public void setSRName(String _SRName)
	{
		 this.SRName = _SRName ;
	}
}    
