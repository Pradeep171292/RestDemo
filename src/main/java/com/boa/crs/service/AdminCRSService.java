package com.boa.crs.service;

import com.boa.crs.model.Professor;

public interface AdminCRSService {

	public void addProfessor(Professor professor);

	public void addCourse();

	public void removeCourse();

	public void approveStudentRegistration();

	public void generateReport();
}
