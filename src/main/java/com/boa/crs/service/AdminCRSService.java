package com.boa.crs.service;

import com.boa.crs.model.Course;
import com.boa.crs.model.Professor;

public interface AdminCRSService {

	public void addProfessor(Professor professor);

	public void addCourse(Course course);

	public void removeCourse(int id);

	public void approveStudentRegistration(int id);

	public void generateReport();

}
