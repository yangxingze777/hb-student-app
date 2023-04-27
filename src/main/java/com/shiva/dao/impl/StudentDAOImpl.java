package com.shiva.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shiva.dao.StudentDAO;
import com.shiva.entity.Student;
import com.shiva.util.SessionUtil;


public class StudentDAOImpl implements StudentDAO {

	public void addStudent(Student stu) {
		// TODO Auto-generated method stub
		
		Session ses = SessionUtil.getSession();
		Transaction tx=ses.beginTransaction();
		ses.persist(stu);
		tx.commit();
		
		System.out.println("Data inserted successFully");
		
		ses.close();
		

	}

	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		Session ses = SessionUtil.getSession();
		Transaction tx=ses.beginTransaction();
		
		Query q=ses.createQuery("from Student");
		
		List <Student>stuRecords = q.getResultList();
		
		ses.close();
		
		return stuRecords;
	}

	public boolean deleteStudent(int sid) {
		// TODO Auto-generated method stub
		
		Session ses = SessionUtil.getSession();
		Transaction tx=ses.beginTransaction();
		
		Student student = ses.get(Student.class,sid);
		boolean flag=false;
		if(student!=null)
		{
		ses.delete(student);
		flag=true;
		}
		return flag;
	}

}
