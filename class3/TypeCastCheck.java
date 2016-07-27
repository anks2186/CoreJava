public class TypeCastCheck{

	public static void main(String args[]){
		
		Demo d1 = new Demo();

		System.out.println(d1.b);
		
	}
}

class Demo{
	MyCircle c1;
	boolean b;
}

class MyCircle{

	private	int iR;
	private long lR;

	public void setIR(int iR){
		System.out.println("int called");
		this.iR = iR;
	}

	public void setIR(long lR){
		System.out.println("long called");
		this.lR = lR;
	}

	/*public int getIR(){
		return this.iR;
	}*/

	public long getIR(){
		return this.lR;
	}

}
