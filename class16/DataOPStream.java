import java.io.*;
class DataOPStream
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("testOutput3.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeByte(1);
		dos.writeChar('a');
		fos.close();
	}
}