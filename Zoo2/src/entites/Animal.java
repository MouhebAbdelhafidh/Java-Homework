package entites;
public class Animal {

	private String family;
	private String name;
	private int age;
	private boolean isMammal;
	
	public Animal(String family, int age, String name, boolean isMammal) {
		this.family =  family;
		this.name  = name;
		this.age = age; 
		this.isMammal = isMammal;
	}
	
	@Override
	public String toString() {
		return "Name: "+ name + " | Family: "+ family + "| Age: "+ age + "| isMammal: "+ isMammal;
		
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0)
			this.age = age;
	}

	public boolean isMammal() {
		return isMammal;
	}

	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}

}
