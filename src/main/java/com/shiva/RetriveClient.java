package com.shiva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shiva.entity.Student;

public class RetriveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Configuration cfg=new Configuration();
	   	    
	   	cfg.configure("com\\shiva\\config\\hibernate.cfg.xml");    
	   	    
	   	SessionFactory factory=cfg.buildSessionFactory();
	   	    
	   	Session ses=factory.openSession();

	   	Transaction tx=ses.beginTransaction();
	   	
	   	
		/*
		 * Student stu = ses.get(Student.class,4);//Eager Loading if(stu!=null)
		 * System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd()+"\t"+
		 * stu.getEmail()); else System.out.println("Data is not Exist");
		 */
	   	
	  	Student stu = ses.load(Student.class,4);//Lazy Loading
	   	if(stu!=null)
	   		System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd()+"\t"+stu.getEmail());
	   	else
	   		System.out.println("Data is not Exist");
	   	
	   	
	   	
	   	
	}

}
