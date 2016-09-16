import java.io.*;
class FileRead
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr = new FileReader("testoutput1.txt");
		int i;
		while( ( i = fr.read() ) != -1 )
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}