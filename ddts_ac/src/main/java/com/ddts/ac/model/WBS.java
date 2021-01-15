package com.ddts.ac.model;

import java.util.*;

public class WBS
{
    protected int ID = 0; 
	protected String SRNo = ""; 
	protected String PackageNo = ""; 
	protected String BatchNo = ""; 
    protected int GroupID = 0; 
	protected String DocumentCategory = ""; 
	protected String DocumentType = ""; 
	protected String DCNo = ""; 
    protected int BatchQuantity = 0; 
	protected double BatchMH = 0; 
	protected double BatchMH2 = 0; 
	protected Date BatchTD = new Date();
	protected Date BatchCD = new Date();
	protected String QCIndex = ""; 
	protected Date QCDate = new Date();
	protected String BatchDescription = ""; 
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
    
	public String getBatchNo()
	{
		return BatchNo; 
	}
	public void setBatchNo(String _BatchNo)
	{
		 this.BatchNo = _BatchNo ;
	}
    
	public int getGroupID()
	{
		return GroupID; 
	}
	public void setGroupID(int _GroupID)
	{
		 this.GroupID = _GroupID ;
	}
    
	public String getDocumentCategory()
	{
		return DocumentCategory; 
	}
	public void setDocumentCategory(String _DocumentCategory)
	{
		 this.DocumentCategory = _DocumentCategory ;
	}
    
	public String getDocumentType()
	{
		return DocumentType; 
	}
	public void setDocumentType(String _DocumentType)
	{
		 this.DocumentType = _DocumentType ;
	}
    
	public String getDCNo()
	{
		return DCNo; 
	}
	public void setDCNo(String _DCNo)
	{
		 this.DCNo = _DCNo ;
	}
    
	public int getBatchQuantity()
	{
		return BatchQuantity; 
	}
	public void setBatchQuantity(int _BatchQuantity)
	{
		 this.BatchQuantity = _BatchQuantity ;
	}
    
	public double getBatchMH()
	{
		return BatchMH; 
	}
	public void setBatchMH(double _BatchMH)
	{
		 this.BatchMH = _BatchMH ;
	}
    
	public double getBatchMH2()
	{
		return BatchMH2; 
	}
	public void setBatchMH2(double _BatchMH2)
	{
		 this.BatchMH2 = _BatchMH2 ;
	}
    
	public Date getBatchTD()
	{
		return BatchTD; 
	}
	public void setBatchTD(Date _BatchTD)
	{
		 this.BatchTD = _BatchTD ;
	}
    
	public Date getBatchCD()
	{
		return BatchCD; 
	}
	public void setBatchCD(Date _BatchCD)
	{
		 this.BatchCD = _BatchCD ;
	}
    
	public String getQCIndex()
	{
		return QCIndex; 
	}
	public void setQCIndex(String _QCIndex)
	{
		 this.QCIndex = _QCIndex ;
	}
    
	public Date getQCDate()
	{
		return QCDate; 
	}
	public void setQCDate(Date _QCDate)
	{
		 this.QCDate = _QCDate ;
	}
    
	public String getBatchDescription()
	{
		return BatchDescription; 
	}
	public void setBatchDescription(String _BatchDescription)
	{
		 this.BatchDescription = _BatchDescription ;
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
    
          
    protected String GroupName = ""; 
   
            
    public String getGroupName()
	{
		return GroupName; 
	}
	public void setGroupName(String _GroupName)
	{
		 this.GroupName = _GroupName ;
	}
}    
