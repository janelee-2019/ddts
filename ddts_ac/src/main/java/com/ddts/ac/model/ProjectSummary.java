package com.ddts.ac.model;

import java.util.*;

public class ProjectSummary
{
    protected int ID = 0; 
	protected String SRNo = ""; 
	protected String Affiliate = ""; 
	protected String OriginalSRNo = ""; 
	protected String DCNo = ""; 
	protected String RequestType = ""; 
	protected Date SRRecievedDate = new Date();
	protected Date TPSubmittedDate = new Date();
	protected Date TPApprovedDate = new Date();
	protected Date CPSubmittedDate = new Date();
	protected Date CPApprovedDate = new Date();
	protected Date AMCCPSubmittedDate = new Date();
	protected Date AMCCApprovedDate = new Date();
	protected Date SRStartDate = new Date();
	protected Date SRTCDate = new Date();
	protected Date SRCompletionDate = new Date();
	protected String SRPlanDuration = ""; 
	protected String AllianceActionStatus = ""; 
    protected boolean SiteVisit = false; 
	protected String AllianceStatus = ""; 
	protected String AllianceRemark = ""; 
	protected String EPMCurrentStatus = ""; 
	protected double ApprovedMH = 0; 
	protected double ConsumedMH = 0; 
	protected double RemainingMH = 0; 
	protected double BudgetAwarded = 0; 
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
    
	public String getSRNo()
	{
		return SRNo; 
	}
	public void setSRNo(String _SRNo)
	{
		 this.SRNo = _SRNo ;
	}
    
	public String getAffiliate()
	{
		return Affiliate; 
	}
	public void setAffiliate(String _Affiliate)
	{
		 this.Affiliate = _Affiliate ;
	}
    
	public String getOriginalSRNo()
	{
		return OriginalSRNo; 
	}
	public void setOriginalSRNo(String _OriginalSRNo)
	{
		 this.OriginalSRNo = _OriginalSRNo ;
	}
    
	public String getDCNo()
	{
		return DCNo; 
	}
	public void setDCNo(String _DCNo)
	{
		 this.DCNo = _DCNo ;
	}
    
	public String getRequestType()
	{
		return RequestType; 
	}
	public void setRequestType(String _RequestType)
	{
		 this.RequestType = _RequestType ;
	}
    
	public Date getSRRecievedDate()
	{
		return SRRecievedDate; 
	}
	public void setSRRecievedDate(Date _SRRecievedDate)
	{
		 this.SRRecievedDate = _SRRecievedDate ;
	}
    
	public Date getTPSubmittedDate()
	{
		return TPSubmittedDate; 
	}
	public void setTPSubmittedDate(Date _TPSubmittedDate)
	{
		 this.TPSubmittedDate = _TPSubmittedDate ;
	}
    
	public Date getTPApprovedDate()
	{
		return TPApprovedDate; 
	}
	public void setTPApprovedDate(Date _TPApprovedDate)
	{
		 this.TPApprovedDate = _TPApprovedDate ;
	}
    
	public Date getCPSubmittedDate()
	{
		return CPSubmittedDate; 
	}
	public void setCPSubmittedDate(Date _CPSubmittedDate)
	{
		 this.CPSubmittedDate = _CPSubmittedDate ;
	}
    
	public Date getCPApprovedDate()
	{
		return CPApprovedDate; 
	}
	public void setCPApprovedDate(Date _CPApprovedDate)
	{
		 this.CPApprovedDate = _CPApprovedDate ;
	}
    
	public Date getAMCCPSubmittedDate()
	{
		return AMCCPSubmittedDate; 
	}
	public void setAMCCPSubmittedDate(Date _AMCCPSubmittedDate)
	{
		 this.AMCCPSubmittedDate = _AMCCPSubmittedDate ;
	}
    
	public Date getAMCCApprovedDate()
	{
		return AMCCApprovedDate; 
	}
	public void setAMCCApprovedDate(Date _AMCCApprovedDate)
	{
		 this.AMCCApprovedDate = _AMCCApprovedDate ;
	}
    
	public Date getSRStartDate()
	{
		return SRStartDate; 
	}
	public void setSRStartDate(Date _SRStartDate)
	{
		 this.SRStartDate = _SRStartDate ;
	}
    
	public Date getSRTCDate()
	{
		return SRTCDate; 
	}
	public void setSRTCDate(Date _SRTCDate)
	{
		 this.SRTCDate = _SRTCDate ;
	}
    
	public Date getSRCompletionDate()
	{
		return SRCompletionDate; 
	}
	public void setSRCompletionDate(Date _SRCompletionDate)
	{
		 this.SRCompletionDate = _SRCompletionDate ;
	}
    
	public String getSRPlanDuration()
	{
		return SRPlanDuration; 
	}
	public void setSRPlanDuration(String _SRPlanDuration)
	{
		 this.SRPlanDuration = _SRPlanDuration ;
	}
    
	public String getAllianceActionStatus()
	{
		return AllianceActionStatus; 
	}
	public void setAllianceActionStatus(String _AllianceActionStatus)
	{
		 this.AllianceActionStatus = _AllianceActionStatus ;
	}
    
	public boolean getSiteVisit()
	{
		return SiteVisit; 
	}
	public void setSiteVisit(boolean _SiteVisit)
	{
		 this.SiteVisit = _SiteVisit ;
	}
    
	public String getAllianceStatus()
	{
		return AllianceStatus; 
	}
	public void setAllianceStatus(String _AllianceStatus)
	{
		 this.AllianceStatus = _AllianceStatus ;
	}
    
	public String getAllianceRemark()
	{
		return AllianceRemark; 
	}
	public void setAllianceRemark(String _AllianceRemark)
	{
		 this.AllianceRemark = _AllianceRemark ;
	}
    
	public String getEPMCurrentStatus()
	{
		return EPMCurrentStatus; 
	}
	public void setEPMCurrentStatus(String _EPMCurrentStatus)
	{
		 this.EPMCurrentStatus = _EPMCurrentStatus ;
	}
    
	public double getApprovedMH()
	{
		return ApprovedMH; 
	}
	public void setApprovedMH(double _ApprovedMH)
	{
		 this.ApprovedMH = _ApprovedMH ;
	}
    
	public double getConsumedMH()
	{
		return ConsumedMH; 
	}
	public void setConsumedMH(double _ConsumedMH)
	{
		 this.ConsumedMH = _ConsumedMH ;
	}
    
	public double getRemainingMH()
	{
		return RemainingMH; 
	}
	public void setRemainingMH(double _RemainingMH)
	{
		 this.RemainingMH = _RemainingMH ;
	}
    
	public double getBudgetAwarded()
	{
		return BudgetAwarded; 
	}
	public void setBudgetAwarded(double _BudgetAwarded)
	{
		 this.BudgetAwarded = _BudgetAwarded ;
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
