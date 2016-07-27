class Test{

	static int i;
	int j;

	static{
		i=20;
		System.out.println("When am I?: static{Test}");
	}

}


public class StaticDemo{
	private static int test;	
	public static void main(String args[]){
		
		System.out.println("When am I?: main()");		
		Test ob = new Test();
	}
	/*private static void initStatic(){
		StaticDemo.test = 20;
	}*/
	static{
		test = 10;
		System.out.println("When am I?: static{2}");
	}
	static{
		test = 30;
		System.out.println("When am I?: static{1}");
	}
}
