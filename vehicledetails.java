
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
abstract class vehicle
{
	abstract void details();
}
class vehicledetails
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		vehicle b1= new vehicle()

		{
			void details()
				{
					try
					{

						BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
						System.out.println("ENTER THE BIKE NAME:");
						String b= r.readLine();
						System.out.println("ENTER THE FRONT TYRE AIR LEVEL:");
						int front = Integer.parseInt(r.readLine());
						System.out.println("ENTER THE BACK TYRE AIR LEVEL:");
						int back=Integer.parseInt(r.readLine());
						if(front>30&&back>40)
						{
							throw new check();
						}
						else
						{
							System.out.println("TYRES AIR LEVELS ARE CORRECT");
						}
						System.out.println("ENTER THE FUEL CAPACITY OF BIKE");
						int fuel=Integer.parseInt(r.readLine());
						if(fuel>5)
						{
							throw new check_capacity();
						}
						else
						{
							System.out.println("Fuels are in correct level");
						}
						System.out.println("ENTER THE LEVEL OF ENGINE OIL:");
						int oil=Integer.parseInt(r.readLine());
						System.out.println("ENTER THE UPPER LEVEL OF ENGINE OIL:");
						int level=Integer.parseInt(r.readLine());
						if(oil<level)
						{
							throw new check_level();
						}
						else
						{
							System.out.println("THE OIL LEVELS ARE MAINTAINED PROPERLY");
						}
						System.out.println("ENTER WHETHER YOU HAVE PUT THE STAND IN BIKE");
						String stand=r.readLine();
						if(stand=="yes")
						{
							throw new stand();
						}
						else
						{
							System.out.println("THE STAND IS PUT ON THE BIKE");
						}

					}
					catch(check c){}
					catch(check_capacity y){}
					catch(check_level cl){}
					catch(stand s2){}
					catch(Exception e){}
				}
	};
	vehicle c1=new vehicle()
	{
		void details()
			{
				try
				{
					BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("ENTER THE CAR NAME:");
					String ca= r.readLine();
					System.out.println("ENTER THE STANDARD AIR LEVELS OF FOUR TYRES:");
					int level=Integer.parseInt(r.readLine());
					if(level>40)
					{
						throw new check();
					}
					else
					{
						System.out.println("TYRES AIR LEVELS ARE CORRECT");
					}
					System.out.println("ENTER THE FUEL CAPACITY OF CAR");
											int fuel=Integer.parseInt(r.readLine());
											if(fuel>20)
											{
												throw new check_capacity();
											}
											else
											{
												System.out.println("Fuels are in correct level");
											}
											System.out.println("ENTER THE LEVEL OF ENGINE OIL:");
											int oil=Integer.parseInt(r.readLine());
											System.out.println("ENTER THE UPPER LEVEL OF ENGINE OIL:");
											int level1=Integer.parseInt(r.readLine());
											if(oil<level1)
											{
												throw new check_level();
											}
											else
											{
												System.out.println("THE OIL LEVELS ARE MAINTAINED PROPERLY");
											}
											System.out.println("ENTER WHETHER THE DOORS ARE OPEN IN CAR");
											String door=r.readLine();
											if(door=="open")
											{
												throw new door();
											}
											else
											{
												System.out.println("THE DOORS ARE CLOSED IN CAR");
											}

					}
				catch(check c){}
				catch(check_capacity y){}
				catch(check_level cl){}
				catch(door d){}
				catch(Exception e){}
			}
	};
	vehicle a1=new vehicle()
	{
		void details()
					{
						try
						{
							BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
							System.out.println("ENTER THE AUTO COMPANY NAME:");
							String ca= r.readLine();
							System.out.println("ENTER THE STANDARD AIR LEVELS OF THREE TYRES:");
							int level=Integer.parseInt(r.readLine());
							if(level>40)
							{
								throw new check();
							}
							else
							{
								System.out.println("TYRES AIR LEVELS ARE CORRECT");
							}
							System.out.println("ENTER THE FUEL CAPACITY OF AUTO");
							int fuel=Integer.parseInt(r.readLine());
							if(fuel>20)
									{
										throw new check_capacity();
									}
							else
									{
										System.out.println("Fuels are in correct level");
									}
							System.out.println("ENTER THE LEVEL OF ENGINE OIL:");
							int oil=Integer.parseInt(r.readLine());
							System.out.println("ENTER THE UPPER LEVEL OF ENGINE OIL:");
							int level2=Integer.parseInt(r.readLine());
							if(oil<level2)
								{
										throw new check_level();
								}
							else
								{
									System.out.println("THE OIL LEVELS ARE MAINTAINED PROPERLY");
								}
							}
							catch(check c){}
							catch(check_capacity y){}
							catch(check_level cl){}
							catch(Exception e){}
						}
		};
		vehicle f1= new vehicle()
		{
			void details()
						{
							try

							{
								BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
								System.out.println("ENTER THE FLIGHT NAME:");
								String ca= r.readLine();
								System.out.println("ENTER THE STANDARD NITROGEN AIR LEVELS OF SIX TYRES:");
								int level=Integer.parseInt(r.readLine());
								if(level>320)
								{
									throw new check();
								}
								else
								{
									System.out.println("TYRES AIR LEVELS ARE CORRECT");
								}
								System.out.println("ENTER THE FUEL TANK CAPACITY OF FLIGHT");
								int fuel=Integer.parseInt(r.readLine());
								if(fuel>26000)
									{
										throw new check_capacity();
									}
								else
									{
										System.out.println("AVIATION KEROSENE ARE IN CORRECT LEVEL");
									}
								System.out.println("ENTER THE QUARTS LEVEL OF ENGINE OIL:");
								int oil=Integer.parseInt(r.readLine());
								System.out.println("ENTER THE QUARTS UPPER LEVEL OF ENGINE OIL:");
								int level1=Integer.parseInt(r.readLine());
								if(oil<level1)
										{

											throw new check_level();
										}
								else
										{
											System.out.println("THE OIL LEVELS ARE MAINTAINED PROPERLY");
										}
								System.out.println("ENTER THE CEILING FEET OF FLIGHT");
								long ce=Long.parseLong(r.readLine());
								if(ce>35000)
								{
									throw new ceiling();

								}
								else
								{
									System.out.println("THE AIRCREFT IS FLYING IN CORRECT CEILING LEVEL");
								}
							}
							catch(check c){}
							catch(check_capacity y){}
							catch(check_level cl){}
							catch(ceiling cea){}
							catch(Exception e){}
						}

				};


		int choice;
		System.out.println("VEHICLE DETAILS");
		System.out.println("1.BIKE DETAILS\n2.CAR DETAILS\n3.AUTO DETAILS\n4.FLIGHT DETAILS \n5.EXIT");
		System.out.println("ENTER THE CHOICE:");
		choice=Integer.parseInt(r.readLine());
		while(choice!=5)
		{
			switch(choice)
			{
				case 1:
				b1.details();
				break;
				case 2:
				c1.details();
				break;
				case 3:
				a1.details();
				break;
				case 4:
				f1.details();
				case 5:
				System.exit(0);
				default:
				System.out.println("INVALID CHOICE");
			}
			System.out.println("ENTER THE CHOICE:");
			choice=Integer.parseInt(r.readLine());
		}
	}
}
class check extends Exception
{
	check()
	{
		System.out.println("CHECK THE AIR LEVEL");
	}
}
class check_capacity extends Exception
{
	check_capacity()
	{
		System.out.println("CHECK THE FUEL LEVEL");
	}
}
class check_level extends Exception
{
	check_level()
	{
		System.out.println("CHECK THE ENGINE OIL");
	}
}
class stand extends Exception
{
	stand()
	{
		System.out.println("CHECK THE STAND");
	}
}
class door extends Exception
{
	door()
	{
		System.out.println("DOORS ARE OPENED");
	}
}
class ceiling extends Exception
{
	ceiling()
	{
		System.out.println("THE FLIGHT IS FLYING ABOVE THE CEILING LEVEL");
	}
}


