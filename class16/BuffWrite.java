import java.io.*;
class BuffWrite
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw = new FileWriter("testoutput2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 1; i<10; i++)
			{
				bw.write("i="+i+"\n");
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}