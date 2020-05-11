package com.Tchakoura;

public class AutoPolicy {
  private int AccountNumbe;
  private String MakeAndModel;
  private String State;
  
public AutoPolicy(int accountNumbe, String makeAndModel, String state) {
	
	this.AccountNumbe = accountNumbe;
	this.MakeAndModel = makeAndModel;
	this.State = state;
}
public int getAccountNumbe() {
	return AccountNumbe;
}
public void setAccountNumbe(int accountNumbe) {
	AccountNumbe = accountNumbe;
}
public String getMakeAndModel() {
	return MakeAndModel;
}
public void setMakeAndModel(String makeAndModel) {
	MakeAndModel = makeAndModel;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
  
public boolean isNoFaultState() {  //predication is+Name to get the true/false
	boolean noFaultState;
	
	switch(getState()) {
	case " MA" :
	case " NJ" : 
	case " NY" :
	case " PA" :
		
		noFaultState = true;
		break;
		
	default:
			noFaultState = false;
			break;
	}
	return noFaultState;
}

public static void policyInNoFaultState(AutoPolicy policy) {
	System.out.println("The auto Policy");
	System.out.printf("Account# : %d; Car : %s; State :%s %s, a noFault State",
			policy.getAccountNumbe(), policy.getMakeAndModel(),
			policy.getState(), policy.isNoFaultState()? "is": "is not");
}
  
}
