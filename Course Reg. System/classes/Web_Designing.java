package classes;
import java.util.Scanner;
public class Web_Designing extends Courses
{

	public float CoursePrice, netCost, vat;
	
	public Web_Designing(){}
	public Web_Designing(float CoursePrice,float netCost, float vat)

	{

		this.CoursePrice = CoursePrice;
		this.netCost = netCost;
		this.vat = vat;

	}
	
	
	
	public void showdetails()
	{
		System.out.println("\n\n               You have Selected The Web Designing Course ");
		System.out.print("           Your Total Cost"   ); 
		System.out.print("with vat "+this.vat  );
		System.out.print( " is "+this.netCost+"Taka ");
		System.out.print("\n\n                    ====/Thank You!/====\n\n\n");





		
	}
}