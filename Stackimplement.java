import java.util.Scanner;
import java.lang.*;
class stack{
	int max;
	int top;
	int a[];
	Scanner s=new Scanner(System.in);
	boolean isEmpty()
	{
		return(top<0);
	}
	stack()
	{

		System.out.println("Enter size of stack:");
		max=s.nextInt();
		a=new int[max];
		top=-1;

	}
	stack(int x1)
	{
		max = x1;
	}
	boolean push(int x)
	{
		if(top>=(max-1))
		{
			System.out.println("Stack overflow");
			return false;
		}
		else{
			a[++top]= x;

			//System.out.println(x);
			return true;
		}
	}
	int pop()
	{
		if (isEmpty())

		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			int x= a[top--];
			return x;
		}
	}
	int peek()
	{
		if(top<0)
				{
					System.out.println("Stack underflow");
					return 0;
				}
				else
				{
					int x= a[top];
					return x;
		}
}
	void print()
	{
		if(top<0)
		{
			System.out.println("_________________");
			System.out.println("stack is empty");
			System.out.println("_________________");
		}
		else
		{
		for(int i=top;i>-1;i--)
		{
			if(i==top)
			{
				System.out.println("_________________");
			}
			System.out.print(" "+a[i]);
			System.out.println("\n________________");
		}
		System.out.println();
	}
	}
}
class Stackimplement
{
public static void main(String args[])
{
stack s1=new stack();
Scanner s= new Scanner(System.in);
System.out.println("\n1.push\n2.pop\n3.peek\n4.display\n5.exit");
System.out.println("Enter your choice");
int choice= s.nextInt();
do{
switch(choice)
{
	case 1:
	System.out.println("Enter element for insertion");
	int n=s.nextInt();
	System.out.println("the elements pushed are");
	s1.push(n);
	s1.print();
	break;
	case 2:
	int x=s1.pop();

	System.out.println(x+"popped from stack");

	break;
	case 3:
		int x1=s1.peek();
		System.out.println("Top element is:"+x1);
		break;

	case 4:
	System.out.println("Elements present in stack:");
	s1.print();
	break;
	case 5:
	System.exit(0);
	default:
	System.out.println("You have entered wrong choice");
}
System.out.println("Do you want to repeat:");
choice=s.nextInt();
}
while(choice!=5);
}
}