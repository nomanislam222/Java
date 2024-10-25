class Student{
    
    String id;
    String name;
    String fac;
    double cgpa;
    
    Student(String i,String n,String f,double c){
    
          this.id=i;
          this.name=n;
          this.fac=f;
          this.cgpa=c;
        
    }
        
    void execute(){
    
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Faculty: "+fac);
        System.out.println("CGPA: "+cgpa);
        
     }
    
    
}
