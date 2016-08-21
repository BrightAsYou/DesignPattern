package prs.rfh.dsnp.abstrfactory;

public class BlackDog implements IDog{
	
	BlackDog(){
		System.out.println("black dog created!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("BlackDog eating");
	}
}
