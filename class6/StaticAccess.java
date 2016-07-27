public class StaticAccess{

	static int i;
	int j;

	public static void main(String args[]){
		StaticAccess.i=10;
		StaticAccess ob = new StaticAccess();
		ob.j=20;
	}
	
	//public static void print(){
	//	System.out.println(StaticAccess.i);
	//}

	//public void printI(){
	//	System.out.println(StaticAccess.i);
	//}
}
