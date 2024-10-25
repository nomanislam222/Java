import classes.*;
import fileio.FileReadWriteDemo;
import java.util.Scanner;


public class Start

{

	
	
	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);
		float CoursePrice = 0, vat = 0.15f, netCost = 0;
		
		Profile user[] = new Profile[100];


		Introduction_to_Electrical_Circuit iec = new Introduction_to_Electrical_Circuit  (CoursePrice,netCost,vat);

		Object_Oriented_Programming oop = new Object_Oriented_Programming   (CoursePrice,netCost,vat);

		Introduction_to_Datastructure ids = new Introduction_to_Datastructure  (CoursePrice,netCost,vat);

		Web_Designing wd = new Web_Designing  (CoursePrice,netCost,vat);


		int store, Customer=0, z=0, pass, y;
		String name, email;
		float balance=0, addMoney;
		int findPassword [] = new int[20];

		int t = 1;
		int i = 0;
		
		while(t == 1)
		{	
			
				System.out.println("             ================================================================================\n");
				System.out.println("                   			Welcome to Course Registration System! \n");
				System.out.println("             ________________________________________________________________________________\n");

				System.out.println("			1. Create your Profile\n");
				System.out.println("			2. Purchase Course\n");
				System.out.println("			3. Account Information\n");
				System.out.println("			4. Add Money\n");
				System.out.println("			5. Exit \n");
				System.out.println("\n			Please choose an option : ");
		
				int x ;
				x = input.nextInt();
				
				switch(x)

				{
					
						
					case 2 :
					
						System.out.println("\n \n");
						System.out.println(" Enter your Password :  ");
						y = input.nextInt();
						store=-1;

						for(i = 0; i<=Customer; i++)

							{
								if(findPassword [i] == y)
									{
										store = i;
										break;
									}
							}
							
						if ( store ==-1 )

							System.out.println("\nYou've entered wrong password! Please try again...\n");

						else

						{
							System.out.println("\n                 Welcome Back! "+user[store].getName());
							
							System.out.println("\n 			Select a course :  ");
							System.out.println("			1) Introduction to Electrical_Circuit COURSE (PRICE 15000 BDT + VAT)");
							System.out.println("			2) Object Oriented Programming COURSE (PRICE 15000 BDT + VAT )");
							System.out.println("			3) Introduction to Datastructure COURSE (PRICE 15000 BDT + VAT)");
							System.out.println("			4) Web Designing COURSE (PRICE 10000 BDT + VAT)  \n  ");
							System.out.println(" 			*Please choose a Course: \n\n");
							
							z = input.nextInt();
							
							if(z==1)
							{
								if(balance >= 15000)
								{
									System.out.println("                  ==============================================");
									System.out.println("                =|           COURSE PURCHASE SUCCESSFUL!        |=");
									System.out.println("                  ==============================================");
								
									netCost = 15000+(0.15f*vat);
									iec = new Introduction_to_Electrical_Circuit(CoursePrice,netCost,vat);
									iec.showdetails();
									user[store].updateBalance(-netCost);
									
								}
								
								else {
									System.out.println("                    =====================================");
									System.out.println("                  =|        INSUFFICIENT BALANCE!!       |=");
									System.out.println("                    =====================================");
								}
								
							}
							
							else if(z==2)
							{
								if(balance >= 15000)
								{
									System.out.println("                 =====================================");
									System.out.println("               =|      COURSE PURCHASE SUCCESSFUL!    |= ");
									System.out.println("                 =====================================");
								
									netCost = 15000+(0.15f*vat);
									oop = new Object_Oriented_Programming(CoursePrice,netCost,vat);

									oop.showdetails();
									user[store].updateBalance(-netCost);
									
								}
								
								else {
									System.out.println("                  =====================================");
									System.out.println("                =|       INSUFFICIENT BALANCE!!        |=");
									System.out.println("                  =====================================");
								}
							}
							
							else if(z==3)
							{
								if(balance >= 15000)
								{
									System.out.println("                   =====================================");
									System.out.println("                 =|      COURSE PURCHASE SUCCESSFUL!    |=   ");
									System.out.println("                   =====================================");
									
									netCost = 15000+(0.15f*vat);
									ids = new Introduction_to_Datastructure(CoursePrice,netCost,vat);
									ids.showdetails();
									user[store].updateBalance(-netCost);
									
								}
								
								else {
									System.out.println("                 ===========================================");
									System.out.println("               =|            INSUFFICIENT BALANCE!!          |= ");
									System.out.println("                 ===========================================");

								    }
							}

							else if(z==4)
							{
								if(balance >= 10000)
								{
									System.out.println("                 ==============================================");
									System.out.println("               =|             COURSE PURCHASE SUCCESSFUL!      |=");
									System.out.println("                 ==============================================");
									
									netCost = 10000+(0.15f*vat);
									wd = new Web_Designing(CoursePrice,netCost,vat);
									wd.showdetails();
									user[store].updateBalance(-netCost);
								    }
								
								else {
									System.out.println("                     ==========================================");
									System.out.println("                   =|           INSUFFICIENT BALANCE!!         |=  ");
									System.out.println("                     ==========================================");
								}
							}


							else{

								System.out.println("    Invalid input.\n");
							}
							
							
						}
						break;

						case 1 : 
					
						
						System.out.println("\n \n");
						System.out.println("  Please provide the required informations to create a Profile\n");
						System.out.println("  Enter your name : ");
						name = input.next();

						System.out.println("  Enter your email :  ");
						email = input.next();
						
						System.out.println("  Enter Balance :  ");
						balance = input.nextFloat();

						System.out.println("  Enter a Password(only numeric) :  \n");
						pass = input.nextInt();

						findPassword [Customer] = pass;

						switch(z){
					case 1:
						
						user [Customer] = new Profile (name, email, balance, pass, z);
					break;

                    case 2:
						user [Customer] = new Profile (name, email, balance, pass, 0);
					break;
					default:
						user [Customer] = new Profile (name, email, balance, pass, 0);
						break;
				}
						Customer++;
						break;
						
					case 3 : 
						System.out.println("\n \n");
						System.out.println("*Please Enter your Password :  ");
						y = input.nextInt();

						store = -1 ;

						for(i = 0; i<=Customer; i++)
							{
								if(findPassword[i]==y)
									{
										store = i;
										break;
									}
							}
							
						if(store == -1)

							System.out.println("\n    Sorry! Invalid Password! \n");
						else
						{
							user[store].showInformations();
						}
						break;
						
					case 4 : 
						System.out.println("\n \n");
						System.out.println("  Enter your Password :  ");
						y = input.nextInt();
						store=-1;

						for(i = 0; i<=Customer; i++)
							{
								if(findPassword[i]==y)
									{
										store = i;
										break;
									}
							}
							
						if(store==-1)
							System.out.println("\n    Sorry! Invalid Password! \n");
						else
						{
							System.out.println(" $Enter amount you want to add to your Wallet :  ");
							addMoney = input.nextFloat();
							user[store].updateBalance(addMoney);
						}
						break;
					
					case 5 : 
						t = 0;
						break;
					
					default:
					
					System.out.println("                      =================================================");
					System.out.println("                    =|          Invalid Choice... Try Again....        |=");
					System.out.println("                      =================================================");
					
					break;
				}
			
			
		}
	}
}