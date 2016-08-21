package prs.rfh.dsnp.singleton;
/**
 * ถ๖บบ
 * @author Talent
 *
 */
public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton (){
		System.out.println("init....");
	}
	
	public static synchronized Singleton getInstance(){
		if(instance!=null){
			return instance;
		}else{
			return instance = new Singleton();
		}
		
	}
}
