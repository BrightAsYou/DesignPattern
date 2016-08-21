package prs.rfh.dsnp.abstrfactory;

public class BlackCat implements ICat{
	
	BlackCat(){
		System.out.println("black cat created!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("BlackCat eating");
	}
}
