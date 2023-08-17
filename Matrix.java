import java.util.*;
class Matrix
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
oper o=new oper();
System.out.print("Enter the number of rows of Matrix A:");
o.r1=s.nextInt();
System.out.print("Enter the number of columns of Matrix A:");
o.c1=s.nextInt();
o.r2=o.c1;
System.out.print("Enter the number of columns of Matrix B:");
o.c2=s.nextInt();
o.resmat();
}
}
class oper
{
int r1,c1,r2,c2,i,j,k;
Scanner s1=new Scanner(System.in);
void resmat()
{
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c2];
System.out.println("Enter the elements of Matrix A....");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j]=s1.nextInt();
}
}
System.out.println("Enter the elements of Matrix B....");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=s1.nextInt();
}
}
System.out.println("The Product of two matrix is....");
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
c[i][j]=0;
for(k=0;k<c1;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+"  ");
}
System.out.println();
}
}
}
