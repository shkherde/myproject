package com.flp.ems.dao;

import java.util.List;

import com.flp.ems.domain.Employee;

public interface IEmployeeDao {
	 public void AddEmployee(Employee e);
	 public void SearchEmployee(String name,String Kinid,String email);
	 public List <Employee> GetAllEmployee();
	 public void RemoveEmployee(String n);
	public void ModifyEmployee(String z);
	 
	 

}
