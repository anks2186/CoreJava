class MyCircle{

	int iR;
	float fArea;
	float fPeri;

	public void calcArea(){
		this.fArea = 3.14f*this.iR*this.iR;
	}

	public void calcPeri(){
		this.fPeri = 2*3.14f*iR;
	}	

}

public class Demo{

	public static void main(String args[])
	{
		MyCircle c1 = new MyCircle();

		c1.iR = 10;

		c1.calcArea();
		c1.calcPeri();

		System.out.println("Area = " + c1.fArea);
		System.out.println("Peri = " + c1.fPeri);
	}
}