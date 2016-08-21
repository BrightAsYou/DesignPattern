package prs.rfh.dsnp.factory;

public class TeacherWorkFactory implements IFactory {

	@Override
	public IWork getWork() {
		return new TeacherWork();
	}

}
