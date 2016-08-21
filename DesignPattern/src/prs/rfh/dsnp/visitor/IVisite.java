package prs.rfh.dsnp.visitor;

public interface IVisite {

	public void visitString(StringElem elem);
	
	public void visitInt(IntElem elem);
	
	public void visitMap(MapElem elem);
	
	
//	public void visit(Visitor visitor){
//		visitor.visitInt(this);
//	}
}
