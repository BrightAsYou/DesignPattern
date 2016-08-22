package prs.rfh.dsnp.observer;

public class SHPoliceman implements Policeman{

	@Override
	public void action(Citizen ciz) {
		// TODO Auto-generated method stub
		String help = ciz.getHelp();
		if("normal".equals(help)){
			System.out.println("nothing,--sh");
			
		}else{
			System.out.println("hiahiahia,--sh");
		}
		
	}

}
