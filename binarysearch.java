import java.util.Scanner;
class binarysearch{
public static void main(String args[]) {
Scanner s= new Scanner(System.in);
opera o = new opera();
System.out.println("Enter number of elements:");
int n= s.nextInt();
int a[]= new int[n];
System.out.println("Enter the array elements:");
int i;
for(i=0;i<n;i++) {
a[i]=s.nextInt();
} System.out.println("Enter the element to search:");
int key= s.nextInt();
int lb=0;
int ub= a.length-1;
o.search(a,lb,ub,key);
}
}
class opera{
static void search(int arr[],int lb,int ub,int key) {
long start = System.nanoTime();
while(lb<=ub)
{
int mid=(lb+ub)/2;
if(arr[mid]==key) {
System.out.println("Element is found at position:"+(mid+1));
break;
}
else if
(arr[mid]<key){
lb=mid+1;
}
else if(arr[mid]>key) {
ub=mid-1;
}
}
if(lb>ub){
System.out.println("Element not found");
}
long end = System.nanoTime();
long execution = (end - start);
double secs= (double)execution/1_000_000;
System.out.println("Execution time is"+" "+secs);
}
}
