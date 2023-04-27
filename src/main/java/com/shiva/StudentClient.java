package com.shiva;

import java.util.List;
import java.util.Scanner;

import com.shiva.dao.impl.StudentDAOImpl;
import com.shiva.entity.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentDAOImpl daoImpl = new StudentDAOImpl();
		while (true) {
			System.out.println("============================================");
			System.out.println("            1)AddStudent                    ");
			System.out.println("            2)ViewAllStudent                ");
			System.out.println("            3)DeleteStudent                ");
			System.out.println("            4)Exit                         ");

			System.out.println("============================================");

			System.out.println("Enter The Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Student Name");
				String sname = sc.next();
				System.out.println("Enter Student Address");
				String sadd = sc.next();
				System.out.println("Enter Student Email");
				String email = sc.next();
				Student stu = new Student();
				stu.setSname(sname);
				stu.setSadd(sadd);
				stu.setEmail(email);
				daoImpl.addStudent(stu);
				break;
			case 2:
				List<Student> viewAllStudents = daoImpl.viewAllStudents();

				for (Student st : viewAllStudents) {
					System.out.println(st.getSno() + "\t" + st.getSname() + "\t" + st.getSadd() + "\t" + st.getEmail());
				}
				break;
			case 3:
				System.out.println("Enter Student Id");
				boolean deleteStudent = daoImpl.deleteStudent(sc.nextInt());
				if (deleteStudent)
					System.out.println("Record Delete SucessFully");
				else
					System.out.println("Record is not Exist");

				break;
			case 4:
				System.out.println("Thx for Using App!");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 4 Between");

			}

		} // end of while

	}

}
