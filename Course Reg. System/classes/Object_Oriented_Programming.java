package classes;
import java.util.Scanner;

public class Object_Oriented_Programming extends Courses
{

	public float CoursePrice, vat, netCost;
	
	public Object_Oriented_Programming (){}
	public Object_Oriented_Programming(float CoursePrice,float netCost, float vat)
	{
	
		this.CoursePrice = CoursePrice;
		this.netCost = netCost;
		this.vat = vat;
		
	}
	

	public void showdetails()
	{
		System.out.println("\n\n     You have Selected The Object Oriented Programming Course ");
		System.out.print("           Your Total Cost"   ); 
		System.out.print("with vat "+this.vat  );
		System.out.print( " is "+this.netCost+"Taka ");
		System.out.print("\n\n                    ====/Thank You!/====\n\n\n");


		
	}
}