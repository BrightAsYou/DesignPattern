package prs.rfh.dsnp.abstrfactory;

public class WhiteDog implements IDog{
	
	WhiteDog(){
		System.out.println("white dog created!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("WhiteDog eating");
	}
}
