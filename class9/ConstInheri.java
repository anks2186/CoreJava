public class ConstInheri{
	public static void main(String args[]){
		Hourse h1 = new Hourse();
	}
}
class Animal{
	Animal(){
		//super();
		System.out.println("Animal");
	}
}
class Hourse extends Animal{
	Hourse(){
		//super();
		System.out.println("Hourse");
	}
}
