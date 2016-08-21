package prs.rfh.dsnp.prototype;

public class Client {

	public static void main(String[] args) {
		
		Prototype pro = new ConcretePrototype("pro1");
		Prototype pro2 = (Prototype)pro.clone();
		
		System.out.println(pro.getName());
		System.out.println(pro2.getName());
		pro.setName("123");
		System.out.println(pro.getName());
		System.out.println(pro2.getName());
		System.out.println(pro.getName().hashCode());
		System.out.println(pro2.getName().hashCode());
	}
	
}
