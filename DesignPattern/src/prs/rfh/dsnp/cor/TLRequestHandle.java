package prs.rfh.dsnp.cor;

public class TLRequestHandle implements RequestHandle{

	RequestHandle rh ;
	
	public TLRequestHandle(RequestHandle rh){
		this.rh = rh;
	}
	
	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request instanceof LeaveRequest){
			System.out.println("Ҫ��٣���Ŀ�鳤����");
		}else{
			rh.handleRequest(request);
		}
	}
	
}
