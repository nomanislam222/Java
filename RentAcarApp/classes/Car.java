package classes;
import java.lang.*;

public class Car extends Vehicle 
{
	private String type;
	
	
	public Car(String make,String model,String regNo,int quantity,String type)
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
	System.out.println("CAR TYPES: "+type);
}
	
	
}