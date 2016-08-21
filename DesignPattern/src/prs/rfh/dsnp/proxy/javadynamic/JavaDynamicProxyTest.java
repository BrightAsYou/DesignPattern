package prs.rfh.dsnp.proxy.javadynamic;

public class JavaDynamicProxyTest {
	
	public static void main(String[] args) {

		PersonProxy proxy = new PersonProxy();
		Person person = (Person)proxy.bind(new PersonImpl());
		System.out.println(person.getPersonAge());
		System.out.println(person.getPersonName());
	}
}
