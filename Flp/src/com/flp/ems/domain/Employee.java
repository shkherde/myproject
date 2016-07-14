package com.flp.ems.domain;
//import com.flp.ems.util.Validate;



public class Employee {
	
	String name;
	int Employeeid;
	 int kinid;
	 String email;
	 String phn;
	 String dateofjoin;
	 String dob;
	  Department deptartment;
	  Project project;
	  Role role;
	  
	  
	public int getdept()
	{
		return deptartment.getDepartmentid();
	}
	
	public int getpro()
	{
		return project.getProjectid();
	}
	
	public int getrole()
	{
		return role.getRoleid();
	}
	
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	public int getKinid() {
		return kinid;
	}
	public void setKinid(int kinid) {
		this.kinid = kinid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public String getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(String dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	/*int Employeeid;
	 int kinid;
	 String email;
	 String phn;
	 String dateofjoin;
	 String dob;
	 Boolean b1;
	 Boolean b2;
	 Validate vd=new Validate();
	  Scanner sc=new Scanner(System.in);
	  */
}
