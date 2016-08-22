package prs.rfh.dsnp.observer;

public class SHCitizen extends Citizen{

	@Override
	public void sendMessage(String help) {
		setHelp(help);
		for(Policeman po:police){
			if("normal".equals(help)){
				System.out.println("Hey , i'am sh man ， noting here !");
				po.action(this);
			}else{
				System.out.println("Hey , i'am sh man ， help me before bj man!");
				po.action(this);
			}
		}
	}

}
