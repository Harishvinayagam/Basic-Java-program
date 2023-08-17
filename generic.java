import java.util.*;
import java.io.*;
class generic{
public static void main(String s[])throws Exception{
DataInputStream ds=new DataInputStream(System.in);
System.out.print("Enter Total Number of Elements:");
int n=Integer.parseInt(ds.readLine());
genericop g=new genericop();
g.values(n);
}
}
class genericop{
DataInputStream ds=new DataInputStream(System.in);
public <T> void values(int n)throws Exception{
ArrayList<T> al=new ArrayList<T>(n);
for(int i=0;i<n;i++){
System.out.print("\nEnter Element "+(i+1)+":");
Object ele=ds.readLine();
al.add((T)ele);
}
Collections.sort(al,Collections.reverseOrder());
System.out.print("\nMaximum Element is:"+(al.get(0)));
System.out.println("\nMinimum Element is:"+(al.get(n-1)));
}
}
