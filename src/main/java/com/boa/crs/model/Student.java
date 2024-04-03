package com.boa.crs.model;

import java.util.List;

public class Student {
	
	Integer id;
	
	String name;
	
	String address;
	
	List<Grade> grade;
	
	List<Course> cource;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Grade> getGrade() {
		return grade;
	}

	public void setGrade(List<Grade> grade) {
		this.grade = grade;
	}

	public List<Course> getCource() {
		return cource;
	}

	public void setCource(List<Course> cource) {
		this.cource = cource;
	}
	
	

}
