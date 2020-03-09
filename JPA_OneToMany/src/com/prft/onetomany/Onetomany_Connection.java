package com.prft.onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Onetomany_Connection {
public static void main(String args[])
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_OneToMany");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	Student s1=new Student();
	s1.setReg_no(1001);
	s1.setS_name("Seetha");
	Student s2=new Student();
	s2.setReg_no(1002);
	s2.setS_name("Deekshitha");
	em.persist(s1);
	em.persist(s2);
	ArrayList<Student> list=new ArrayList<Student>();
	list.add(s1);
	list.add(s2);
	College c1=new College();
	c1.setc_Id(2110);
	c1.setC_name("JMEC");
	c1.setStud(list);
	em.persist(c1);
	em.getTransaction().commit();
	em.close();
	
	
}
}
