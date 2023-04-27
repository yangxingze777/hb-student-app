package com.shiva.dao;

import java.util.List;

import com.shiva.entity.Student;

public interface StudentDAO {
	
	void addStudent(Student stu);
	List<Student> viewAllStudents();
	
	boolean deleteStudent(int sid);

}
