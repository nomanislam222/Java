package DMS.expenditure;
public class Medicine extends Feed {
    
    private double medicine;
    public double total;
    
   public Medicine(double feed, double medicine){
        super(feed);
        this.medicine = medicine;
    }
    
    public void setMedicine(double medicine){
    this.medicine = medicine;
    }
    
    public double getMedicine(){return medicine;}
    
    public void TotalCost()
    {
    total = feed+medicine;
    System.out.println("Total Cost: "+total);
    } 

      public double getTotalCost(){
        total = feed+medicine;
        return total;
}
    
    
}
