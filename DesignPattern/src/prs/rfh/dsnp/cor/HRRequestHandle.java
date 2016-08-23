package prs.rfh.dsnp.cor;

public class HRRequestHandle implements RequestHandle{


	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request instanceof DemissionRequest){
			System.out.println("要离职人事审批");
		}
		System.out.println("请求完毕");
	}
	
}
