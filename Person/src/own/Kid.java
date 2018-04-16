package own;

import Person.java;

public class Kid extends Person {

	private String School;

	public Gyerek(String school) {
		super();
		School = school;
	}

	@Override
	public String toString() {
		return "Kid [School=" + School + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
