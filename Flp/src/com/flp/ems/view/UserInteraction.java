package com.flp.ems.view;
 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
 
public class UserInteraction {
 Scanner sc=new Scanner(System.in);
	 Map<String,Object> hm= new HashMap<String,Object>();
	 
	 public void AddEmployee()
	 {      
		 System.out.println ("enter the name");
	  hm.put("name",sc.next());
	 System.out.println ("enter the kinid");
	 hm.put("kinid",sc.nextInt());
	 System.out.println ("enter the email");
	 hm.put("email",sc.next());
	 System.out.println ("enter the phone");
	 hm.put("phone no",sc.next());
	 System.out.println ("enter the date of joining");
	 hm.put("date of join",sc.next());
	  System.out.println ("enter the birth date");
	  hm.put("dob",sc.next());
	  System.out.println("enter the role id");
	hm.put("role no",sc.nextInt());
	System.out.println("enter the dept id");
	hm.put("dept no",sc.nextInt());
	System.out.println("enter the project id");
	hm.put("project id :",sc.nextInt());
	System.out.println(hm);
	
	 /*public void ModifyEmployee()
	 {
		 
	 }
	      public void RemoveEmployee()
		 {
			 
		 }
		 public void SearchEmployee()
		 {
			 
		 }
		 public void GetAllmployee()
		 {
			 
		 }
	 */
	 
	 
	

	 }}
