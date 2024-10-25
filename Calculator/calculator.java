import java.util.Scanner;

public class calculator{
        
    public static void main(String[] args){    
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 2 Digits:");        
        double aa= ob.nextDouble();
        double bb= ob.nextDouble();
        
     main cal = new main();
       cal.add(aa,bb);
       cal.sub(aa,bb);
       cal.mul(aa,bb);
       cal.div(aa,bb);
        
    }  
}
