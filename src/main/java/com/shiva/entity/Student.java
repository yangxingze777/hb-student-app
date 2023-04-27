package com.shiva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
@Column(name = "SNO")
	@GenericGenerator(name = "myGenerator",strategy = "increment")
	@GeneratedValue(generator = "myGenerator",  strategy = GenerationType.AUTO)
	private int sno;
	
	@Column(name = "SNAME")
	private String sname;
	@Column(name = "SADD")
	private String sadd;
	@Column(name = "EMAIL")
	private String email;
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int sno, String sname, String sadd, String email) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
