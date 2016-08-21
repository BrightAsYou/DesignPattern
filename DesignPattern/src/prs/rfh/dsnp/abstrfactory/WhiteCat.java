package prs.rfh.dsnp.abstrfactory;

public class WhiteCat implements ICat{
	
	WhiteCat(){
		System.out.println("white cat created!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("White Cat eating");
	}
}
