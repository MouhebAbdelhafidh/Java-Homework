package entites;

public abstract class Aquatic extends Animal{

	private String habitat;
	private int nbrLegs;
	
	public Aquatic(String family, int age, String name, boolean isMammal, int nbrLegs, String habitat) {
		super(family, age, name, isMammal);
		this.habitat = habitat;
		this.nbrLegs = nbrLegs;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getNbrLegs() {
		return nbrLegs;
	}

	public void setNbrLegs(int nbrLegs) {
		this.nbrLegs = nbrLegs;
	}

	@Override
	public String toString() {
		return "Name: "+ getName() + " | Family: "+ getFamily() + "| Age: "+ getAge() + "| isMammal: "+ isMammal() + "| habitat: "+ habitat + "| nbrLegs: "+ nbrLegs;
		
	}
	
	 public abstract void swim();

}
