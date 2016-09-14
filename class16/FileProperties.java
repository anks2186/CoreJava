
import java.io.File;
class FileProperties
{
	public static void main(String args[])
	{
		File f1 = new File("//home//desaiankitb//Dropbox//core java//files//testoutput1.txt");
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.getParent());
		System.out.println(f1.exists());
		System.out.println(f1.canWrite());
		System.out.println(f1.canRead());
		System.out.println(f1.length());
		//System.out.println(f1.delete());
	}
}

/*
testOutput3.txt
C:\Users\Ankit\Desktop\orgnise\java\files\testOutput3.txt
C:\Users\Ankit\Desktop\orgnise\java\files
false
false
false
0
false
*/
/*
testOutput2.txt
C:\Users\Ankit\Desktop\orgnise\java\files\testOutput2.txt
C:\Users\Ankit\Desktop\orgnise\java\files
true
true
true
36
true*/
