package prs.rfh.dsnp.visitor;

public class Visitor implements IVisite{


	@Override
	public void visitString(StringElem elem) {
		// TODO Auto-generated method stub
		System.out.println(elem.getElem());
	}

	@Override
	public void visitInt(IntElem elem) {
		// TODO Auto-generated method stub
		System.out.println(elem.getElem());
	}

	@Override
	public void visitMap(MapElem elem) {
		// TODO Auto-generated method stub
		System.out.println(elem.getElem());
	}

	
	
}
