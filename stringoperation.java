

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class stringoperation
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			ArrayList<String> al= new ArrayList<String>();
			BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
			int ch;
			System.out.println("1.APPEND AT BEGIN\n2.INSERT\n3.INSERT AT PARTICULAR INDEX\n4.SEARCH\n5.STARTS AND ENDS WITH CHAR\n6.SORT IN REVERSE \n7.EXIT");
			System.out.println("ENTER YOUR CHOICE:");
			ch=Integer.parseInt(r.readLine());
			while(ch!=7)
			{
				switch(ch)
				{
					case 1:
					System.out.println("ENTER A STRING:");
					String st=r.readLine();
					al.add(0,st);
					break;
					case 2:
					System.out.println("ENTER A STRING TO INSERT:");
					String st4=r.readLine();
					al.add(st4);
					break;
					case 3:
					System.out.println("ENTER A STRING:");
					String st1=r.readLine();
					System.out.println("ENTER THE POSITION TO INSERT:");
					int pos=Integer.parseInt(r.readLine());
					al.add(pos,st1);
					break;
					case 4:
					System.out.println("ENTER A STRING TO SEARCH:");
					String st2=r.readLine();
					int n= al.indexOf(st2);
					if(n==-1)
					{
						System.out.println("STRING NOT FOUND");
					}
					else
					{
						System.out.println("STRING IS FOUND AT POSITION"+(n+1));
					}
					break;
					case 5:
					System.out.println("ENTER THE STRING:");
					String st3=r.readLine();
					for(int i=0;i<al.size();i++)
					{
						if(al.get(i).startsWith(st3))
						{
							System.out.println("THE STRING IS"+" "+al.get(i)+"STARTS WITH"+" "+st3);
						}
						else if(al.get(i).endsWith(st3))
						{
							System.out.println("THE STRING IS "+" "+al.get(i)+"ENDS WITH"+" "+st3);
						}
					}
					break;
					case 6:
					Collections.sort(al,Collections.reverseOrder());
					System.out.println(al);
					break;
					case 7:
					System.out.println("\t\t.............\t\t");
					System.out.println("EXIT");
					System.exit(0);
				}
				System.out.println("ENTER YOUR CHOICE:");
				ch=Integer.parseInt(r.readLine());
			}
		}
		catch(Exception e){}
	}
}




