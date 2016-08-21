package prs.rfh.dsnp.singleton;

public class SingletonTester {
	public static void main(String[] args) {
		//懒汉
//		Singleton sin = Singleton.getInstance();
//		Singleton sin2 = Singleton.getInstance();
//		Singleton sin3 = Singleton.getInstance();
//		System.out.println(sin==sin2);
//		System.out.println(sin3==sin2);
//		System.out.println(sin==sin3);
		
		//饿汉
		Singletonlazyer sin = Singletonlazyer.getInstance();
		Singletonlazyer sin2 = Singletonlazyer.getInstance();
		Singletonlazyer sin3 = Singletonlazyer.getInstance();
		System.out.println(sin==sin2);
		System.out.println(sin3==sin2);
		System.out.println(sin==sin3);
		
	}
}
