package prs.rfh.dsnp.builder;


public class PersonBuilder implements HumanBuilder {

	private Person person;
	
	public PersonBuilder(){
		person = new Man();
	}
	
	public String buildBody(){
		return person.getBody();
	}
	
	public String buildHead(){
		return person.getHead();
	}
	
	public String buildFoot(){
		return person.getFoot();
	}
	
	public Person buildPerson(){
		return person;
	}
	
}
