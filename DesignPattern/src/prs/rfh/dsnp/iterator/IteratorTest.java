package prs.rfh.dsnp.iterator;

public class IteratorTest {
	public static void main(String[] args) {
		
		List list = new ListImpl();
		list.add("123");
		list.add("abc");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
