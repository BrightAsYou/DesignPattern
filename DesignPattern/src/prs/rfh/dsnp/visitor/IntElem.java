package prs.rfh.dsnp.visitor;

public class IntElem implements Visiteable{

	int elem;

	public int getElem() {
		return elem;
	}

	public void setElem(int elem) {
		this.elem = elem;
	}
	

	@Override
	public void visite(IVisite visitor) {
		// TODO Auto-generated method stub
		visitor.visitInt(this);
	}

	
}
