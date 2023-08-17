import java.util.Scanner;
class insertionsorting{
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	operation o=new operation();
	System.out.println("Enter the number of elements:");
	int n=s.nextInt();
	int a[]= new int[n];
	System.out.println("Enter the array elements:");
	int i;
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Before sorted elements:");
	for(i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();

	o.sort(a);
}
}
class operation{
	static void sort(int arr[])
	{
		int i,temp;
		int j;
		int n=arr.length;
		/*for(i=1;i<n;i++)
		{
			temp=arr[i];
			j=i-1;
			while(j>=0 && temp<arr[j])
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}*/
		for(i=0;i<n;i++)
		{
			temp=arr[i];
			for(j=i;j>0&&temp<arr[j-1];j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
		System.out.println("After sorted elements:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}