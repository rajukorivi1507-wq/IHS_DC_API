package in.ashokit.service;

import java.util.Map;

import in.ashokit.bindings.DcSummary;
import in.ashokit.bindings.Education;
import in.ashokit.bindings.Income;
import in.ashokit.bindings.Kids;
import in.ashokit.bindings.PlanSelection;

public interface DcService {

	public Long loadCasenum(Intefer appId);
	public List<String> getPlanNames;
	public Long savePlanSelection(PlanSelection planselection);
	public Long saveIncomeData(Income income);
	public Long saveEducation(Education education);
	public Long saveChildrens(List<Child> childs);
	public DcSummary getSummary(Long caseNumber);


	
   ======================================================
	public Map<Integer, String> getPlans();
	public boolean savePlanSelection(PlanSelection planSel);
	public boolean saveIncome(Income income);
	public boolean saveEducation(Education education);
	public boolean saveKids(Kids kids);
	public DcSummary fetchSummaryInfo(Long caseNum);

}

public Class DcServiceImpl implements DCservice  {

	public Long loadCasenum(Intefer appId){
		
      // DCaseRepo => public DcaseEntity findByAppId(Integer appId);
		
		DcCaseEntity findById= dccaseRepo.findByAppId(appId);
	    if(findById!=null){
			return findByAppId.getCaseNum();
		}
	return null;
	}
	public List<String> getPlanNames{
		
	}
	public Long savePlanSelection(PlanSelection planselection){
		
	}
	public Long saveIncomeData(Income income){
		
	}
	public Long saveEducation(Education education){
		
	}
	public Long saveChildrens(List<Child> childs){
		
	}
	public DcSummary getSummary(Long caseNumber){
		
	}


	
   ======================================================
	public Map<Integer, String> getPlans();
	public boolean savePlanSelection(PlanSelection planSel);
	public boolean saveIncome(Income income);
	public boolean saveEducation(Education education);
	public boolean saveKids(Kids kids);
	public DcSummary fetchSummaryInfo(Long caseNum);

}














