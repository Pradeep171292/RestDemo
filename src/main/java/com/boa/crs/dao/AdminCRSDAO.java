/**
 * 
 */
package com.boa.crs.dao;

import com.boa.crs.model.Course;
import com.boa.crs.model.Professor;
import com.boa.crs.model.Student;

/**
 * @author Admin
 *
 */
public interface AdminCRSDAO {
	
	 public void addProfessor(Professor professor);
	 public void addCourse(Course course);
	 public void removeCourse(int id);
	 public boolean approveStudentRegistration(Student student);
	 public void generateReport(int id);

}
