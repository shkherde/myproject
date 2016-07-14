package com.flp.ems.view;
import java.util.Scanner;

public class bootclass {
	
	 public static void  menuselection()
	 {
		 Scanner sc2=new Scanner(System.in);
			int res;
			System.out.println("enter the choice\n 1:add\n2:modify\n3:delete\n4:search");
			res=sc2.nextInt();
			UserInteraction ui= new UserInteraction();
			
			switch(res)
			{
			 case 1:
				 ui.AddEmployee();
				 break;
			 case 2:
				 //ModifyEmployee();
				 break;
			 case 3:
				 //RemoveEmployee();
				 break;
			 case 4:
				 //SearchEmployee();
				 break;
			 case 5:
				 //GetallEmployee();
				 break;
			default:
				System.out.println("invalid opyion");
			
			}
			
		 
	 }


public static void main(String args[])
{
	 bootclass bc=new bootclass();
	 
	  bc.menuselection();
	
	
}}