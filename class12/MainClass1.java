abstract class Shape{
	abstract public void area();
}
class Tri extends Shape{
	float b,h;	
	float area(){
		return (0.5f*this.b*this.h);
	}
}
public class MainClass1{
	public static void main(String args[]){
		Tri t1 = new Tri();
		t1.b = 10.0;
		t1.h = 11.0;
		System.out.println(t1.area());
	}
}
