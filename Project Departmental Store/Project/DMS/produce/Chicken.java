package DMS.produce;
public class Chicken {
    public double rate;
    public int amount;
    public double total;
    
    public Chicken(double rate, int amount){
    this.rate = rate;
    this.amount = amount;
    }
    public void setRate(double rate){
    this.rate = rate;
    }
    
    public void setAmount(int amount){
    this.amount = amount;
    }
    
    public double getRate(){return rate;}
    public int getAmount(){return amount;}
    
 
     public void TotalCost(){
         total = rate*amount;
         System.out.println("Total Cost:"+total);
}
   public double getTotalCost(){
        total = rate*amount;
        return total;
}
    
}
