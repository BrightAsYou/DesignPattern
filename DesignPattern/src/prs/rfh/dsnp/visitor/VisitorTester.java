package prs.rfh.dsnp.visitor;

import java.util.HashMap;
import java.util.Map;

public class VisitorTester {

	public static void main(String[] args) {
		IVisite vis = new Visitor();
		
		IntElem ie = new IntElem();
		ie.setElem(1111);
		ie.visite(vis);
		
		StringElem se = new StringElem();
		se.setElem("fun");
		se.visite(vis);
		
		Map map = new HashMap();
		map.put("A", "sss");
		MapElem me = new MapElem();
		me.setElem(map);
		me.visite(vis);
		
		vis.visitInt(ie);
		vis.visitString(se);
		vis.visitMap(me);
		
	}
	
}
