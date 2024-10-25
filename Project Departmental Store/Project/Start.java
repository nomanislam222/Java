import classes.*;
import interfaces.*;
import fileWR.*;
import java.util.Scanner;
public class Start
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		DepartmentalStore ds=new DepartmentalStore();
		FileWriteRead fwr=new FileWriteRead();
	
		System.out.println("\n\t*******Welcome to Sugandha Departmental Store*******\n");
		System.out.println();
		
		boolean bool=true;

		while(bool)
		{
			System.out.println("\n\t\tManagement info:-");
			System.out.println("\t\t\t(1) Product management.");
			System.out.println("\t\t\t(2) Product quantity management.");
			System.out.println("\t\t\t(3) Manager management.");
			System.out.println("\t\t\t(4) Employee management.");
			System.out.println("\t\t\t(5) Exit.");
		
			System.out.print("\n\tEnter your choice:");
			int option=in.nextInt();
		
			switch(option)
			{
				case 1:
					System.out.println("\n\t*******Welcome to Product Management System*******");
					System.out.println();
					System.out.println("\t\tProduct management info:-");
					System.out.println("\t\t\t(1) Insert new product.");
					System.out.println("\t\t\t(2) Remove product.");
					System.out.println("\t\t\t(3) Search product.");
					System.out.println("\t\t\t(4) Show all products.");
					System.out.println("\t\t\t(5) Go back.");
		
					System.out.print("\n\tEnter your choice: ");
					int option1=in.nextInt();
				
					switch(option1)
					{
						case 1:
							System.out.println("\n\tYou have chosen to Insert New Product");
							System.out.println("\t\tSelect your option");
							System.out.println("\t\t\t(1)Fruit and Vegetabl");
							System.out.println("\t\t\t(2)Dairy and Bakery");
							System.out.println("\t\t\t(3)Personal and Home Care");
							System.out.println("\t\t\t(4)back to previous");
						
							System.out.print("\n\tEnter the option: ");
							int option2=in.nextInt();
						
							switch(option2)
							{
								case 1:
									System.out.println("\n\tInsert the following informations");
									System.out.print("\n\t\t\tProduct name: ");
									String name1=in.next();
									System.out.print("\n\t\t\tProduct bar code: ");
									String barCode1=in.next();
									System.out.print("\n\t\t\tProduct price: ");
									double price1=in.nextDouble();
									System.out.print("\n\t\t\tProduct available quantity: ");
									int availableQuantity1=in.nextInt();
									System.out.print("\n\t\t\tProduct variety: ");
									String variety=in.next();
					
									Product pd1=new FruitAndVegetable(name1,barCode1,price1,availableQuantity1,variety);
									ds.insertProduct(pd1);
								break;
							
								case 2:
									System.out.println("\n\tInsert the following informations");
									System.out.print("\n\t\t\tProduct name: ");
									String name2=in.next();
									System.out.print("\n\t\t\tProduct bar code: ");
									String barCode2=in.next();
									System.out.print("\n\t\t\tProduct price: ");
									double price2=in.nextDouble();
									System.out.print("\n\t\t\tProduct available quantity: ");
									int availableQuantity2=in.nextInt();
									System.out.print("\n\t\t\tProduct type: ");
									String type=in.next();
						
									Product pd2=new DairyAndBakery(name2,barCode2,price2,availableQuantity2,type);
									ds.insertProduct(pd2);
								break;
							
								case 3:
									System.out.println("\n\tInsert the following informations");
									System.out.print("\n\t\t\tProduct name: ");
									String name3=in.next();
									System.out.print("\n\t\t\tProduct bar code: ");
									String barCode3=in.next();
									System.out.print("\n\t\t\tProduct price: ");
									double price3=in.nextDouble();
									System.out.print("\n\t\t\tProduct available quantity: ");
									int availableQuantity3=in.nextInt();
									System.out.print("\nn\t\t\tProduct brand: ");
									String brand=in.next();
					
									Product pd3=new PersonalAndHomeCare(name3,barCode3,price3,availableQuantity3,brand);
									ds.insertProduct(pd3);
								break;
							
								case 4:
									System.out.println("\n\tBacking to previous");
								break;
							
								default:
									System.out.println("\n\tInvalid option! Please try again.");
								
							}
					
					break;
						
					case 2:
						System.out.println("\n\tYou have chosen to Remove Product");
						System.out.print("\n\t\t\tEnter product bar code: ");
						String barCode4=in.next();
						Product pd4=ds.searchProduct(barCode4);
						if(pd4!=null)
						{
							System.out.println("\t\tEnter 1 to remove the product ");
							System.out.println("\t\tOr enter any integer number to cancel !");
							System.out.print("\tEnter option: ");
							int decision=in.nextInt();
							
							if(decision==1)
							{
								ds.removeProduct(pd4);
							}
							else
							{
								System.out.println("\t\tRemove product has been cancel !");
							}
						}
						else
						{
							System.out.println("\t\tProduct not found ! ");
						}
					break;
					
					case 3:
						System.out.println("\n\tYou have chosen to Search Product");
						System.out.print("\n\t\t\tEnter product bar code: ");
						String barCode5=in.next();
						Product pd5=ds.searchProduct(barCode5);
						if(pd5!= null){
										System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
										System.out.println("Product has been founded.");
										System.out.println("Product barcode : "+pd5.getBarCode());
										System.out.println("Product Name : "+pd5.getName());
										System.out.println("Price : "+pd5.getPrice());
										System.out.println("Available Quantity : "+pd5.getAvailableQuantity());
										System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
									}
									else
									{
										System.out.println("\t\tProduct not found ! ");
									}
					break;
					
					case 4:
						System.out.println("\n\tYou have chosen to Show All Product");
						ds.showAllProducts();
					break;
					
					case 5: 
						System.out.println("\n\tGoing back to main menu.");
					break;
					
					default:
						System.out.println("\n\tInvalid option! please try again.");
						
				}				
				break;
				
				case 2:
					System.out.println("\n\t*******Welcome to Product Quantity Management System*******");
					System.out.println();
					System.out.println("\t\tExisting product quantity up-to-date & record management system:-");
					System.out.println("\t\t\t(1) Add product Quantity.");
					System.out.println("\t\t\t(2) Sell product.");
					System.out.println("\t\t\t(3) Show Product Add-Sell History.");
					System.out.println("\t\t\t(4) Go back.");
			
					System.out.print("\n\tEnter your choice: ");
					int option3=in.nextInt();
					switch(option3)
					{
						case 1:
							System.out.println("\n\tYou have chosen to Add Product Quantity");
							System.out.print("\n\t\t\tEnter product bar code: ");
							String barCode6=in.next();
							//Product pd6=ds.searchProduct(barCode6);
							//if(pd6!=null)
							if(ds.searchProduct(barCode6)!=null)
							{
								System.out.print("\n\t\t\tEnter add quantity: ");
								int amount1=in.nextInt();
								//pd6.addQuantity(amount1);
								ds.searchProduct(barCode6).addQuantity(amount1);
								fwr.writeFile("Product has been added, barcode : "+barCode6+" amount "+amount1+" pcs.");
							}
							else
							{
								System.out.println("\t\tProduct not found ! ");
							}
						break;
					
						case 2:
							System.out.println("\n\tYou have chosen to Sell Product");
							System.out.print("\n\t\t\tEnter product bar code: ");
							String barCode7=in.next();
							//Product pd7=ds.searchProduct(barCode7);
							//if(pd7!=null)
							if(ds.searchProduct(barCode7)!=null)
							{
								System.out.print("\n\t\t\tEnter sell quantity: ");
								int amount2=in.nextInt();
								//pd6.sellQuantity(amount2);
								ds.searchProduct(barCode7).sellQuantity(amount2);
								fwr.writeFile("Product has been selled, barcode : "+barCode7+" amount "+amount2+" pcs.");
							}
							else
							{
								System.out.println("\t\tProduct not found ! ");
							}
						break;
					
						case 3: 
							System.out.println("\n\tYou have chosen to Product Add-Sell History.\n");
							fwr.readFile();
						break;
						
						case 4: 
							System.out.println("\n\tGoing back to main menu.");
						break;	
						
						default:
							System.out.println("\n\tInvalid option! please try again.");
					}
				break;
				
				case 3:
					System.out.println("\n\t*******Welcome to Manager Management System*******");
					System.out.println();
					System.out.println("\t\tManager management info:-");
					System.out.println("\t\t\t(1) Add new manager.");
					System.out.println("\t\t\t(2) Increase employee salary.");
					System.out.println("\t\t\t(3) Add bonus for all employee.");
					System.out.println("\t\t\t(4) Getback bonus for all employee.");
					System.out.println("\t\t\t(5) Show Manager.");
					System.out.println("\t\t\t(6) Go back.");
		
					System.out.print("\n\tEnter your choice: ");
					int option4=in.nextInt();
					
					switch(option4)
					{
						case 1:
							System.out.println("\n\tInsert the following informations");
							System.out.print("\t\t\tManager name: ");
							String name5=in.next();
							System.out.print("\n\t\t\tManager id: ");
							String manId=in.next();
							System.out.print("\n\t\t\tManager salary: ");
							double salary2=in.nextDouble();
					
							Manager m1=new Manager(name5,manId,salary2);
							ds.addManager(m1);
						break;
						
						case 2:
							System.out.println("\n\tYou have chosen increase salary");
							System.out.print("\n\t\t\tEnter the employee id: ");
							String empId4=in.next();
							Employee em4=ds.searchEmployee(empId4);
							if(em4!=null)
							{
								System.out.print("\t\tEnter the manager's pin: ");
								int pin=in.nextInt();
								if(Manager.getPin()==pin)
								{
									System.out.print("\n\t\t\tEnter the bonus amount: ");
									int amount3=in.nextInt();
									ds.increaseSalary(em4,amount3);
								}
								else 
								{
									System.out.println("Wrong pin!. Please try again.");
								}
								
							}
							else
							{
								System.out.println("\t\tEmployee not found ! ");
							}								
							
								
						break;
						
						case 3:
							System.out.println("\n\tYou have chosen add bonus for all employee ");
							
								System.out.print("\t\tEnter the manager's pin: ");
								int pin1=in.nextInt();
								if(Manager.getPin()==pin1)
								{
									System.out.print("\n\t\t\tEnter the bonus amount: ");
									int amount4=in.nextInt();
									ds.addBonus(amount4);
								}
								else 
								{
									System.out.println("Wrong pin!. Please try again.");
								}
							
						break;
						
						case 4:
							System.out.println("\n\tYou have chosen back bonus for all employee ");
							
								System.out.print("\t\tEnter the manager's pin: ");
								int pin2=in.nextInt();
								if(Manager.getPin()==pin2)
								{
									System.out.print("\n\t\t\tEnter the existing bonus amount: ");
									int amount5=in.nextInt();
									ds.backBonus(amount5);
								}
								else 
								{
									System.out.println("Wrong pin!. Please try again.");
								}
							
						break;
						
						case 5:
							System.out.println("\n\tYou have chosen to Show Manager");
							ds.showManager();
						break;
					
						case 6: 
							System.out.println("\n\tGoing back to main menu.");
						break;
					}
				break;
			
				case 4:
					System.out.println("\n\t*******Welcome to Employee Management System*******");
					System.out.println();
					System.out.println("\t\tEmployee management info:-");
					System.out.println("\t\t\t(1) Insert new Employee.");
					System.out.println("\t\t\t(2) Remove Employee.");
					System.out.println("\t\t\t(3) Search Employee.");
					System.out.println("\t\t\t(4) Show All Employee.");
					System.out.println("\t\t\t(5) Go back.");
		
					System.out.print("\n\tEnter your choice: ");
					int option5=in.nextInt();
				
					switch(option5)
					{
						case 1:
							System.out.println("\n\tInsert the following informations");
							System.out.print("\t\t\tEmployee name: ");
							String name4=in.next();
							System.out.print("\n\t\t\tEmployee id: ");
							String empId1=in.next();
							System.out.print("\n\t\t\tEmployee salary: ");
							double salary1=in.nextDouble();
					
							Employee em1=new Employee(name4,empId1,salary1);
							ds.insertEmployee(em1);
						break;
					
						case 2:
							System.out.println("\n\tYou have chosen to Remove Employee");
							System.out.print("\n\t\t\tEnter employee id: ");
							String empId2=in.next();
							Employee em2=ds.searchEmployee(empId2);
							if(em2!=null)
							{
								System.out.println("\t\tEnter 1 To remove the employee ");
								System.out.println("\t\t Or enter any integer number to cancel !");
								System.out.print("\tEnter option: ");
								int decision=in.nextInt();
							
								if(decision==1)
								{
									ds.removeEmployee(em2);
								}
								else
								{
									System.out.println("\t\tRemove employee has been cancel !");
								}
							}
							else
							{
								System.out.println("\t\tEmployee not found ! ");
							}
							//ds.removeEmployee(em2);
					
						break;
					
						case 3:
							System.out.println("\n\tYou have chosen to Search Employee");
							System.out.print("\n\t\t\tEnter employee id: ");
							String empId3=in.next();
							Employee em3=ds.searchEmployee(empId3);
							if(em3!= null){
										System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
										System.out.println("Employee has been founded.");
										System.out.println("Employee Id : "+em3.getEmpId());
										System.out.println("Employee Name : "+em3.getName());
										System.out.println("Employee Salary : "+em3.getSalary());
										System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
									}
									else
									{
										System.out.println("\t\tEmployee not found ! ");
									}
						break;
					
						case 4:
							System.out.println("\n\tYou have chosen to Show All Employee");
							ds.showAllEmployees();
						break;
					
						case 5: 
							System.out.println("\n\tGoing back to main menu.");
						break;
					
						default:
							System.out.println("\n\tInvalid option! please try again.");
							
					}
				break;
			
					case 5:
					System.out.println("\n\tExit?.");
					System.out.println("\n\tPlease enter your option.");
					System.out.println("\n\t(1)Yes \t\t(2)No.");
					int i=in.nextInt();
					if(i==1)
					{
						bool=false;
						System.out.println("\n\tExit done !!.");
					}
					else
					{
						System.out.println("\n\tFailed to exit. Keep going !");
					}
				break;
			
				default:
					System.out.println("\n\tInvalid option! please try again.");
			
			}	
		
		
		}	
		
	}	
	
}
