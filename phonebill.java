import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class phonebill {
	public static void main(String args[]) throws IOException
	{

			BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
								try
								{
									System.out.println(	"PHONE BILL DETAILS");
									System.out.println("ENTER THE CUSTOMER NAME:");
									String s=r.readLine();
									System.out.println("ENTER THE CUSTOMER NUMBER:");
									long l=Long.parseLong(r.readLine());
									System.out.println("ENTER THE NUMBER OF CALLS:");
									int c=Integer.parseInt(r.readLine());
									if(0>c&&c<=99)
									{
										System.out.println("THE PHONE BILL IS:"+50);
									}
									else if(100>=c&&c<=199)
									{
										System.out.println("THE PHONE BILL IS:"+(c*0.50));
									}
									else if(200>=c&&c<=299)
									{
										System.out.println("THE PHONE BILL IS:"+(c*0.75));
									}
									else if(c>=300)
									{
										System.out.println("THE PHONE BILL IS:"+(c*1));
									}
								}
								catch(NumberFormatException e){
									System.out.println("Enter integer data");}
							}
						}
