package prs.rfh.dsnp.observer;

public class ObserverTester {

	public static void main(String[] args) {
		Policeman bjpo = new BJPoliceman();
		Policeman shpo = new SHPoliceman();
		Citizen bjciz = new BJCitizen();
		bjciz.setPolice();
		bjciz.registePolice(bjpo);
		bjciz.registePolice(shpo);
		bjciz.sendMessage("normal");
		bjciz.sendMessage("agent");
		
//		Policeman bjpo = new BJPoliceman();
//		Policeman shpo = new SHPoliceman();
		Citizen shciz = new SHCitizen();
		shciz.setPolice();
		shciz.registePolice(bjpo);
		shciz.registePolice(shpo);
		shciz.sendMessage("normal");
		shciz.sendMessage("agent");
		
	}
	
}
