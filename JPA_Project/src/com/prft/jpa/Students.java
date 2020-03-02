package com.prft.jpa;

import javax.persistence.*;
@Entity
@Table(name="student")

public class Students {

	@Id
	private int reg_no;
	private String name;
	private String dept;
	public int getReg_no()
	{
		return reg_no;
	}
	public void setReg_no(int reg_no)
	{
		this.reg_no=reg_no;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}

}
