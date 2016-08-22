package prs.rfh.dsnp.observer;

public class BJPoliceman implements Policeman{

	@Override
	public void action(Citizen ciz) {
		// TODO Auto-generated method stub
				String help = ciz.getHelp();
				if("normal".equals(help)){
					System.out.println("nothing,--bj");
					
				}else{
					System.out.println("hiahiahia,--bj");
				}
				
		
	}

}
