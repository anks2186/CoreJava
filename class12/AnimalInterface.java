abstract class Animal{
	abstract public void makeNoise();
	abstract public void eat();
	public void sleep(){
	}
	abstract public void roam();
}
abstract class WAnimal extends Animal{
	public void roam(){
	}
}
abstract class DAnimal extends Animal{
	public void roam(){
	}
}
class Dog extends DAnimal{
	public void makeNoise(){
	}
	public void eat(){
	}
}
class Lion extends WAnimal{
	public void makeNoise(){
	}
	public void eat(){
	}
}

//Pet-App
//two methods needed. 
/*
1. public void beFriendly()
2. public void play()
*/
//where to put them?
//opt1. put all pet methods with body in Animal class - problem - Even Lion will be friendly and it has to play
//opt2. put all pet methods without body in Animal class - problem - Even Lion has to impliment the abstract methods of pet.
//opt3. put all pet methods only in Dog class - problem - you can not call myDog.beFriendly() by an Animal class reference. myDog has to be the reference of Dog - violation of polymorphism - parent does not know about child's behaviour. 


abstract class Pet{
	abstract public void beFriendly();
	abstract public void play();
}
class Dog extends Pet, Animal{ //multiple inheritance is not allowed. 

}

//solution.
public interface Pet{
	abstract public void beFriendly();
	abstract public void play();
}
class Dog extends Animal implements Pet{
	@Override
	public void beFriendly(){
	}
	@Override
	public void play(){
	}
}