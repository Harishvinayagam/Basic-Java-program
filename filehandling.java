

import java.io.*;
class filehandling
{
	public static void main(String args[])
	{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		try
		{

			FileWriter fw=new FileWriter("INFILE.txt");
			FileWriter fw1=new FileWriter("OUTFILE.txt");
			System.out.println("Enter number of Students:");
			int n=Integer.parseInt(r.readLine());
			int c=0;
			String r1="";
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Student"+(i+1)+"Name:");
				String str=r.readLine();
				fw.write(str+"\n");
			}
			fw.close();
			FileReader fr=new FileReader("INFILE.txt");
			for(int i=0;i<n;i++)
			{
				c=fr.read();
				while(c!=-1)
				{
					r1=String.valueOf((char)c).toLowerCase();
					fw1.write(r1);
					c=fr.read();
				}
			}
			fw1.close();
		}
		catch(Exception ie)
		{
			System.out.println(ie);
		}
	}
}


