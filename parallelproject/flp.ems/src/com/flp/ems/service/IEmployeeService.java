package com.flp.ems.service;

import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	
	 void AddEmployee(Map m);
	 
	void ModifyEmployee(String z);
	
	void RemoveEmployee(String y);
	
	void SearchEmployee(String name,String kinid,String email );
	 List <Employee> GetAllEmployee();

}
