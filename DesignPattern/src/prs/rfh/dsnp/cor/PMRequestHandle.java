package prs.rfh.dsnp.cor;

public class PMRequestHandle implements RequestHandle{

	RequestHandle rh ;
	
	public PMRequestHandle(RequestHandle rh){
		this.rh = rh;
	}
	
	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request instanceof AddMoneyRequest){
			System.out.println("Ҫ��н����Ŀ��������");
		}else{
			rh.handleRequest(request);
		}
	}
	
}