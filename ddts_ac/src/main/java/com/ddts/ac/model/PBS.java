package com.ddts.ac.model;

import java.util.*;

public class PBS
{
    protected int ID = 0; 
	protected String SRNo = ""; 
	protected String PackageNo = ""; 
	protected String PackageType = ""; 
    protected int TeamID = 0; 
    protected int PackageQuantity = 0; 
	protected double PackageMH = 0; 
	protected String PackageDescription = ""; 
	protected Date CreatedDate = new Date();
	protected String Creator = ""; 
	protected Date ModifiedDate = new Date();
	protected String Modifier = ""; 
	protected Date IssuedDate = new Date();
	protected String Issuer = ""; 

    
	public int getID()
	{
		return ID; 
	}
	public void setID(int _ID)
	{
		 this.ID = _ID ;
	}
    
	public String getSRNo()
	{
		return SRNo; 
	}
	public void setSRNo(String _SRNo)
	{
		 this.SRNo = _SRNo ;
	}
    
	public String getPackageNo()
	{
		return PackageNo; 
	}
	public void setPackageNo(String _PackageNo)
	{
		 this.PackageNo = _PackageNo ;
	}
    
	public String getPackageType()
	{
		return PackageType; 
	}
	public void setPackageType(String _PackageType)
	{
		 this.PackageType = _PackageType ;
	}
    
	public int getTeamID()
	{
		return TeamID; 
	}
	public void setTeamID(int _TeamID)
	{
		 this.TeamID = _TeamID ;
	}
    
	public int getPackageQuantity()
	{
		return PackageQuantity; 
	}
	public void setPackageQuantity(int _PackageQuantity)
	{
		 this.PackageQuantity = _PackageQuantity ;
	}
    
	public double getPackageMH()
	{
		return PackageMH; 
	}
	public void setPackageMH(double _PackageMH)
	{
		 this.PackageMH = _PackageMH ;
	}
    
	public String getPackageDescription()
	{
		return PackageDescription; 
	}
	public void setPackageDescription(String _PackageDescription)
	{
		 this.PackageDescription = _PackageDescription ;
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
    
	public Date getIssuedDate()
	{
		return IssuedDate; 
	}
	public void setIssuedDate(Date _IssuedDate)
	{
		 this.IssuedDate = _IssuedDate ;
	}
    
	public String getIssuer()
	{
		return Issuer; 
	}
	public void setIssuer(String _Issuer)
	{
		 this.Issuer = _Issuer ;
	}
    
          
    protected String TeamName = ""; 
   
            
    public String getTeamName()
	{
		return TeamName; 
	}
	public void setTeamName(String _TeamName)
	{
		 this.TeamName = _TeamName ;
	}
}    
