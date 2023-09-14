package factory.abstr;

public class MammalsFactory extends AnimalFactory{

	@Override
	public Animal create(AnimalName animalName) {
		
		

		if(animalName  == AnimalName.CAT){
			return new Cat();
		}else if(animalName  == AnimalName.FOX){
			return new Fox();
		}
		return null;
	}

}
