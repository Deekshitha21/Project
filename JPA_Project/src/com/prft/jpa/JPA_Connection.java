package com.prft.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_Project");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Students s1=new Students();
		//Inserting values
		s1.setReg_no(1001);
		s1.setName("Deekshitha");
		s1.setDept("CSE");
		Students s2=new Students();
		s2.setReg_no(1002);
		s2.setName("VijayaLakshmi");
		s2.setDept("ECE");
		Students s3=new Students();
		s3.setReg_no(1003);
		s3.setName("Deepika");
		s3.setDept("CIVIL");
		Library l1=new Library();
		l1.setBook_id(1);
		l1.setBook_name("HARRY POTTER");
		l1.setStd(s1);
		Library l2=new Library();
		l2.setBook_id(2);
		l2.setBook_name("HARRY POTTER");
		l2.setStd(s2);
		Library l3=new Library();
		l3.setBook_id(3);
		l3.setBook_name("HARRY POTTER");
		l3.setStd(s3);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(l1);
		em.persist(l2);
		em.persist(l3);
		//Finding values
		/*System.out.println("Before update:");
		s1=em.find(Students.class,1001);
		System.out.println("Register No:"+s1.getReg_no());
		System.out.println("Name:"+s1.getName());
		System.out.println("Department:"+s1.getDept());
		//Update values
		System.out.println("After Update");
		s1.setDept("MECH");
		System.out.println("Register No:"+s1.getReg_no());
		System.out.println("Name:"+s1.getName());
		System.out.println("Department:"+s1.getDept());
		//Deleting entity
		em.remove(s1);*/
		em.getTransaction().commit();
		em.close();


	}

}
