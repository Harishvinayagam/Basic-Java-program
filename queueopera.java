import operations.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class queueopera
{
	public static void main(String a[]) throws IOException
	{

		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int ch;
		queue q= new queue();
		System.out.println("1.ENQUEUE\n2.DEQUEUE\n3.DISPLAY\n4.EXIT");
		System.out.println("ENTER YOUR CHOICE:");
		ch=Integer.parseInt(r.readLine());
		while(ch!=4)
		{
			switch(ch)
			{
				case 1:
				q.enqueue();
				break;
				case 2:
				q.dequeue();
				break;
				case 3:
				q.display();
				break;
				case 4:
				System.exit(0);
				default:
				System.out.println("WRONG CHOICE");
			}
			System.out.println("DO YOU WANT TO REPEAT:");
			ch=Integer.parseInt(r.readLine());
		}
	}
}

