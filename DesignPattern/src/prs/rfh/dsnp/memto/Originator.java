package prs.rfh.dsnp.memto;

public class Originator {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public MemEnty createMementy(){
		return new MemEnty(state);
	}
	
	public void setMementy(MemEnty mem){
		state = mem.getState();
	}
	
	public String getMemState(){
		System.out.println(state);
		return state;
	}
}
