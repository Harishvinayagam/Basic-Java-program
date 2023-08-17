import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
interface enqueueop
{
	void enqueue();
}
interface dequeueop
{
	void dequeue();
}
interface displayop
{
	void display();
}
class queueop
{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	int max,front,rear;
	int queue[];
	queueop()
		{
			try
			{

				front=-1;
				rear=-1;
				System.out.println("ENTER THE SIZE OF QUEUE:");
				max=Integer.parseInt(r.readLine());
				queue= new int[max];
			}catch(Exception e){}
		}
	}

class queue extends queueop implements enqueueop,dequeueop,displayop
{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	public void enqueue()
	{
		try
		{

			int element;
			if(rear==(max-1))
			{
				System.out.println("QUEUE OVERFLOW");
			}
			else
			{
				if(front==-1)
				{
					front=0;
				}
				System.out.println("ENTER THE ELEMENT:");
				element=Integer.parseInt(r.readLine());
				rear=rear+1;
				queue[rear]=element;
			}
		}catch(Exception e){}

	}
	public void dequeue()
	{
		try
		{

			if(front==-1||front>rear)
			{
				System.out.println("QUEUE UNDERFLOW");
			}
			else
			{
				System.out.println("ELEMENT DELETED FROM QUEUE IS:"+queue[front]);
				front=front+1;
			}
		}catch(Exception e){}
	}
	public void display()
	{
		try
		{

			int i;
			if(front==-1)
			{
				System.out.println("QUEUE UNDERFLOW");
			}
			else
			{
				System.out.println("QUEUE IS:");
				for(i=front;i<=rear;i++)
				{
					System.out.println(""+queue[i]);
				}
			}
		}catch(Exception e){}
	}
}
class queueoperation
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

