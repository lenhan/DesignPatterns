package factory.abstr;

public class BirdsFactory extends AnimalFactory{

	@Override
	public Animal create(AnimalName animalName) {
		

		if(animalName == AnimalName.OWL){
			return new Owl();
		}
		return null;
	}

}
