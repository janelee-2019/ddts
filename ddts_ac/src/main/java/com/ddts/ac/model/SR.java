package com.ddts.ac.model;

import java.util.*;

public class SR
{
    protected int ID = 0; 
	protected String SRNo = ""; 
	protected String OriginalSRNo = ""; 
	protected String ProjectTitle = ""; 
	protected String ProjectType = ""; 
	protected String DCNo = ""; 
    protected int AffiliateID = 0; 
    protected int AllianceID = 0; 
	protected String ContractNo = ""; 
	protected String AddressTo = ""; 
    protected int ServiceRequesterID = 0; 
	protected String ServiceType = ""; 
	protected String BreifDescription = ""; 
	protected String Initiator = ""; 
	protected Date InitiatedDate = new Date();
	protected String Accepter = ""; 
	protected Date AcceptedDate = new Date();
	protected String Endorser = ""; 
	protected Date EndorsedDate = new Date();
	protected String Reciever = ""; 
	protected Date RecievedDate = new Date();
	protected String Inputer = ""; 
	protected Date InputtedDate = new Date();
	protected String Modifier = ""; 
	protected Date ModifiedDate = new Date();
	protected String Submitter = ""; 
	protected Date SubmittedDate = new Date();
    protected int SROriginalID = 0; 
	protected String SRContactIDs = ""; 

    
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
    
	public String getOriginalSRNo()
	{
		return OriginalSRNo; 
	}
	public void setOriginalSRNo(String _OriginalSRNo)
	{
		 this.OriginalSRNo = _OriginalSRNo ;
	}
    
	public String getProjectTitle()
	{
		return ProjectTitle; 
	}
	public void setProjectTitle(String _ProjectTitle)
	{
		 this.ProjectTitle = _ProjectTitle ;
	}
    
	public String getProjectType()
	{
		return ProjectType; 
	}
	public void setProjectType(String _ProjectType)
	{
		 this.ProjectType = _ProjectType ;
	}
    
	public String getDCNo()
	{
		return DCNo; 
	}
	public void setDCNo(String _DCNo)
	{
		 this.DCNo = _DCNo ;
	}
    
	public int getAffiliateID()
	{
		return AffiliateID; 
	}
	public void setAffiliateID(int _AffiliateID)
	{
		 this.AffiliateID = _AffiliateID ;
	}
    
	public int getAllianceID()
	{
		return AllianceID; 
	}
	public void setAllianceID(int _AllianceID)
	{
		 this.AllianceID = _AllianceID ;
	}
    
	public String getContractNo()
	{
		return ContractNo; 
	}
	public void setContractNo(String _ContractNo)
	{
		 this.ContractNo = _ContractNo ;
	}
    
	public String getAddressTo()
	{
		return AddressTo; 
	}
	public void setAddressTo(String _AddressTo)
	{
		 this.AddressTo = _AddressTo ;
	}
    
	public int getServiceRequesterID()
	{
		return ServiceRequesterID; 
	}
	public void setServiceRequesterID(int _ServiceRequesterID)
	{
		 this.ServiceRequesterID = _ServiceRequesterID ;
	}
    
	public String getServiceType()
	{
		return ServiceType; 
	}
	public void setServiceType(String _ServiceType)
	{
		 this.ServiceType = _ServiceType ;
	}
    
	public String getBreifDescription()
	{
		return BreifDescription; 
	}
	public void setBreifDescription(String _BreifDescription)
	{
		 this.BreifDescription = _BreifDescription ;
	}
    
	public String getInitiator()
	{
		return Initiator; 
	}
	public void setInitiator(String _Initiator)
	{
		 this.Initiator = _Initiator ;
	}
    
	public Date getInitiatedDate()
	{
		return InitiatedDate; 
	}
	public void setInitiatedDate(Date _InitiatedDate)
	{
		 this.InitiatedDate = _InitiatedDate ;
	}
    
	public String getAccepter()
	{
		return Accepter; 
	}
	public void setAccepter(String _Accepter)
	{
		 this.Accepter = _Accepter ;
	}
    
	public Date getAcceptedDate()
	{
		return AcceptedDate; 
	}
	public void setAcceptedDate(Date _AcceptedDate)
	{
		 this.AcceptedDate = _AcceptedDate ;
	}
    
	public String getEndorser()
	{
		return Endorser; 
	}
	public void setEndorser(String _Endorser)
	{
		 this.Endorser = _Endorser ;
	}
    
	public Date getEndorsedDate()
	{
		return EndorsedDate; 
	}
	public void setEndorsedDate(Date _EndorsedDate)
	{
		 this.EndorsedDate = _EndorsedDate ;
	}
    
	public String getReciever()
	{
		return Reciever; 
	}
	public void setReciever(String _Reciever)
	{
		 this.Reciever = _Reciever ;
	}
    
	public Date getRecievedDate()
	{
		return RecievedDate; 
	}
	public void setRecievedDate(Date _RecievedDate)
	{
		 this.RecievedDate = _RecievedDate ;
	}
    
	public String getInputer()
	{
		return Inputer; 
	}
	public void setInputer(String _Inputer)
	{
		 this.Inputer = _Inputer ;
	}
    
	public Date getInputtedDate()
	{
		return InputtedDate; 
	}
	public void setInputtedDate(Date _InputtedDate)
	{
		 this.InputtedDate = _InputtedDate ;
	}
    
	public String getModifier()
	{
		return Modifier; 
	}
	public void setModifier(String _Modifier)
	{
		 this.Modifier = _Modifier ;
	}
    
	public Date getModifiedDate()
	{
		return ModifiedDate; 
	}
	public void setModifiedDate(Date _ModifiedDate)
	{
		 this.ModifiedDate = _ModifiedDate ;
	}
    
	public String getSubmitter()
	{
		return Submitter; 
	}
	public void setSubmitter(String _Submitter)
	{
		 this.Submitter = _Submitter ;
	}
    
	public Date getSubmittedDate()
	{
		return SubmittedDate; 
	}
	public void setSubmittedDate(Date _SubmittedDate)
	{
		 this.SubmittedDate = _SubmittedDate ;
	}
    
	public int getSROriginalID()
	{
		return SROriginalID; 
	}
	public void setSROriginalID(int _SROriginalID)
	{
		 this.SROriginalID = _SROriginalID ;
	}
    
	public String getSRContactIDs()
	{
		return SRContactIDs; 
	}
	public void setSRContactIDs(String _SRContactIDs)
	{
		 this.SRContactIDs = _SRContactIDs ;
	}
    
          
    protected String AffiliateName = ""; 
    protected String AllianceName = ""; 
    protected String ServiceRequesterName = ""; 
    protected String SROriginalName = ""; 
   
            
    public String getAffiliateName()
	{
		return AffiliateName; 
	}
	public void setAffiliateName(String _AffiliateName)
	{
		 this.AffiliateName = _AffiliateName ;
	}
            
    public String getAllianceName()
	{
		return AllianceName; 
	}
	public void setAllianceName(String _AllianceName)
	{
		 this.AllianceName = _AllianceName ;
	}
            
    public String getServiceRequesterName()
	{
		return ServiceRequesterName; 
	}
	public void setServiceRequesterName(String _ServiceRequesterName)
	{
		 this.ServiceRequesterName = _ServiceRequesterName ;
	}
            
    public String getSROriginalName()
	{
		return SROriginalName; 
	}
	public void setSROriginalName(String _SROriginalName)
	{
		 this.SROriginalName = _SROriginalName ;
	}
}    
