package com.boa.crs.model;

public class Course {

	Integer courseId;
	
	String courseName;
	
	Double fees;
	/**
	 * @return the courseId
	 */
	public Integer getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the fees
	 */
	public Double getFees() {
		return fees;
	}

	/**
	 * @param fees the fees to set
	 */
	public void setFees(Double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + "]";
	}

}
