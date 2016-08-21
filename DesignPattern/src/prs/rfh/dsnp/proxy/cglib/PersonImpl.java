package prs.rfh.dsnp.proxy.cglib;

public class PersonImpl {

	private String personName;
	private int personAge;
	
	public PersonImpl(){
		personAge = 15;
		personName = "Liming";
	}
	
	public String getPersonName() {
		
		return personName;
	}

	public int getPersonAge() {
		return personAge;
	}

}
