package prs.rfh.dsnp.iterator;

public interface List {

	Iterator iterator();
	
	int size();
	
	Object get(int index);
	
	void add(Object obj);
}
