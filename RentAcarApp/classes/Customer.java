package classes;

import java.lang.*;
import interfaces.Ivehicles;


public class Customer 

{
	private String name;
	private String gender;
	private int age;
	private int nid;
	private String phone;
	private String address;
	private String vRegNo;
	
	
	public Customer(String name,String gender,int age,int nid,String phone,String address)
	
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.nid=nid;
		this.phone=phone;
		this.address=address;
	}
	public void setName(String name){this.name=name;}
	public void setGender(String gender){this.gender=gender;}
	public void setAge(int age){this.age=age;}
	public void setNid(int nid){this.nid=nid;}
	public void setPhone(String phone){this.phone=phone;}
	public void setAddress(String address){this.address=address;}
	public void setvRegNo(String vRegNo) {
		this.vRegNo = vRegNo;
	}
	public String getvRegNo() {
		return vRegNo;
	}

	
	public String getName(){return name;}
	public String getGender(){return gender;}
	public int getAge(){return age;}
	public int getNid(){return nid;}
	public String getPhone(){return phone;}
	public String getAddress(){return address;}
	
	public void showInfo()
	{
		System.out.println("Customer's NAME: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("NID No: "+nid);
		System.out.println("Contact Number: "+phone);
		System.out.println("Address: "+address);
		System.out.println("Rented Car REGNO : " + vRegNo);
		System.out.println();
		System.out.println();
		
	}
		
	
	
}