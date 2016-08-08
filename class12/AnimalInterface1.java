abstract class Animal{
	public void sleep(){
	}
	abstract public void makeNoise();
	abstract public void eat();
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
	public void beFriendly(){
	}
	public void play(){
	}
}
class Lion extends WAnimal{
	public void makeNoise(){
	}
	public void eat(){
	}
}


Animal a1 = new Dog();
a1.beFriendly();


interface Pet{
	void beFriendly();
	abstract public void play();
}

class Dog extends Animal implements Pet{

}


interface x extends y,z{

}
class A extends B implements x,p,q,r{

}
