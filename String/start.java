public class start{
    public static void main(String[] args){
        String str1 = "Noman";//string literal
        String str2 = "Islam!";//string literal
        String str3 = new String("Java");//string object
        String str4 = new String("Java");//string object
      
        String str5 = str4.toLowerCase();//string literal
        String str6 = str1.concat(str2);//string literal


System.out.println(str6);
System.out.println("Noman"+"Islam");
System.out.println(str3.equals(str4));
System.out.println(str5.charAt(3));
System.out.println(str6.indexOf('1'));
System.out.println(str1.substring(0,1));
}
}