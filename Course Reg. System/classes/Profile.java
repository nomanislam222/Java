package classes;
import java.util.Scanner;
import Interface.StudentProfile;

public class Profile implements StudentProfile
{	
	public String name;
	private String email;
	private int pass;
	
	public static float balance,addMoney; 

	public Profile(){}
	public Profile(String name, String email , float balance, int pass, int coursename)

	{
		this.name = name;
		this.email = email;
		this.balance = balance;
		this.pass = pass;
		this.coursename=coursename;
	}
	
	public void setname(String name){
		this.name=name; 
	}
	public String getName()
	{
		return name;
	}


	public void setEmail(String email) {
		this.email=email; 
		
	}
	public String getEmail()
	{
		return email;
	}

	public void setPass(int pass) {
		this.pass=pass; 
		
	}
	public int getPass()
	{
		return pass;
	}

	
	public float getbalance(){
		return balance;
	}
    public void setcoursename(int coursename){
	this.coursename= coursename;}
	public int getcoursename(){
	return coursename;}



	public static void updateBalance(float adMoney)
	{
		addMoney = adMoney;
		balance = balance + addMoney;
	}


	

	public void showInformations()
	{
		System.out.println("           &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&            \n ");
		System.out.println("           &             NAME : "+name                        );
		System.out.println("           &             EMAIL : "+email                      );
		System.out.println("           &             WALLET : "+balance                   );
		System.out.println("           &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&          \n\n ");
	}
	
	
	
	
	

}