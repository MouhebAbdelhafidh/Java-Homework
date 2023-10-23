package main;
import entites.Zoo;
import entites.Animal;
import entites.Aquatic;
import entites.Dolphin;
import entites.Penguin;
public class main {
	
	public static void main(String[] args) {
		Animal a = new Animal("dd", 15, "ddd", true);
		Animal a1 = new Animal("bb", 5, "bbb", false);
		Animal a2 = new Animal("ss", 3, "sss", true);
		//Aquatic a3 = new Aquatic("dd", 15, "ddd", true, 0, "x");
		Penguin a4 = new Penguin("dd", 15, "ddd", true, 0, "x", 111);
		Aquatic a5 = new Dolphin("dd", 15, "ddd", true, 0, "x", (float) 111.5);
		
		Zoo z = new Zoo("Belvidaire", "Tunis");
		Zoo z1 = new Zoo("ff", "fff");
		//z.displayZoo();
		System.out.println(z.addAnimal(a));
		System.out.println(z.addAnimal(a1));
		System.out.println(z.addAnimal(a2));
		//z.addAquaticAnimal(a3);
		z.addAquaticAnimal(a4);
		z.addAquaticAnimal(a5);
		z.displayAnimals();
		//z.searchForAnimal(a);
		//System.out.println(Zoo.comparerZoo(z, z1));
		//a3.swim();
		a4.swim();
		a5.swim();
		//z.showSwim();
	}
}