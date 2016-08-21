package prs.rfh.dsnp.visitor;

import java.util.Map;

public class MapElem implements Visiteable{
	Map elem;

	public Map getElem() {
		return elem;
	}

	public void setElem(Map elem) {
		this.elem = elem;
	}

	@Override
	public void visite(IVisite visitor) {
		// TODO Auto-generated method stub
		visitor.visitMap(this);
	}

	

}
