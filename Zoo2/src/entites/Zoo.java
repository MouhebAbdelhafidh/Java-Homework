package entites;
public class Zoo{

	private Animal[] animals;
	private Aquatic[] aquaticAnimals;
	private String name;
	private String city;
	final int NBR_CAGES = 25;
	private int nbrAnimals = 0;
	private int nbrAquaticAnimals = 0;
	
	
	public Zoo(String name, String city) {
		animals = new Animal[(NBR_CAGES)];
		aquaticAnimals = new Aquatic[(10)];
		this.name = name;
		this.city = city;
	}
	
	

	void displayZoo() {
		/**/
		System.out.println("Name: "+ name + " | City: "+ city + "| Number of cages: "+ NBR_CAGES);
	}
	
	@Override
	public String toString() {
		return "Name: "+ name + " | City: "+ city + "| Number of cages: "+ NBR_CAGES;
		
	}
	
	public boolean addAnimal(Animal animal) {
		
		if(!isZooFull()) {
			animals[nbrAnimals] = animal;
			nbrAnimals++;
			return true;
		}
		else
			return false;
		
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		if(name != "")
			this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getNbrAnimals() {
		return nbrAnimals;
	}



	



	public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
		this.aquaticAnimals = aquaticAnimals;
	}
	
	public void displayAnimals() {
		for(int i = 0; i < NBR_CAGES; i++) {System.out.println(animals[i]);}
		for(int j = 0; j < 10; j++) {System.out.println(aquaticAnimals[j]);}
	}
	
	public boolean searchForAnimal(Animal A) {
		for(int i = 0; i < NBR_CAGES; i++) {
			if(animals[i].getName() == A.getName()) {
				System.out.println("Animal found in cage number:" + (i+1));
				return true;
			}
		}
		return false;
	}
	
	boolean isZooFull() {
		return NBR_CAGES == nbrAnimals;
	}
	
	public static Zoo comparerZoo(Zoo z1, Zoo z2) {
		if(z1.nbrAnimals > z2.nbrAnimals)
			return z1;
		return z2;
	}
	
	public void addAquaticAnimal(Aquatic aquatic) {
		if(!isZooFull()) {
			aquaticAnimals[nbrAquaticAnimals] = aquatic;
			nbrAquaticAnimals++;
		}
		else
			System.out.println("! The Zoo is Full, You can't add a new aquatic animal !");

	}
	
	public void showSwim() {
		for(int i = 0; i < 10; i++)
			aquaticAnimals[i].swim();
	}
	
}
