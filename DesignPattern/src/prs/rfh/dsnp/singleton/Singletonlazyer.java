package prs.rfh.dsnp.singleton;
/**
 * 饿汉
 * @author Talent
 *
 */
public class Singletonlazyer {
	
	private static Singletonlazyer instance = new Singletonlazyer();
	
	private Singletonlazyer (){
		System.out.println("init....");
	}
	
	public static Singletonlazyer getInstance(){
		
		return instance;
		
	}
}
