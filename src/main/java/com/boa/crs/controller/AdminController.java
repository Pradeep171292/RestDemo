package com.boa.crs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boa.crs.model.Course;
import com.boa.crs.model.Professor;
import com.boa.crs.service.AdminCRSService;

import jakarta.ws.rs.core.MediaType;

@RestController
public class AdminController {
	
	@Autowired
	private AdminCRSService adminCRSService;

	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.POST,
			value = "/addProfessor")
	public ResponseEntity addProfessor(@RequestBody Professor professor) {
		adminCRSService.addProfessor(professor);
		return new ResponseEntity(professor, HttpStatus.OK);
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.POST,
			value = "/addCourse")
	public ResponseEntity addCourse(@RequestBody Course course) {
		adminCRSService.addCourse(course);
		return new ResponseEntity(course, HttpStatus.OK);
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.POST,
			value = "/removeCourse/{id}")
	public ResponseEntity removeCourse(@PathVariable int id) {
		 adminCRSService.removeCourse(id);
		return new ResponseEntity(id, HttpStatus.OK);

	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.POST,
			value = "/approveStudentRegistration/{id}")
	public ResponseEntity approveStudentRegistration(@PathVariable int id) {
		 adminCRSService.approveStudentRegistration(id);
		return new ResponseEntity(id, HttpStatus.OK);

	}
}
