package com.shiva;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shiva.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
    
cfg.configure("com\\shiva\\config\\hibernate.cfg.xml");    
    
System.out.println(cfg.getProperty("hibernate.connection.driver_class"));

SessionFactory factory=cfg.buildSessionFactory();
    
Session ses=factory.openSession();

Transaction tx=ses.beginTransaction();
Student stu=new Student();//Transient state
stu.setSname("rani");
stu.setSadd("USA");
stu.setEmail("siva@gmail.com");

ses.persist(stu);
tx.commit();
System.out.println(ses.contains(stu));//true
ses.evict(stu);//detached state
System.out.println(ses.contains(stu));//false

ses.close();
factory.close();


    
    
    }
}
