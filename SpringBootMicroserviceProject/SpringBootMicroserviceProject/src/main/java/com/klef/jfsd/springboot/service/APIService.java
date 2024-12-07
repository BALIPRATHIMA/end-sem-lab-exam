package com.klef.jfsd.springboot.service;

import java.util.List;

public interface APIService 
{
	//Internal API - SpringBootRestAPIProject
	
	public List<Object> displayAllStudents();
	public Object displayStudentById(int sid);
	
	//External API - JSON Placeholder
	
	public List<Object> displayAllUsers();
	public Object displayUserById(int id);

}
