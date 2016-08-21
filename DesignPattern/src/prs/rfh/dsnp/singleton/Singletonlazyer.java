package prs.rfh.dsnp.singleton;
/**
 * ถ๖บบ
 * @author Talent
 *
 */
public class Singletonlazyer {
	
	private static Singletonlazyer instance = new Singletonlazyer();
	
	private Singletonlazyer (){
		System.out.println("init....");
	}
	
	public static synchronized Singletonlazyer getInstance(){
		
		return instance;
		
	}
}
