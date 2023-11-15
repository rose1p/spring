package com.example.domain;

import java.util.Date;

public class ProVO {
	private String pcode;
	private String pname;
	private String dept;
	private Date hiredate;
	private String title;
	private String salary;

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "ProVO [pcode=" + pcode + ", pname=" + pname + ", dept=" + dept + ", hiredate=" + hiredate + ", title="
				+ title + ", salary=" + salary + "]";
	}

}
