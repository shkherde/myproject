package com.flp.ems.domain;
//import com.flp.ems.util.Validate;



public class Employee {
	
	String name;
	int Employeeid;
	 String kinid;
	 String email;
	 String phn;
	 String dateofjoin;
	 String dob;
	  
	 private  Project project;
	  private Role role;
	private Department department;
	  
	  
	public Department getdept()
	{
		return department;
	}
	public void setdept(Department department){
		this.department=department;
	
	}
	
	public Project getpro()
	{
		return project;
	}
	
	public void setpro(Project project){
		this.project=project;
	}
	public Role getrole()
	{
		return role;
	}
	public void setrole(Role role){
		this.role=role;
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
	public String getKinid() {
		return kinid;
	}
	public void setKinid(String kinid) {
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
	

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((kinid == null) ? 0 : kinid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (kinid == null) {
			if (other.kinid != null)
				return false;
		} else if (!kinid.equals(other.kinid))
			return false;
		return true;
	}*/
	@Override
	public String toString() {
		return "Employee: \n\nname=" + name + "\n\nEmployeeid=" + Employeeid + "\n\nkinid=" + kinid + "\n\nemail=" + email
				+ "\n\nphn=" + phn + "\n\ndateofjoin=" + dateofjoin + "\n\ndob=" + dob +project 
				+ role + department ;
	}
}
