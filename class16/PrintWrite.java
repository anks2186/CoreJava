import java.io.*;
class PrintWrite
{
	public static void main(String args[])
	{
		try
		{
//		    PrintStream ps = new PrintStream("");
			PrintWriter pw = new PrintWriter(System.out);
			pw.println(true);
			pw.println('A');
			pw.println(500);
			pw.println(4000000l);
			pw.println(12.34f);
			pw.println("Hello");
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
