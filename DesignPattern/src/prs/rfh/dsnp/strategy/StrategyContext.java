package prs.rfh.dsnp.strategy;

public class StrategyContext {
	
	IStrategy istr;
	
	public StrategyContext(IStrategy is){
		this.istr = is;
	}
	
	public void doMethod(){
		istr.execute();
	}
	
}
