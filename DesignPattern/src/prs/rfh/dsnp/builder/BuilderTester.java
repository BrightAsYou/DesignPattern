package prs.rfh.dsnp.builder;

public class BuilderTester {

	public static void main(String[] args) {
		
		Director dir = new Director();
		dir.ConcratePerson(new PersonBuilder());
	}
	
}
