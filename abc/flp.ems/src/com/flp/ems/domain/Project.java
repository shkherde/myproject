package com.flp.ems.domain;


public class Project {

 int  projectid;

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(  int projectid) {
		this.projectid = projectid;
	}
	public Project setpro(Project pro)
	{
		return pro;
	}

	@Override
	public String toString() {
		return "\n\nProject id" + projectid ;
	}
	


}
	
	
	


