package prs.rfh.dsnp.abstrfactory;

public class BlackAnimalFactory implements IAnimalFactory{

	public ICat createCat(){
		return new BlackCat();
	}
	
	public IDog createDog(){
		return new BlackDog();
	}
}
