import java.util.Scanner;
public class ScannerTest{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		scan = scan.useDelimiter(";");
		String name = scan.nextLine();
		float f = scan.nextFloat();
		String s = scan.next();
		System.out.println(name+s+f);
		if(scan.hasNextInt()){
			System.out.println("I was there");
		}
	}
}