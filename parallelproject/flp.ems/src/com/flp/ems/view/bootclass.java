package com.flp.ems.view;
import java.util.List;
import java.util.Scanner;

import com.flp.ems.domain.Employee;

public class bootclass {
	static UserInteraction ui= new UserInteraction();
	
	 public static void  menuselection()
	 {
		 Scanner sc2=new Scanner(System.in);
			int res;
			int w=1;
			java.util.List<Employee> empl;
			while(w==1)
			{
			System.out.println("enter the choice\n 1:add\n2:modify\n3:delete\n4:search\n5:view \n6:exit");
			res=sc2.nextInt();
			Employee emp;
			
			
			switch(res)
			{
			 case 1:
				 
				ui.AddEmployee();
				 break;
			 case 2:
				 ui.ModifyEmployee();
				
				 break;
			 case 3:
				 ui.RemoveEmployee();
				 break;
			 case 4:
				ui.SearchEmployee();
			
				 break;
			 case 5:
				 empl=ui.GetAllEmployee();
				 if(empl!=null)
				 {
					 System.out.println(empl);
				 }
				 else
				 {
					 System.out.println("null");
				 }
				 break;
			default:
				System.out.println("invalid opyion");
				break;
			}
				System.out.println("want to continue enter 1");
				w=sc2.nextInt();
			
			}
			
		 
	 }


public static void main(String args[])
{
	 bootclass bc=new bootclass();
	 
	  bc.menuselection();
	
	
}}