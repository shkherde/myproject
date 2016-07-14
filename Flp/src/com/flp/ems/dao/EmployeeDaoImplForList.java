package com.flp.ems.dao;
import java.util.ArrayList;

import com.flp.ems.domain.Employee;

/*import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
*/

public class EmployeeDaoImplForList {
	 ArrayList<Employee> emps=new ArrayList<Employee>();
	 
	 ArrayList<Integer>deps=new ArrayList<Integer>();
	 ArrayList<Integer>pos=new ArrayList<Integer>();
	 ArrayList<Integer>rols=new ArrayList<Integer>();
	  public void AddEmployee(Employee empp)
	  {
		  emps.add(empp);
		  deps.add(empp.getdept());
		  pos.add(empp.getpro());
		  rols.add(empp.getrole());
	  }

}
