package com.prft.many2one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int st_id;
private String s_name;
public int getSt_id() {
	return st_id;
}
public void setSt_id(int st_id) {
	this.st_id = st_id;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
}
