package com.prft.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="College")
public class College {
	@Id
	private int c_id;
	private String c_name;
	@OneToMany(targetEntity = Student.class)
	private List<Student> stud;
	public int getc_Id() {
		return c_id;
	}
	public void setc_Id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public List<Student> getStud() {
		return stud;
	}
	public void setStud(List<Student> stud) {
		this.stud = stud;
	}

}
