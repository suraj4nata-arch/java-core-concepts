package Polymorphism;

public class dynamic_polymorphism_animal_main 
{
	public static void main(String[] args) 
	{
		dynamic_polymorphism_animal_example d = new dynamic_polymorphism_dog_example();
				d.sound();
		
		dynamic_polymorphism_animal_example d1 = new dynamic_polymorphism_cat_example();
				d1.sound();
		
	}
}
