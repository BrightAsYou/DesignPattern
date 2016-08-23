package prs.rfh.dsnp.cor;

public class CORTester {
	
	public static void main(String[] args) {
		Request lev = new LeaveRequest();
		Request dim = new DemissionRequest();
		Request add = new AddMoneyRequest();
		
		RequestHandle hr = new HRRequestHandle();
		RequestHandle pm = new PMRequestHandle(hr);
		RequestHandle tl = new TLRequestHandle(pm);
		
//		tl.handleRequest(lev);
//		
//		tl.handleRequest(dim);
//		
		tl.handleRequest(add);
		
//		tl.handleRequest(lev);
		
	}
	
}
