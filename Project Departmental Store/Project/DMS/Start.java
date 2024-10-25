package DMS;
import DMS.produce.*; 
import DMS.expenditure.*;
import java.io.*;
import java.util.Scanner;

public class Start {

public static void main(String[] args){     

//Scanner For Chicken
     Scanner input = new Scanner(System.in);
     System.out.println("======= Chicken =======");
     System.out.print("Rate:");
     double chicken_rate = input.nextDouble();
     System.out.print("Amount:");
     int chicken_amount = input.nextInt();

//Chicken Object
     Chicken obj = new Chicken(chicken_rate,chicken_amount);
     obj.TotalCost();
     obj.getTotalCost();
     double ckn = obj.total;

//Scanner For Egg    
     System.out.println("\n"+"======= Egg =======");
     System.out.print("Rate:");
     double egg_rate = input.nextDouble();
     System.out.print("Quantity:");
     int egg_amount = input.nextInt();
     System.out.print("Color:");
     String egg_color = input.next();

//Egg Object
     Chicken obj1 = new Chicken(egg_rate, egg_amount);
     Egg obj2 = new Egg(obj1,egg_color);
     obj2.EggTotal();
     obj1.getTotalCost();
     double egg = obj1.total;
     double produce = ckn+egg;

//Scanner For Chicks 
     System.out.println("\n"+"======= Chicks =======");
     System.out.print("Rate:");
     double chicks_rate = input.nextDouble();
     System.out.print("Quantity:");
     int chicks_amount = input.nextInt();
     System.out.print("Name:");
     String chicks_type = input.next();

//Chicks Object     
     Chicks obj3 = new Chicks(chicks_rate, chicks_amount, chicks_type);
     obj3.total();
     double cks = obj3.total;
     
     
//Scanner For Feed & Medicine   
     System.out.println("\n"+"===== Feed & Medicine =====");
     System.out.print("Feed:");
     double feed_rate = input.nextDouble();
     System.out.print("Medicine:");
     double medicine_rate = input.nextDouble();

//Feed & Medicine Object
     Medicine obj4 = new Medicine(feed_rate,medicine_rate);
     obj4.TotalCost();
     obj4.getTotalCost();
     double exp = obj4.total;
     double expenditure = exp+cks;
     double profit = produce - expenditure;

//Total Calculation      
      System.out.println();
      System.out.println("========Profit========");
      System.out.println("Total Produce:"+produce);
      System.out.println("Total Expenditure:"+expenditure);
      System.out.println("Total Profit:"+profit);

//Exception Handling & File.IO     
try{
   File file = new File("Slip.txt");

   if(file.createNewFile())   
   {  
   System.out.println("\n"+"file created "+file.getName()); 
   } 
 
   else  
   {  
   System.out.println("\n"+"File already exist");  
   }  

   FileWriter mw = new FileWriter(file,true);
    
   mw.write("Produce: Chicken + Egg"+"\n"+produce+"="+ckn+"+"+egg+"\n"+"\n"+"Expenditure: Chicks + Feed + Medicine"+"\n"+expenditure+"="+cks+"+"+feed_rate+"+"+medicine_rate+"\n"+"\n"+"Total Produce:"+produce+"\n"+"Total Expenditure:"+expenditure+"\n"+"Total Profit:"+profit+"\n");
   mw.flush();
   mw.close();    
}
 catch(IOException e){
System.out.println("Error");
e.printStackTrace();
}

}
}
   
   
    
