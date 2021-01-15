package com.ddts.ac.model;

import java.util.*;

public class Attachment
{
    protected int ID = 0; 
	protected String BodyType = ""; 
    protected int BodyID = 0; 
	protected String AttachmentFile = ""; 
	protected String AttachmentPath = ""; 
	protected String AttachmentDescription = ""; 
	protected Date UploadedDate = new Date();
	protected String Uploader = ""; 

    
	public int getID()
	{
		return ID; 
	}
	public void setID(int _ID)
	{
		 this.ID = _ID ;
	}
    
	public String getBodyType()
	{
		return BodyType; 
	}
	public void setBodyType(String _BodyType)
	{
		 this.BodyType = _BodyType ;
	}
    
	public int getBodyID()
	{
		return BodyID; 
	}
	public void setBodyID(int _BodyID)
	{
		 this.BodyID = _BodyID ;
	}
    
	public String getAttachmentFile()
	{
		return AttachmentFile; 
	}
	public void setAttachmentFile(String _AttachmentFile)
	{
		 this.AttachmentFile = _AttachmentFile ;
	}
    
	public String getAttachmentPath()
	{
		return AttachmentPath; 
	}
	public void setAttachmentPath(String _AttachmentPath)
	{
		 this.AttachmentPath = _AttachmentPath ;
	}
    
	public String getAttachmentDescription()
	{
		return AttachmentDescription; 
	}
	public void setAttachmentDescription(String _AttachmentDescription)
	{
		 this.AttachmentDescription = _AttachmentDescription ;
	}
    
	public Date getUploadedDate()
	{
		return UploadedDate; 
	}
	public void setUploadedDate(Date _UploadedDate)
	{
		 this.UploadedDate = _UploadedDate ;
	}
    
	public String getUploader()
	{
		return Uploader; 
	}
	public void setUploader(String _Uploader)
	{
		 this.Uploader = _Uploader ;
	}
    
          
    protected String BodyName = ""; 
   
            
    public String getBodyName()
	{
		return BodyName; 
	}
	public void setBodyName(String _BodyName)
	{
		 this.BodyName = _BodyName ;
	}
}    
