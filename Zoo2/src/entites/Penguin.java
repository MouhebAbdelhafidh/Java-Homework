package entites;

public class Penguin extends Aquatic{

	private float SwimmingDepth;
	
	public Penguin(String family, int age, String name, boolean isMammal, int nbrLegs, String habitat, float SwimmingDepth) {
		super(family, age, name, isMammal, nbrLegs, habitat);
		this.SwimmingDepth = SwimmingDepth;
	}

	public float getSwimmingDepth() {
		return SwimmingDepth;
	}

	public void setSwimmingDepth(float swimmingDepth) {
		SwimmingDepth = swimmingDepth;
	}

	@Override
	public String toString() {
		return "Name: "+ getName() + " | Family: "+ getFamily() + "| Age: "+ getAge() + "| isMammal: "+ isMammal() + "| habitat: "+ getHabitat() + "| nbrLegs: "+ getNbrLegs() + "| SwimmingDepth: "+ SwimmingDepth;
		
	}

	@Override
	public void swim() {
		System.out.println("This penguin is swimming");
	}
	
	

}
