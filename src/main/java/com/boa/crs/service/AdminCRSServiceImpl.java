package com.boa.crs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.crs.model.Course;
import com.boa.crs.model.Professor;
import com.boa.crs.dao.AdminCRSDAO;

@Service
public class AdminCRSServiceImpl implements AdminCRSService {

	@Autowired
	private AdminCRSDAO adminCRSDao;
	
	

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		adminCRSDao.addCourse(course);
	}

	@Override
	public void removeCourse(int id) {
		// TODO Auto-generated method stub
		System.out.println("Remove Course");
		adminCRSDao.removeCourse(id);
	}

	@Override
	public void approveStudentRegistration(int id) {
		// TODO Auto-generated method stub
		System.out.println("Approve Student");
		adminCRSDao.approveStudentRegistration(id);
	}

	@Override
	public void generateReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProfessor(Professor professor) {
		adminCRSDao.addProfessor(professor);
		
	}
}
