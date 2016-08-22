package prs.rfh.dsnp.mediator;

public class Mediator implements IMediator{

	ColleagueA ca ;
	ColleagueB cb ;
	
	public Mediator(){
		ca = new ColleagueA();
		cb = new ColleagueB();
	}
	
	@Override
	public void notice(String content) {
		// TODO Auto-generated method stub
		if("boss".equals(content)){
			ca.action();
		}else if("guke".equals(content)){
			cb.action();
		}
		
	}

}
