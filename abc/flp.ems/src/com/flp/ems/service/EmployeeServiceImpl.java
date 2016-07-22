package com.flp.ems.service;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.IEmployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public class EmployeeServiceImpl implements  IEmployeeService {
	 IEmployeeDao empdao;
	 static HashSet<String> hskin=new HashSet<String>();
		static HashSet<String> hsemail=new HashSet<String>();
		
	 
	 

	public EmployeeServiceImpl() {
		empdao=new EmployeeDaoImplForList();
	}
	
	@Override
	public void  AddEmployee(Map hm) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Department dep=new Department();
		Project pro=new Project();
		Role rol=new Role();
		
         if (hskin.contains(hm.get("kinid")))
 		{
 			System.out.println("kin id already exists");
 			return;
 		}
         else
         {
 		hskin.add((String) hm.get("kinid"));
         }
 		
         if(hsemail.contains(hm.get("email")))
  		{
  			System.out.println("email already exists");
  			return;
  			
  		}
         else
         {
  		
  			hsemail.add((String) hm.get("email"));
         }
  		
         emp.setName((String)hm.get("name"));
         emp.setKinid((String)hm.get("kinid")) ;
         emp.setEmail((String)hm.get("email"));
         emp.setPhn((String)hm.get("phone no"));
         emp.setDob((String)hm.get("dob"));
         emp.setDateofjoin((String)hm.get("date of join"));
         dep.setDepartmentid((int)hm.get("dept no"));
          rol.setRoleid((int)hm.get("role no"));
         pro.setProjectid((int)hm.get("project id"));
         emp.setdept(dep);
         emp.setpro(pro);
         emp.setrole(rol);
         empdao.AddEmployee(emp);
        
		
	}

	@Override
	public void ModifyEmployee(String z) {
		empdao.ModifyEmployee(z);
		
	}

	@Override
	public void RemoveEmployee(String n) {
		
		empdao.RemoveEmployee(n);
	}


	public void SearchEmployee(String i,String j,String g ) {
     /* System.out.println("ppp");
         System.out.println(i);*/
		empdao.SearchEmployee(i,j,g);
		
		
	}

	
	public List <Employee> GetAllEmployee() {
		//System.out.println("yyy");
		return empdao.GetAllEmployee();
		
	}

}
