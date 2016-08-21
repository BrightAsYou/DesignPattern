package prs.rfh.dsnp.factory;

public class StudentWorkFactory implements IFactory {

	@Override
	public IWork getWork() {
		return new StudentWork();
	}

}
