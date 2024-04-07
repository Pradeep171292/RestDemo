package com.boa.crs.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boa.crs.model.Course;
import com.boa.crs.model.Professor;
import com.boa.crs.model.Student;

@Repository
public class AdminCRSDAOImpl implements AdminCRSDAO {

	Logger logger = LoggerFactory.getLogger(AdminCRSDAOImpl.class);
	
	// DI injection of JDBCTemplate
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	

	@Override
	@Transactional
	public void addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		 String SQL = "insert into professor (name) values (?)";
		 jdbcTemplateObject.update( SQL, professor.getName());
		 System.out.println("Created Record Name = " + professor.getName());
		 return;
	}

	@Override
	@Transactional
	public void addCourse(Course course) {
		 String SQL = "insert into course (courseName,fees) values (?,?)";
		 jdbcTemplateObject.update( SQL, course.getCourseName(),course.getFees());
		 System.out.println("Created Record courseName = " + course.getCourseName() + "and Fees of the Course :- "+ course.getFees());
		 return;
	}

	@Override
	@Transactional
	public void removeCourse(int id) {
		String SQL = "delete from course where courseId = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	@Override
	public void approveStudentRegistration(int  studentId) {
		// TODO Auto-generated method stub
		String SQL = "update student set approved = true where id = ?";
		jdbcTemplateObject.update(SQL, studentId);
		System.out.println("Approved student with ID = " + studentId);
		return ;
	}

	@Override
	public void generateReport(int id) {
		// TODO Auto-generated method stub
		
	}
}
