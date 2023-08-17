
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
abstract class shape
{
	int length,breadth;
	abstract void printArea();
	abstract void printPerimeter();
}
class Rectangle extends shape
{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	void printArea()
	{
		try{
			System.out.println("ENTER THE LENGTH:");
			length=Integer.parseInt(r.readLine());
			System.out.println("ENTER THE BREADTH:");
			breadth=Integer.parseInt(r.readLine());
			int area=length*breadth;
			System.out.println("THE AREA OF RECTANGLE IS:"+area);
		}catch(Exception e){}
	}

	void printPerimeter()
	{
		try{

			System.out.println("ENTER THE LENGTH:");
			length=Integer.parseInt(r.readLine());
			System.out.println("ENTER THE BREADTH:");
			breadth=Integer.parseInt(r.readLine());
			int perimeter=2*(length+breadth);
			System.out.println("THE PERIMETER OF RECTANGLE IS:"+perimeter);
		}catch(Exception e){}
	}
}
class Triangle extends shape
{
	BufferedReader r =new BufferedReader(new InputStreamReader(System.in));
	void printArea()
		{
			try{
				System.out.println("ENTER THE LENGTH:");
				length=Integer.parseInt(r.readLine());
				System.out.println("ENTER THE BREADTH:");
				breadth=Integer.parseInt(r.readLine());
				int area=(length*breadth)/2;
				System.out.println("THE AREA OF TRIANGLE IS:"+area);
			}catch(Exception e){}
		}
	void printPerimeter()
	{
		try{
			System.out.println("ENTER THE SIDE:");
			int side= Integer.parseInt(r.readLine());
			System.out.println("ENTER THE BASE:");
			int base=Integer.parseInt(r.readLine());
			System.out.println("ENTER THE SIDE:");
			int side1=Integer.parseInt(r.readLine());
			int perimeter= side+base+side1;
			System.out.println("THE PERIMETER OF TRIANGLE IS:"+perimeter);
		}catch(Exception e){}
	}
}

class Circle extends shape
{
	BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
	void printArea()
	{
		try{

			double pi=3.14;
			int radius;
			System.out.println("ENTER THE RADIUS OF CIRCLE:");
			radius= Integer.parseInt(r.readLine());
			double area= pi*radius*radius;
			System.out.println("THE AREA OF CIRCLE IS:"+area);
		}catch(	Exception e){}
	}
	void printPerimeter()
	{
		try{
			double pi=3.14;
			int radius;
			System.out.println("ENTER THE RADIUS OF CIRCLE:");
			radius= Integer.parseInt(r.readLine());
			double perimeter= 2*pi*radius;
			System.out.println("THE PERIMETER OF CIRCLE IS:"+perimeter);
		}catch(Exception e){}
	}
}
class Square extends shape
{
	BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
	void printArea()
		{
			try{
				System.out.println("ENTER THE SIDE:");
				length=Integer.parseInt(r.readLine());
				int area=length*length;
				System.out.println("THE AREA OF SQUARE IS:"+area);
			}catch(Exception e){}
		}

		void printPerimeter()
		{
			try{

				System.out.println("ENTER THE SIDE:");
				length=Integer.parseInt(r.readLine());
				int perimeter= 4*length;
				System.out.println("THE PERIMETER OF SQUARE IS:"+perimeter);
			}catch(Exception e){}
		}
}
class Cube extends shape
{
	BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
		void printArea()
			{
				try{
					System.out.println("ENTER THE EDGE:");
					length=Integer.parseInt(r.readLine());
					int area=6*length*length;
					System.out.println("THE AREA OF CUBE IS:"+area);
				}catch(Exception e){}
			}

			void printPerimeter()
			{
				try{

					System.out.println("ENTER THE SIDE:");
					length=Integer.parseInt(r.readLine());
					int perimeter= 12*length;
					System.out.println("THE PERIMETER OF CUBE IS:"+perimeter);
				}catch(Exception e){}
			}
}
class Cuboid extends shape
{
	BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
			void printArea()
				{
					try{
						System.out.println("ENTER THE LENGTH:");
						length=Integer.parseInt(r.readLine());
						System.out.println("ENTER THE WIDTH:");
						breadth=Integer.parseInt(r.readLine());
						System.out.println("ENTER THE HEIGHT:");
						int height=Integer.parseInt(r.readLine());
						int area= 2*(length*breadth)+2*(length*height)+2*(height*breadth);
						System.out.println("THE AREA OF CUBOID IS:"+area);
					}catch(Exception e){}
				}

				void printPerimeter()
				{
					try{
						System.out.println("ENTER THE LENGTH:");
						length=Integer.parseInt(r.readLine());
						System.out.println("ENTER THE BREADTH:");
						breadth=Integer.parseInt(r.readLine());
						System.out.println("ENTER THE HEIGHT:");
						int height=Integer.parseInt(r.readLine());
						int perimeter= 4*(length+breadth+height);
						System.out.println("THE PERIMETER OF CUBOID IS:"+perimeter);
					}catch(Exception e){}
				}
}



class shapemain
{
	public static void main(String args[])throws IOException
	{
		BufferedReader r =new BufferedReader(new InputStreamReader(System.in));
		int ch;
		System.out.println("1.RECTANGLE\n2.TRIANGLE\n3.CIRCLE\n4.SQUARE\n5.CUBE\n6.CUBOID\n7.EXIT");
		System.out.println("ENTER YOUR CHOICE:");
		ch=Integer.parseInt(r.readLine());
		while(ch!=7)
		{
			switch(ch)
			{
				case 1:
				shape s= new Rectangle();
				s.printArea();
				s.printPerimeter();
				break;
				case 2:
				shape s1= new Triangle();
				s1.printArea();
				s1.printPerimeter();
				break;
				case 3:
				shape s2= new Circle();
				s2.printArea();
				s2.printPerimeter();
				break;
				case 4:
				shape s3=new Square();
				s3.printArea();
				s3.printPerimeter();
				break;
				case 5:
				shape s4=new Cube();
				s4.printArea();
				s4.printPerimeter();
				break;
				case 6:
				shape s5=new Cuboid();
				s5.printArea();
				s5.printPerimeter();
				break;
				case 7:
				System.exit(0);
				default:
				System.out.println("ENTER THE CORRECT CHOICE");
			}
			System.out.println("DO YOU WANT TO REPEAT:");
			ch=Integer.parseInt(r.readLine());
		}
	}
}



