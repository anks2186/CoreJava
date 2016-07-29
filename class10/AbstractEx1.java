abstract class Animal{
	int size;
	String color;
	Animal(){
		System.out.println("Animal");
	}
	public void eat(){
		System.out.println("eat");		
	}
	public void sleep(){
		System.out.println("sleep");
	}
	abstract public void makeNoice();
}
abstract class DAnimal extends Animal{
	DAnimal(){
		System.out.println("DAnimal");
	}
	public void beFriendly(){
		System.out.println("DAnimal BFriendly");
	}
}
class Dog extends DAnimal{
	Dog(){
		System.out.println("Dog");
	}
	@Override
	public void makeNoice(){
		System.out.println("Bark");
	}
}

abstract class WAnimal extends Animal{
	WAnimal(){
		System.out.println("WAnimal");
	}
	public void hunt(){
		System.out.println("WAnimal Hunt");
	}
}

class Lion extends WAnimal{
	Lion(){
		System.out.println("Lion");
	}
	@Override
	public void makeNoice(){
		System.out.println("Roar");
	}
}
public class AbstractEx1{
	public static void main(String args[]){
		Dog myDog = new Dog();
		myDog.sleep();
		myDog.eat();
		myDog.makeNoice();
		myDog.beFriendly();
	}
}




