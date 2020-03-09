package com.prft.many2one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOne_Connection {
	public static void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_ManyToOne");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Student s1=new Student();
		s1.setSt_id(1001);
		s1.setS_name("Sachin");
		em.persist(s1);
		
		Subject s2=new Subject();
		s2.setSub_1("Physics");
		s2.setSub_2("Maths");
		s2.setSub_3("ComputerScience");
		s2.setStud(s1);
		
		Subject s3=new Subject();
		s3.setSub_1("DBMS");
		s3.setSub_2("DataStructure");
		s3.setSub_3("InternetProgramming");
		s3.setStud(s1);
		
		Subject s4=new Subject();
		s4.setSub_1("C++");
		s4.setSub_2("DSP");
		s4.setSub_3("CloudComputing");
		s4.setStud(s1);
		
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		
		em.getTransaction().commit();  
        em.close();  
          
}
}
