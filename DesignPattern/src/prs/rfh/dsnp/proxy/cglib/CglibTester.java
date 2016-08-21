package prs.rfh.dsnp.proxy.cglib;

public class CglibTester {
	
	public static void main(String[] args) {
		
		CglibProxy cglib=new CglibProxy();
		PersonImpl bookCglib=(PersonImpl)cglib.getInstance(new PersonImpl());
		System.out.println(bookCglib.getPersonName());
		
	}
	
}
