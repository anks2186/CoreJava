import java.io.*;
class DataIPStream
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = new FileInputStream("testOutput3.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		fis.close();
	}
}