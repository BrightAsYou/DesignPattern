package prs.rfh.dsnp.memto;

public class MemEntyTester {
	
	public static void main(String[] args) {
		Originator org = new Originator();
		org.setState("coding");
		MemHolder mh = new MemHolder();
		mh.setMem(org.createMementy());
		
		org.getMemState();
		
		org.setState("sleeping");
		org.getMemState();
		
		org.setMementy(mh.getMem());
		org.getMemState();
		
	}
}
