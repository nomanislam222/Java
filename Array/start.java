class start{
    
    
    public static void main(String args[]){
    
         Student s1 = new Student(" 21-45453-3","Noman","CSE",3.80);
        
         Student s2 = new Student("21-45453-4","Safayet","CSE",3.75);
    
         Student s3 = new Student("21-45453-5","Ankur","CSE",3.70);

         Student s4 = new Student("21-45453-6","Rony","CSE",3.60);
        
          
        
         Student data[]=new Student[7];
        
         data[0]=s1;
         data[2]=s2;
         data[3]=s3;
         data[5]=s4;
        
        for(int i=0;i<=6;i++){
        
            if(data[i]==null) continue;
            
            data[i].execute();
             
        }
        
        
    }
    
    
}
