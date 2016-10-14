package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String name,job;
	Long salary;
	String test="abc";
	
	
	
	public String getTest1() {
		return test;
	}
	public void setTest(String test1) {
		this.test = test1;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", job=" + job + ", salary=" + salary + ", test=" + test + "]";
	}
	public User( String name, String job, Long salary) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	public User() {
		super();
		id=0l;
	}
	

}
