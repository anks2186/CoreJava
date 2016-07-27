

public class Demo{

	public static void main(String args[])
	{
		MyCircle c1 = new MyCircle(10);

		MyCircle c2 = new MyCircle();

		c2.setIR(20);


		c1.calcArea();
		c1.calcPeri();

//		float x = 
		float y = c1.getFPeri();
		System.out.println("Area = " + c1.getFArea());
		System.out.println("Peri = " + y);
	}
}
