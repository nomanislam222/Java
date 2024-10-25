import java.lang.*;
import classes.*;
import fileio.*;
import interfaces.Ivehicles;

import java.util.Scanner;
import java.io.*;

public class Start
{
	public static void main(String args[]) throws Exception
	{
		Management rs = new Management();
		Vehicle v = new Vehicle();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		System.out.println("-------------------------------------------");
		System.out.println("***WelCome to Afsar Rent A Car***");
		System.out.println("-------------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Vehicle Management");
			System.out.println("\t4. Rent Operations");
			System.out.println("\t5. Exit");
			
			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Employee Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();

					switch(option1)
					{
						case 1:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Insert a New Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = bfr.readLine();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(rs.insertEmployee(e1))
							{
								System.out.println("Employee Inserted.. EmpId: "+e1.getEmpId());
							}
							else
							{
								System.out.println("Employee Not Inserted.. EmpId: "+e1.getEmpId());
							}
							System.out.println();
							break;
							
						case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Remove an Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = rs.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(rs.removeEmployee(e2))
								{
									System.out.println("Employee Removed.... EmpId: "+ e2.getEmpId());
								}
							}
							else
							{
								System.out.println("Employee Not Removed.... EmpId: "+ empId2);
							}
							System.out.println();
							break;
							
						case 3:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Search an Employee");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Employee Id: ");
							String empId3 = sc.next();
							
