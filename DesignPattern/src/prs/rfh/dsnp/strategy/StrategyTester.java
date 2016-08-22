package prs.rfh.dsnp.strategy;

public class StrategyTester {
	public static void main(String[] args) {
		
		StrategyContext sca = new StrategyContext(new StrategyA());
		StrategyContext scb = new StrategyContext(new StrategyB());
		StrategyContext scc = new StrategyContext(new StrategyC());
		
		sca.doMethod();
		scb.doMethod();
		scc.doMethod();
		
	}
}
