package prs.rfh.dsnp.cor;

public class HRRequestHandle implements RequestHandle{


	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request instanceof DemissionRequest){
			System.out.println("Ҫ��ְ��������");
		}
		System.out.println("�������");
	}
	
}
