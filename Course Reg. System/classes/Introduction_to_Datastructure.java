package classes;
import java.util.Scanner;
public class Introduction_to_Datastructure extends Courses
{

	public float CoursePrice, vat, netCost;
	
	public Introduction_to_Datastructure(){}
	public Introduction_to_Datastructure(float CoursePrice,float netCost, float vat)
	{
		this.CoursePrice = CoursePrice;
		this.netCost = netCost;
		this.vat = vat;
	}
	
	
	public void showdetails()
	{
		System.out.println("\n\n            You have Selected The Introduction to Datastructure Course ");
		System.out.print("           Your Total Cost"   ); 
		System.out.print("with vat "+this.vat  );
		System.out.print( " is "+this.netCost+"Taka ");
		System.out.print("\n\n                    ====/Thank You!/====\n\n\n");


		
	}
}