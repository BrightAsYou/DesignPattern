package iterator;

public class IteratorImpl implements Iterator{
	
	private List list;
	
	int index ;
	
	public IteratorImpl(List list){
		index = 0;
		this.list =  list;
	} 
	

	@Override
	public void first() {
		// TODO Auto-generated method stub
		index = 0;
	}

	@Override
	public void last() {
		// TODO Auto-generated method stub
		index = list.size()-1;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(list.size()<=index)return false;
		return true;
	}


	@Override
	public Object next() {
		Object obj = list.get(index);
		index++;
		return obj;
	}
	
}
