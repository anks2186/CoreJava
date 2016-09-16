import java.io.*;
class FileWrite
{
	public static void main(String args[]) throws Exception
	{
		FileWriter fw = new FileWriter("testoutput1.txt");
		for(int i = 1; i<10; i++)
		{
			fw.write("hello"+i);
		}
		fw.close();
	}
}
