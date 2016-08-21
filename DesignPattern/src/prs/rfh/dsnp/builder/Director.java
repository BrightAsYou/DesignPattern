package prs.rfh.dsnp.builder;

public class Director {

	public Person ConcratePerson(HumanBuilder hb){
		hb.buildBody();
		hb.buildFoot();
		hb.buildHead();
		return hb.buildPerson();
	}
	
}
