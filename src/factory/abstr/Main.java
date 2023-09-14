package factory.abstr;

public class Main {

	public static void main(String[] args) {
		
		AnimalFactory factory = new BirdsFactory();
		
		Animal owl = factory.create(AnimalName.OWL);
		owl.display();

		factory = new MammalsFactory();
		
		Animal fox = factory.create(AnimalName.FOX);
		fox.display();

	}

}
