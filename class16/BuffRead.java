import java.io.*;

class BuffRead
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr = new FileReader("testoutput2.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
