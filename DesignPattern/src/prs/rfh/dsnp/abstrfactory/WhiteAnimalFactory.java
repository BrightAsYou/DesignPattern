package prs.rfh.dsnp.abstrfactory;

public class WhiteAnimalFactory implements IAnimalFactory{

	public ICat createCat(){
		return new WhiteCat();
	}
	
	public IDog createDog(){
		return new  WhiteDog();
	}
}
