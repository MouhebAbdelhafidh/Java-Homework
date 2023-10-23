package entites;

public class Dolphin extends Aquatic{

	private float swimmingSpeed;
	
	public Dolphin(String family, int age, String name, boolean isMammal, int nbrLegs, String habitat, float swimmingSpeed) {
		super(family, age, name, isMammal, nbrLegs, habitat);
		this.swimmingSpeed = swimmingSpeed;
	}
	public float getSwimmingSpeed() {
		return swimmingSpeed;
	}
	public void setSwimmingSpeed(float swimmingSpeed) {
		this.swimmingSpeed = swimmingSpeed;
	}

	@Override
	public String toString() {
		return "Name: "+ getName() + " | Family: "+ getFamily() + "| Age: "+ getAge() + "| isMammal: "+ isMammal() + "| habitat: "+ getHabitat() + "| nbrLegs: "+ getNbrLegs() + "| swimmingSpeed: "+ swimmingSpeed;
		
	}
	
	public void swim() {
		System.out.println("This dolphin is swimming");
	}

}
