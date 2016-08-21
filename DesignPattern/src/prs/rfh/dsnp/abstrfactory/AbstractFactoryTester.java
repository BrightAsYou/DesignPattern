package prs.rfh.dsnp.abstrfactory;

public class AbstractFactoryTester {

	public static void main(String[] args) {
		
		IAnimalFactory blcFac = new BlackAnimalFactory();
		blcFac.createCat().eat();
		blcFac.createDog().eat();
		
		
		IAnimalFactory whtFac = new WhiteAnimalFactory();
		whtFac.createCat().eat();
		whtFac.createDog().eat();
	}
	
}
