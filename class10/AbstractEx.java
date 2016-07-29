public class AbstractEx{
	public static void main(String args[]){
		//invalid because they all are abstract classes
		//it also does not make any sense to create objects of these types.		
		//Animal a1 = new Animal();
		//DomasticAnimal d1 = new DomasticAnimal();
		//WildAnimal w1 = new WildAnimal();

		Dog myDog = new Dog();
		//DomasticAnimal yourDog = new Dog();//valid
		//Animal herDog = new Dog();//valid
		myDog.pet();
		myDog.makeNoice();
		myDog.sleep();
		myDog.eat();
		
		Lion girLion1 = new Lion();
		//WildAnimal girLion2 = new Lion();//valid
		//Animal girLion3 = new Lion();//valid
		girLion1.hunt();
		girLion1.makeNoice();
		girLion1.sleep();
		girLion1.eat();
		
	}
}

abstract class Animal{
	int size;
	String color;
	Animal(){
		System.out.println("Animal");
	}
	public void sleep(){
		System.out.println("sleep");
	}
	public void eat(){
		System.out.println("eat");
	}
	abstract public void makeNoice();

}
abstract class DomasticAnimal extends Animal{
	DomasticAnimal(){
		System.out.println("Domastic Animal");
	}
	abstract public void pet();
}

abstract class WildAnimal extends Animal{
	abstract public void hunt();
}

class Dog extends DomasticAnimal{
	public void makeNoice(){
		System.out.println("Dog Bark");
	}
	public void pet(){
		System.out.println("Dog pet");
	}
	@Override
	public void sleep(){
		System.out.println("Dog Sleep");
	}
}

class Lion extends WildAnimal{
	public void makeNoice(){
		System.out.println("Lion roar");
	}
	public void hunt(){
		System.out.println("Lion Hunt");
	}
}
