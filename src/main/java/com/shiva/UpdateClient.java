package com.shiva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shiva.entity.Student;

public class UpdateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Configuration cfg=new Configuration();
   	    
	   	cfg.configure("com\\shiva\\config\\hibernate.cfg.xml");    
	   	    
	   	SessionFactory factory=cfg.buildSessionFactory();
	   	    
	   	Session ses=factory.openSession();

	   	Transaction tx=ses.beginTransaction();
	   	
	   	
	   	Student stu=new Student();
	   	stu.setSno(4);
	   	stu.setSname("shiva");
	   	stu.setSadd("usa");
	   	stu.setEmail("shiva@gmail.com");
	   	
		/*
		 * Student s =(Student) ses.merge(stu); if(s!=null)
		 * System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd()+"\t"+s.
		 * getEmail());
		 * 
		 * tx.commit();
		 */
	   	ses.saveOrUpdate(stu);
	   	tx.commit();
	   	
	   	
	}

}
