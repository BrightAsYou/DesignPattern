package prs.rfh.dsnp.observer;

public class BJCitizen extends Citizen{

	@Override
	public void sendMessage(String help) {
		setHelp(help);
		for(Policeman po:police){
			if("normal".equals(help)){
				System.out.println("Hey , i'am Peaking man , noting here !");
				po.action(this);
			}else{
				System.out.println("Hey , i'am Peaking man , help me before others!");
				po.action(this);
			}
		}
	}

}
