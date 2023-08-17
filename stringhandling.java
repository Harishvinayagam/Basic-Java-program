import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
class stringhandling
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
			int T=Integer.parseInt(r.readLine());
			for(int i=0;i<T;i++)
			{

				String s1="abcdefghijklmnopqrstuvwxyz";
				String s2= "zyxwvutsrqponmlkjihgfedcba";
				char[]az=s1.toCharArray();
				char[]za=s2.toCharArray();
				String s= r.readLine();
				char[]x=s.toCharArray();
			for(int j=0;j<s.length();j++){

				for(int k=0;k<26;k++){
					if(x[j]==az[k])
			      System.out.print(za[k]);
					     }
										}



			}
		}
		catch(Exception e){}
	}
}



