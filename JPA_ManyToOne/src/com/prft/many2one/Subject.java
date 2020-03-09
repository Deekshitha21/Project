package com.prft.many2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_id;
	private String sub_1;
	private String sub_2;
	private String sub_3;
	@ManyToOne
	private Student stud;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getSub_1() {
		return sub_1;
	}
	public void setSub_1(String sub_1) {
		this.sub_1 = sub_1;
	}
	public String getSub_2() {
		return sub_2;
	}
	public void setSub_2(String sub_2) {
		this.sub_2 = sub_2;
	}
	public String getSub_3() {
		return sub_3;
	}
	public void setSub_3(String sub_3) {
		this.sub_3 = sub_3;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}

}
