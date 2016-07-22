package com.flp.ems.domain;


public class Role {

		
		int roleid;
		//String designation;
		public int getRoleid() {
			return roleid;
		}
		public void setRoleid(int roleid) {
			this.roleid = roleid;
		}
		public Role setdept(Role role)
		{
			return role;
		}
		/*public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}*/
		@Override
		public String toString() {
			return "\n\nRole id= " + roleid ;
		}
		
}
