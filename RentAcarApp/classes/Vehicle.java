package classes;
import java.lang.*;

import interfaces.Ivehicles;
import interfaces.RentOperations;


public  class Vehicle implements RentOperations, Ivehicles
{
	protected String make;
	protected String model;
	protected String regNo;
	protected int quantity;
	protected boolean isRented;
	public Vehicle(){}
	
	public Vehicle(String make,String model,String regNo,int quantity)
	{
		this.make=make;
		this.model=model;
		this.regNo=regNo;
		this.quantity=quantity;
	
	}
	public void setMake(String make){this.make=make;}
	public void setModel(String model){this.model=model;}
	public void setRegNo(String regNo){this.regNo=regNo;}
	public void setQuantity(int quantity){this.quantity=quantity;}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	public boolean getRented(){return isRented;}
	public String getMake(){return make;}
	public String getModel(){return model;}
	public String getRegNo(){return regNo;}
	public int getQuantity(){return quantity;}
	
	

public boolean add(int amount)
	{
		boolean flag = false;
		if(amount>0)
		{
			quantity = quantity+ amount;
			flag = true;
		}
		return flag;
	}
	
	public boolean rent(int amount)
	{
		if(amount>0 && amount<= quantity)
		{
			quantity = quantity - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	private Vehicle vehicles[] = new Vehicle[100];
	public boolean insertVehicle(Vehicle v)
	{
		boolean flag = false;
		for(int i=0; i<vehicles.length; i++)
		{
			if(vehicles[i] == null)
			{
				vehicles[i] = v;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeVehicle(Vehicle v)
	{
		boolean flag = false;
		for(int i=0; i<vehicles.length; i++)
		{
			if(vehicles[i] == v)
			{
				vehicles[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllVehicles()
	{
		System.out.println("///////////////////////////////\n");
		for(int i=0; i<vehicles.length; i++)
		{ 
			if(vehicles[i] != null && isRented == false)
			{
				vehicles[i].showInfo();
				System.out.println();
			}
		}
	}
	
	public Vehicle searchVehicle(String regNo)
	{
		Vehicle v = null;
		for(int i =0; i<vehicles.length; i++)
		{
			if(vehicles[i] != null)
			{
				if(vehicles[i].getRegNo().equals(regNo))
				{
					v = vehicles[i];
					break;
				}
			}
		}
		return v;
	}
public void showInfo()
{
	System.out.println("Vehicle Manufacturer: "+make);
	System.out.println("MODEL: "+model);
	System.out.println("REGISTRATION NO: "+regNo);
	System.out.println();
	System.out.println("Total QUANTITY: "+quantity);
}
	
	
}