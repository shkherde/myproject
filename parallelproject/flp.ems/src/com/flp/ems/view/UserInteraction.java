package com.flp.ems.view;
 import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.validate_date;
 
 
public class UserInteraction {
 Scanner sc=new Scanner(System.in);
	// Map<String,Object> hm= new HashMap<String,Object>();
	 IEmployeeService empser;
	 //empser=new EmployeeServiceImpl();
	 int x;
	 String y;
	 String z;
	 
	 
	 public UserInteraction() {
		 empser=new EmployeeServiceImpl();
		
	}


	public void AddEmployee()
	 {       Map<String,Object> hm= new HashMap<String,Object>();
	       validate_date v=new validate_date();
	       String doj;
	       String dob;
	       Boolean b1;
	       Boolean b2;
	       
	     do{
	    	 System.out.println ("enter the name");
		 String name=sc.next();
		  b1=v.validateName(name);
		  if(b1)
		  {
			  hm.put("name",name);
		  }
		  else{
			  System.out.println("invalid");
		  }
	     }while(b1==false);
	     do{
	    	 System.out.println ("enter the kinid");
	    	 String kin=sc.next();
	    	 b1=v.validateKinid(kin);
	    	if(b1)
	    	{
	             hm.put("kinid",kin);
	    	}
	    	else
	    	{
	    		System.out.println("invalid");
	    	}
	     }while(b1==false);
	     /*System.out.println ("enter the kinid");
	     hm.put("kinid",sc.next());*/
	     do{
	    	 
	        System.out.println ("enter the email");
	      String email1=sc.next();
	        b1=v.validateEmail(email1);
	 if(b1){
	        hm.put("email",email1);
	 }
	 else
	 {      
		 System.out.println("invalid");
	 }
	 }while(b1==false);
	 do{
	 System.out.println ("enter the phone");
	 String ph=sc.next();
	 b1=v.validatephone(ph);
	 if(b1)
	 {
	 hm.put("phone no",ph);
	 }
	 else
	 {
		 System.out.println("invalid");
	 }
	 }while(b1==false);
	  System.out.println("enter the role id");
	hm.put("role no",sc.nextInt());
	System.out.println("enter the dept id");
	hm.put("dept no",sc.nextInt());
	System.out.println("enter the project id");
	hm.put("project id",sc.nextInt());

	do{
		
	System.out.println ("enter the date of joining");
	  doj=sc.next();
	  b1=v.valid_Date(doj);
	  System.out.println(b1);
	  if(b1){
		  hm.put("date of join",doj);
		  //System.out.println("invaild doj");
	  }
	  else
	  {
		  System.out.println("invaild doj");
		  //hm.put("date of join",doj);
	  }
	}while(b1=false);
do{
	  System.out.println ("enter the birth date");
	  dob=sc.next();
	  b2=v.valid_Date(dob);
	   System.out.println(b2);
	   if(b2){
			 
			  hm.put("dob",dob);
		  }
		  else
		  {
			  System.out.println("invaild doj");
			
		  }
	   
	}while(b2==false);
	  

		System.out.println(hm);
	empser.AddEmployee(hm);
	 }
	
	 public void  ModifyEmployee()
	 {
		 System.out.println("enter the kinid of the emp to modify");
		 z=sc.next();
		 empser.ModifyEmployee(z);
	 }
	      public void RemoveEmployee()
		 {
	    	  System.out.println("enter kinid to be searched");
	    	  y=sc.next();
	    	  empser.RemoveEmployee(y);
		 }
		 
		 public List<Employee> GetAllEmployee()
		 
		 {     //System.out.println("usr");
			  return empser.GetAllEmployee();
			  
		 
		 }
		 public void SearchEmployee()
		 {    
			 System.out.println("enter the opyion for search\n1.kinid\n2.name\n3.email\n4.name and kinid\n5.name and email\n6.kinid and email\n7. all three");
			 x=sc.nextInt();
			 switch(x)
			 {
			 case 1:
				 System.out.println("enter the kinid to be searched:");
					String kinid=sc.next();
					empser.SearchEmployee("*",kinid,"*");
					break;
			 case 2:
				 System.out.println("enter the name to be searched:");
					String name=sc.next();
					empser.SearchEmployee(name,"*","*");
					break;
			 case 3:
				 System.out.println("enter the email to be searched:");
					String email=sc.next();
					 empser.SearchEmployee("*","*",email);
					break;
			 case 4:
				 System.out.println("enter the name and kinid to be searched:");
					String kinid1=sc.next();
					String name1=sc.next();
					empser.SearchEmployee(name1,kinid1,"*");
					break;
			 case 5:
				 System.out.println("enter the namme and email to be searched:");
					String name2=sc.next();
					String email2=sc.next();
					empser.SearchEmployee(name2,"*",email2);
					break;
			 case 6:
				 System.out.println("enter the kinid and email to be searched:");
					String kinid3=sc.next();
					String email3=sc.next();
					 empser.SearchEmployee("*",kinid3,email3);
				break;
			 case 7:
				 System.out.println("enter name, kinid and email");
					String name4=sc.next();
					String kinid4=sc.next();
					String email4=sc.next();
					empser.SearchEmployee(name4,kinid4,email4);
					break;
				 
			 }
			
		 }
	 
	 
	 
	

	 }
