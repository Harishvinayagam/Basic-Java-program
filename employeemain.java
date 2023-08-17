import java.util.Scanner;
class employee
{
String address;
String emp_name,mail_id;
int emp_id,bp;
long mobile_no;
void get()
{
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE EMPLOYEE NAME:");
emp_name= s.next();
System.out.println("ENTER THE EMPLOYEE ID");
emp_id=s.nextInt();
System.out.println("ENTER THE EMPLOYEE ADDRESS:");
address=s.next();
System.out.println("ENTER THE EMPLOYEE MAIL ID:");
mail_id=s.next();
System.out.println("ENTER THE MOBILE NUMBER:");
mobile_no=s.nextLong();
System.out.println("ENTER THE BASIC PAY:");
bp=s.nextInt();
}
}
class programmer extends employee
{

double ns,gs,ded,da,hra,pf,scf;
void calc()
{
da=0.97*bp;
hra=0.1*bp;
pf=0.12*bp;
scf=0.01*bp;
ded=pf+scf;
gs=bp+hra+da;
ns=gs-ded;
}
void print()
{
System.out.println("\n");
System.out.println("PROGRAMMER SALARY DETAILS");
System.out.println("EMPLOYEE NAME:"+emp_name);
System.out.println("EMPLOYEE ID:"+emp_id);
System.out.println("EMPLOYEE ADDRESS:"+address);
System.out.println("EMPLOYEE MAIL ID:"+mail_id);
System.out.println("EMPLOYEE MOBILE NO:"+mobile_no);
System.out.println("EMPLOYEE GROSS SALARY:"+gs);
System.out.println("EMPLOYEE NET SALARY:"+ns);
}
}
class assistantprofessor extends employee
{
double ns,gs,ded,da,hra,pf,scf;
void calc()
{
da=0.89*bp;
hra=0.2*bp;
pf=0.15*bp;
scf=0.01*bp;
ded=pf+scf;
gs=bp+hra+da;
ns=gs-ded;
}
void print()
{
System.out.println("\n");
System.out.println("ASSISTANT PROFESSOR SALARY DETAILS");
System.out.println("EMPLOYEE NAME:"+emp_name);
System.out.println("EMPLOYEE ID:"+emp_id);
System.out.println("EMPLOYEE ADDRESS:"+address);
System.out.println("EMPLOYEE MAIL ID:"+mail_id);
System.out.println("EMPLOYEE MOBILE NO:"+mobile_no);
System.out.println("EMPLOYEE GROSS SALARY:"+gs);
System.out.println("EMPLOYEE NET SALARY:"+ns);
}
}
class associateprofessor extends employee
{
double ns,gs,ded,da,hra,pf,scf;
void calc()
{
da=0.78*bp;
hra=0.3*bp;
pf=0.20*bp;
scf=0.01*bp;
ded=pf+scf;
gs=bp+hra+da;
ns=gs-ded;
}
void print()
{
System.out.println("\n");
System.out.println("ASSOCIATE PROFESSOR SALARY DETAILS");
System.out.println("EMPLOYEE NAME:"+emp_name);
System.out.println("EMPLOYEE ID:"+emp_id);
System.out.println("EMPLOYEE ADDRESS:"+address);
System.out.println("EMPLOYEE MAIL ID:"+mail_id);
System.out.println("EMPLOYEE MOBILE NO:"+mobile_no);
System.out.println("EMPLOYEE GROSS SALARY:"+gs);
System.out.println("EMPLOYEE NET SALARY:"+ns);
}
}
class professor extends employee
{
double ns,gs,ded,da,hra,pf,scf;
void calc()
{
da=0.88*bp;
hra=0.4*bp;
pf=0.30*bp;
scf=0.01*bp;
ded=pf+scf;
gs=bp+hra+da;
ns=gs-ded;
}
void print()
{
System.out.println("\n");
System.out.println(" PROFESSOR SALARY DETAILS");
System.out.println("EMPLOYEE NAME:"+emp_name);
System.out.println("EMPLOYEE ID:"+emp_id);
System.out.println("EMPLOYEE ADDRESS:"+address);
System.out.println("EMPLOYEE MAIL ID:"+mail_id);
System.out.println("EMPLOYEE MOBILE NO:"+mobile_no);
System.out.println("EMPLOYEE GROSS SALARY:"+gs);
System.out.println("EMPLOYEE NET SALARY:"+ns);
}
}



class employeemain
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
programmer p1= new programmer();
assistantprofessor a1=new assistantprofessor();
associateprofessor a2=new associateprofessor();
professor p2= new professor();
int choice;
System.out.println("\n1.programmers salary\n2.Assistant professor salary\n3.Associate professor salary\n4.professor salary\n5.exit");
System.out.println("ENTER YOUR CHOICE:");
choice=s.nextInt();
while(choice!=5)
{
switch(choice)
{

case 1:
p1.get();
p1.calc();
p1.print();
break;
case 2:
a1.get();
a1.calc();
a1.print();
break;
case 3:
a2.get();
a2.calc();
a2.print();
break;
case 4:
p2.get();
p2.calc();
p2.print();
break;
case 5:
System.exit(0);

}
System.out.println("DO YOU WANT TO REPEAT:");
choice=s.nextInt();

}
}
}
