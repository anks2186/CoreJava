public class SuperTest{
	static{
		System.out.println("f");
	}
	public static void main(String args[]){
		Child c1 = new Child(1,1.0f,'c');
		Child c2 = new Child(1);
		Child c3 = new Child(1.0f);
		Child c4 = new Child('c');
		Child c5 = new Child();
		c1.displayAll();
		c2.displayAll();
		c3.displayAll();
		c4.displayAll();
		c5.displayAll();

	}
}
class Base{
	static{
		System.out.println("d");
	}
	Base(){
		this.x = -999;
		this.y = -99.99f;
		System.out.println("Base");
	}
	int x;
	float y;
	Base(int x, float y){
		this.x = x;
		this.y = y;
		System.out.println("a");
	}
	Base(int x){
		this(x,0);
		System.out.println("x");
	}
	Base(float y){
		this(0,y);
		System.out.println("y");
	}
	void displayAll(){
		System.out.println(this.x + " " + this.y);
	}
}

class Child extends Base{
	static{
		System.out.println("e");
	}	
	Child(){
		this.z = 'v';
		System.out.println("Child");
	}
	char z;
	Child(int x, float y,char z){
		super(x,y);
		this.z = z;
		System.out.println("z");
	}
	Child(int x){
		super(x);
		//this.z = '\u0000';
		this.z = 'u';
		System.out.println("p");
	}
	Child(float y){
		super(y);
		//this.z = '\u0000';
		this.z = 't';
		System.out.println("q");
	}
	Child(char z){
		this(0,0.0f,z);
		System.out.println("r");
	}
	void displayAll(){
		super.displayAll();
		System.out.println(this.z);
	}
}
