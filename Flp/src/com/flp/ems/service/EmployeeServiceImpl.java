package com.flp.ems.service;
import java.util.Map;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public class EmployeeServiceImpl implements  IEmployeeService {

	@Override
	public void AddEmployee(Map hm) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Department dep=new Department();
		Project pro=new Project();
		Role rol=new Role();
		 emp.setName((String)hm.get("name"));
         emp.setKinid((int)hm.get("kinid")) ;
         emp.setEmail((String)hm.get("email"));
         emp.setPhn((String)hm.get("phone no"));
         emp.setDob((String)hm.get("dob"));
         emp.setDateofjoin((String)hm.get("date of join"));
         
         dep.setDepartmentid((int)hm.get("dept no"));
         
         rol.setRoleid((int)hm.get("role no"));
         
         pro.setProjectid((int)hm.get("phone no"));
         
		
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
