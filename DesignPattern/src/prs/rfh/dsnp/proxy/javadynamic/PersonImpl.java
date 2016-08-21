package prs.rfh.dsnp.proxy.javadynamic;

public class PersonImpl implements Person {

	private String personName;
	private int personAge;
	
	public PersonImpl(){
		personAge = 15;
		personName = "Liming";
	}
	
	@Override
	public String getPersonName() {
		
		return personName;
	}

	@Override
	public int getPersonAge() {
		return personAge;
	}

}
