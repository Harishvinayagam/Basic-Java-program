import java.util.Scanner;
class linearsearch{
public static void main(String args[])
{
try{
Scanner s= new Scanner(System.in);
int i;
System.out.println("Enter the number of elements:");
int n= s.nextInt();
int a[]= new int[n];
System.out.println("Enter the array elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the element to search");
int key= s.nextInt();
long start = System.nanoTime();
Thread.sleep(5000);
for(i=0;i<a.length;i++)
{
if(a[i]==key)
{
System.out.println("The element found at position:"+(i+1));
break;
}
}
if(i==n)
{
System.out.println("The element not found in the array");
}
long end = System.nanoTime();
long exe = (end-start);
double secs = exe/1_000_000_000;
System.out.println("Execution Time in Secs:"+secs);
}
catch(InterruptedException e){
}
}
}
