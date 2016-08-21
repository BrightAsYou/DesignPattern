package prs.rfh.dsnp.visitor;

public class StringElem implements Visiteable{

	String elem;

	public String getElem() {
		return elem;
	}

	public void setElem(String elem) {
		this.elem = elem;
	}

	@Override
	public void visite(IVisite visitor) {
		// TODO Auto-generated method stub
		visitor.visitString(this);
	}

}
