package com.boa.crs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
