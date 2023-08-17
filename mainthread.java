
import java.util.Random;
class firstthread implements Runnable
{
public void run()
{
	try
	{

		int n;
		Random r= new Random();
		for(int i=1;i<=5;i++)
			{
				Thread.sleep(1000);
				n=r.nextInt(50);
				System.out.println(n);
				if(n%2==0)
					{
						secondthread se= new secondthread(n);
						Thread t2=new Thread(se);
						t2.start();
					}
			else
					{
						thirdthread te=new thirdthread(n);
						Thread t3=new Thread(te);
						t3.start();
					}
			}
	}
	catch(Exception e){}
}
}
class secondthread implements Runnable
{
	int n;
	secondthread(int n){
		this.n=n;
	}
	public void run()
	{
		System.out.println("THE NUMBER"+" "+n+" "+"IS EVEN THE SQUARE OF NUMBER IS:"+n*n);
	}
}
class thirdthread implements Runnable
{
	int n;
	thirdthread(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("THE NUMBER"+" "+n+" "+"IS ODD THE CUBE OF NUMBER IS:"+n*n*n);
	}
}


class mainthread
{
	public static void main(String args[])
	{
		firstthread f1=new firstthread();
		Thread t1=new Thread(f1);
		t1.start();
	}
}
