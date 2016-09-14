import java.io.File;
class Directory
{
	public static void main(String args[])
	{
		String dirName = "/home/desaiankitb/Dropbox/core java/files/testDir";
		File f1 = new File(dirName);
		
		if(f1.isDirectory())
		{
			System.out.println(dirName + " is a directory");
			String s[] = f1.list();
			for(int i=0; i<s.length; i++)
			{
				File f = new File(dirName + "/" + s[i]);
				if(f.isDirectory())
				{
					System.out.println(s[i] + " is a directory");
				}
				else
				{
					System.out.println(s[i] + " is a file");
				}
			}
		}
		else
			System.out.println(dirName + " is not a directory");
	}
}
