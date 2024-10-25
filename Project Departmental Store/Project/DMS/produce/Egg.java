package DMS.produce;
public class Egg {
   private Chicken chicken;
   public String type;
   
   public Egg(Chicken chicken, String type){
   this.chicken = chicken;
   this.type = type;
   }
   public void setChicken(Chicken chicken)
   {
       this.chicken = chicken;
   }
   
   public void setType(String type)
   {
       this.type = type;
   }
   
   public Chicken getChicken(){return chicken;}
   public String getType(){return type;}
   public void EggTotal()
   {
       chicken.TotalCost();

	
	}
    
    
}
