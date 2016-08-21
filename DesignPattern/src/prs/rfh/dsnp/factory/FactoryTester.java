package prs.rfh.dsnp.factory;

public class FactoryTester {
 
	
	/**
	 * 说真的,这东西真难用，没人会用吧
	 * 缺点：每一个产品都要新建一个对应的工厂与之对应，耦合太严重了，应该抽象出来的，类似建造者模式的构造器传参，这样可以只建立一个工厂
	 * @param args
	 */
	public static void main(String[] args) {
		
		IFactory fac = new TeacherWorkFactory();
		IWork tw = fac.getWork();
		tw.doWork();
		
		IFactory fac1 = new StudentWorkFactory();
		fac1.getWork();
		IWork sw = fac1.getWork();
		sw.doWork();
	}
	
}
