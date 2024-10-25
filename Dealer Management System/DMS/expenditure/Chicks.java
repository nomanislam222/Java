package DMS.expenditure;
import DMS.produce.Chicken;
public class Chicks extends Chicken{
    String name;
    
    public Chicks(double rate, int amount, String name){
        super(rate,amount);
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName(String name){return name;}
    
    public void total()
    {
        TotalCost();
 
	
	}
    
}