							Employee e3 = rs.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found....");
								System.out.println("Employee Id: " + e3.getEmpId());
								System.out.println("Employee Name: " + e3.getName());
								System.out.println("Employee Salary: " + e3.getSalary());
							}
							else
							{
								System.out.println("Employee Not Found.... EmpId: "+ empId3);
							}
							System.out.println();
							break;
							
						case 4:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to See All Employees");
							System.out.println("-------------------------------------------");
							rs.showAllEmployees();
							System.out.println();
							break;
							
						case 5:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
						
						default:
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					break;
					
				case 2:
				    System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Existing Customer");
					System.out.println("\t3. Search a Customer");
					System.out.println("\t4. Show All Customers");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();

					switch(option2)
					{
						case 1:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Insert a New Customer");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Customer Name: ");
							String name1 = bfr.readLine();
							System.out.println("Enter Gender: ");
							String g1=sc.next();
							System.out.println("Enter Age: ");
							int a1=sc.nextInt();
							System.out.println("Enter NID: ");
							int nid1= sc.nextInt();
							System.out.println("Enter Phone Number: ");
							String p1=sc.next();
							System.out.println("Enter Address: ");
							String add1=sc.next();
							Customer c1= new Customer(name1,g1,a1,nid1,p1,add1);
							if(rs.insertCustomer(c1))
							{
								System.out.println("Customer Inserted..... NID: "+ c1.getNid());
							}
							else
							{
								System.out.println("Customer Not Inserted... NID: "+ c1.getNid());
							}
							System.out.println();	
							
							
							break;
							
						case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Remove a Customer");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Customer  NID: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = rs.searchCustomer(nid2);
							
							if(c2 != null)
							{
								if(rs.removeCustomer(c2))
								{
									System.out.println("Employee Removed.... NID: "+ c2.getNid());
								}
							}
							else
							{
								System.out.println("Employee Not Removed.... NID: "+ nid2);
							}
							System.out.println();
							break;
							
						case 3:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Search a Customer");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Customer NID: ");
							int nid3 = sc.nextInt();
							
							Customer c3 = rs.searchCustomer(nid3);
							
							if(c3 != null)
							{
								System.out.println("Customer Details....");
								System.out.println("Customer's NAME: "+c3.getName());
								System.out.println("Gender: "+c3.getGender());
								System.out.println("Age: "+c3.getAge());
								System.out.println("NID No: "+c3.getNid());
								System.out.println("Contact Number: "+c3.getPhone());
								System.out.println("Address: "+c3.getAddress());
					
							}
							else
							{
								System.out.println("Customer Not Found.... NID: "+ nid3);
							}
							System.out.println();
							break;
							
						case 4:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to See All Customers");
							System.out.println("-------------------------------------------");
							rs.showAllCustomers();
							System.out.println();
							break;
							
						case 5:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
						
						default:
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					break;
					
				case 3:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Vehicle Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Register a Vehicle");
					System.out.println("\t2. Remove Vehicle from Service");
					System.out.println("\t3. Search a Vehicle.");
					System.out.println("\t4. Show All Vehicles of Rent Service");
					System.out.println("\t5. Go Back");
			
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();

					switch(option3)
					{
						case 1:
							System.out.println("-------------------------------------------");
							System.out.println("You Choose to Register a Vehicle.");
							System.out.println("-------------------------------------------");
							
							System.out.println("There are Two Types of Vehicles: ");
							System.out.println("\t 1. Car");
							System.out.println("\t 2. Bus");
							System.out.println("\t 3. BACK");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							
							
							if(type == 1)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Register a Car");
								System.out.println("-------------------------------------------");
								
								System.out.println("Vehicle Manufacturer: ");
								String make1=sc.next();
								System.out.println("MODEL: ");
								String model1=sc.next();
								System.out.println("REGISTRATION NO: ");
								String reg1=sc.next();
								System.out.println("CAR Quantity: ");
								int q1=sc.nextInt();
								
								System.out.println("CAR TYPES: ");
								String type1=sc.next();
								
								Car cr1 = new Car(make1,model1,reg1,q1,type1);
								// v = cr1;
								v.insertVehicle(cr1);
							}
							else if(type == 2)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Register a Bus");
								System.out.println("-------------------------------------------");
								
								System.out.println("Vehicle Manufacturer: ");
								String make2=sc.next();
								System.out.println("MODEL: ");
								String model2=sc.next();
								System.out.println("REGISTRATION NO: ");
								String reg2=sc.next();
								System.out.println("BUS Quantity: ");
								int q2=sc.nextInt();
								System.out.println("Bus TYPES: ");
								String type2=sc.next();
								System.out.println("Total Seat: ");
								int seat1=sc.nextInt();
								Bus bs = new Bus(make2,model2,reg2,q2,type2,seat1);
								// v = bs;
								v.insertVehicle(bs);
							}
							else if(type == 3)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Going Back......");
								System.out.println("-------------------------------------------");
							}
							else
							{
								System.out.println("-------------------------------------------");
								System.out.println("Invalid Type......");
								System.out.println("-------------------------------------------");
							}
							break;
							
						case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You choose to Remove a Vehicle");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Vehicles Registration Number: ");
							String reg3 = sc.next();
							// Vehicle vv = new Vehicle();
							Vehicle v2 = v.searchVehicle(reg3);
							
							if(v2 != null)
							{
								if(v.removeVehicle(v2))
								{
									System.out.println("Vehicle Removed Succesfully");
								}
							}
							else
							{
								System.out.println("Failed to Remove Vehicle.");
							}
							System.out.println();
							break;
							
						case 3:
							System.out.println("-------------------------------------------");
							System.out.println("You choose to Search a Vehicle");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Vehicle  REG No: ");
							String reg4 = sc.next();
							
							Vehicle v3 = v.searchVehicle(reg4);
							
							if(v3 != null)
							{
								System.out.println("Vehicle Manufacturer: "+v3.getMake());
								System.out.println("MODEL: "+v3.getModel());
								System.out.println("REGISTRATION NO: "+v3.getRegNo());
								
					
							}
							else
							{
								System.out.println("Vehicle Not Found.");
							}
							System.out.println();
							break;
							
						case 4:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Vehicles");
							System.out.println("-------------------------------------------");
							v.showAllVehicles();
							System.out.println();
							break;
							
						case 5:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
						
						default:
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
						
							break;
					}
					break;
					case 4:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Rent operation");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Rent a vehicle to customer.");
					System.out.println("\t2. Show  History");
					System.out.println("\t3. Go Back");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();

					switch(option4)
					{
						case 1:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Rent a vehicle to customer.");
							System.out.println("-------------------------------------------");
							System.out.println("Enter cutomer NID : ");
							int cusID = sc.nextInt();
							Customer cc = rs.searchCustomer(cusID);
							if( cc!= null) {
								
								System.out.println("Available Vehicles");
								v.showAllVehicles();
								System.out.println("Enter REGNO :");
								String vReg = sc.next();
								Vehicle vv = v.searchVehicle(vReg);
								if(vv!=null && !vv.getRented()) {
									vv.setRented(true);
									cc.setvRegNo(vReg);
									vv.rent(1);
									FileReadWriteDemo ff = new FileReadWriteDemo();
									ff.writeInFile("Customer NID : " + cc.getNid());
									ff.writeInFile("Rented Vehicle REGNO : " + vReg);
									System.out.println("Vehicle Rented.  Vehicle REg NO.- " + vv.getRegNo() + " Customer NID : " + cc.getNid());
								}else {
									System.out.println("INVALID");
								}
								
							}else {
								System.out.println("INVALID");
							}
							break;
							
						
						case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Show  History");
							System.out.println("-------------------------------------------");
							FileReadWriteDemo f2 = new FileReadWriteDemo();
							f2.readFromFile();
							break;
							
						case 3:
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Go Back");
							System.out.println("-------------------------------------------");
							break;
						
						default:
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					break;
					
				case 5:
					System.out.println("-------------------------------------------");
					System.out.println("You have choose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...............");
					System.out.println("-------------------------------------------");
					break;
			}
		}
	}
}