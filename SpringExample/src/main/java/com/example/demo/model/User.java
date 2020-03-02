package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Deekshitha")

public class User {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long reg_no;
		private String name;
		private String dept;
		public long getReg_no()
		{
			return reg_no;
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
