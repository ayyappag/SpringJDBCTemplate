package com.daointerface;

import java.util.List;

import javax.sql.DataSource;

import com.bean.Student;

public interface StudentDAO {
	
	 public void setDatasource(DataSource datasource);

	/**
	 * * This is the method to be used to create * a record in the Student
	 * table.
	 */
	public void create(String userid, String username,String email);
	public Student getStudent(String userid);
	public List<Student> listStudents() ;
}
