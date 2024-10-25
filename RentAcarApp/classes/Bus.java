package classes;
import java.lang.*;

public class Bus extends Vehicle
{
	private String type;
	private int seat;
	
	public void setSeat(int seat){this.seat=seat;}
	public int getSeat(){return seat;}
	
	public Bus(String make,String model,String regNo,int quantity,String type,int seat)
	{
		super(make,model,regNo,quantity);
		this.type=type;
		
	}
	public void setType(String type){this.type=type;}
	public String getType(){return type;}
	

public void showInfo()
{
	System.out.println("Vehicle Manufacturer: "+make);
	System.out.println("MODEL: "+model);
	System.out.println("REGISTRATION NO: "+regNo);
	System.out.println("Bus TYPES: "+type);
	System.out.println("Total Seat: "+seat);
}
	
}
