package com.flp.ems.domain;

public class Department {
	int departmentid;

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	
	public Department setdept(Department department)
	{
		return department;
	}

	@Override
	public String toString() {
		return "\n\nDepartment id=" + departmentid ;
	}
	

}
