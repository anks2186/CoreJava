import java.io.*;
class ReadKeyBoard
{
	public static void main(String args[])
	{
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
			isr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}