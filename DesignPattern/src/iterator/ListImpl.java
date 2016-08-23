package iterator;

public class ListImpl implements List{
	
	private Object [] list ;
	
	private int index;
	
	private int size;
	
	public ListImpl(){
		
		index = 0;
		size = 0;
		list = new Object[100];
	}

	@Override
	public Iterator iterator() {
		return new IteratorImpl(this);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return list[index];
	}

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		list[index++] = obj;
		size ++;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
