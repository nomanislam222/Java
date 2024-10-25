import java.util.Scanner;

class test{
public static void main(String args[]){
System.out.println("Input your id please");
Scanner data1 = new Scanner(System.in);


int id = data1.nextInt();
System.out.println("Thanks! Now Input your name for next step");
Scanner data2 = new Scanner(System.in);
String name = data2.nextLine();

System.out.println("Your Id Number: " + id);
System.out.println("Your Name: " + name);
}}