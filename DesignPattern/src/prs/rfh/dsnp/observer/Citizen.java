package prs.rfh.dsnp.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Citizen {
	
	List<Policeman> police;
	
	String help;

	public List getPolice() {
		return police;
	}

	public void setPolice() {
		this.police = new ArrayList();
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}
	
	public abstract void sendMessage(String help);
	
	public void registePolice(Policeman po){
		police.add(po);
	}
	
	public void unRegistePoliceman(Policeman po){
		police.remove(po);
	}
	
}
