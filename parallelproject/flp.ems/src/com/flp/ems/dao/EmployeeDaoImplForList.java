package com.flp.ems.dao;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import com.flp.ems.domain.Employee;
import java.util.Set;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;


public class EmployeeDaoImplForList implements IEmployeeDao {
	 List<Employee> emps=new ArrayList<Employee>();
	 
	 List<Department>deps=new ArrayList<Department>();
	List<Project>pos=new ArrayList<Project>();
	 List<Role>rols=new ArrayList<Role>();
	// Employee empp= new Employee();
	 Scanner sc= new Scanner(System.in);
	 Set<Employee> sset=new HashSet<Employee>();
	 
	  public void AddEmployee(Employee empp)
	  {
		   sset.add(empp);
		  emps.add(empp);
		  deps.add(empp.getdept());
		  pos.add(empp.getpro());
		rols.add(empp.getrole());
		  //System.out.println(emps.isEmpty());
		  //System.out.println(emps);
		  //return empp;
	  }
	  
	
	  public void SearchEmployee(String name,String Kinid,String email) 
		{
		 
			 for(Employee empp : emps)
			 {
		        if(empp.getName().equals(name))
			        {
			        	System.out.println("Employee found");
			        }
		        else if(empp.getKinid().equals(Kinid))
			        {
		        	System.out.println("Employee found");
			        }
		        
		        else if(empp.getEmail().equals(email))
		        {
		        	System.out.println("Employee found");
		        }
		        else if(empp.getKinid().equals(Kinid)&&empp.getName().equals(name))
		        {
		        	System.out.println("Employee found");
		        }
		        else if(empp.getName().equals(name)&&empp.getEmail().equals(email))
		        {
		        	System.out.println("Employee found");
		        }
		        else if(empp.getKinid().equals(Kinid)&&empp.getEmail().equals(email))
		        {
		        	System.out.println("Employee found");
		        }
		        else if(empp.getKinid().equals(Kinid)&&empp.getName().equals(name)&&empp.getEmail().equals(email))
		        {
		        	System.out.println("Employee found");
		        }
		        else{
		        	System.out.println("employee not found");
		        }
	        	
		 
			 
			 
			 
			 }
			  
			
		}
	  
	  

	  
         public List<Employee> GetAllEmployee(){
        	 //System.out.println("hhh");
        	  return emps;
        	 
         }
         public void RemoveEmployee(String n)
         {
        	 Iterator <Employee> itr= emps.iterator();
        	 while(itr.hasNext())
        	 {
        		 
        			 Employee emp=(Employee)itr.next();
        			 if(emp.getKinid().equals(n))
            		 {
            			 emps.remove(emp);
            			 System.out.println("removed");
            			
            			 }
        			 else
        			 {
        				 continue;
        			 }
        			 
        		 
        	 }
        	 
        	 
         }
         

         public void ModifyEmployee(String z)
         {
        	 Iterator<Employee> itr = emps.iterator();
     		while(itr.hasNext())
     		{
     			Employee e = (Employee) itr.next();
     			if(e.getKinid().equals(z)){
     				System.out.println("Enter the field you want to modify\npress\n1:Name\n2:Email\n3:kin id\n4:Phone no\n5:date of birth\n6:date of joining");
     			int i = sc.nextInt();
     			switch(i){
     			case 1:System.out.println("Enter the new name");
     			 String newname=sc.next();
     			e.setName(newname);
     			break;
     			
     			case 2 : System.out.println("Enter the new email");
     			String newemail=sc.next();
     			e.setEmail(newemail);
     			break;
     			
     			case 3:System.out.println("Enter the new kin id");
     			String newkinid = sc.next();
     			e.setKinid(newkinid);
     			break;
     			case 4:System.out.println("Enter the new phone no");
     			String phn=sc.next();
     			e.setPhn(phn);
     			break;
     			case 5:System.out.println("Enter the new date of birth");
     			String newdob = sc.next();
     			e.setDob(newdob);
     			break;
     			case 6: System.out.println("Enter the new date of joining");
     			String newdoj = sc.next();
     			e.setDateofjoin(newdoj);
     			break;
     			}
     			}
     			
     		}
     		
         }
}

