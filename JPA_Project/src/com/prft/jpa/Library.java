package com.prft.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Library")

public class Library {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Book_id;
private String Book_name;
@OneToOne
private Students std;
public Students getStd() {
	return std;
}
public void setStd(Students std) {
	this.std = std;
}
public int getBook_id() {
	return Book_id;
}
public void setBook_id(int book_id) {
	Book_id = book_id;
}
public String getBook_name() {
	return Book_name;
}
public void setBook_name(String book_name) {
	Book_name = book_name;
}


}
