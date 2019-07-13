package com.daoimplementation;

import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.Student;
import com.bean.StudentMapper;
import com.daointerface.StudentDAO;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource datasource;
	private JdbcTemplate jdbcTemplateObject;


	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTemplateObject = new JdbcTemplate(datasource);
	}

	public void create(String userid, String username, String email) {
		

	
			String SQL = "insert into Student (userid, username , email) values (?, ?, ?)";
			jdbcTemplateObject.update(SQL, userid, username, email);
			System.out.println("Created Record Name=" + userid + " username="
					+ username);
		
		return;
	}

	public Student getStudent(String userid) {
		String SQL = "select * from Student where userid = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { userid }, new StudentMapper());
		return student;
	}

	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL,
				new StudentMapper());
		return students;

	}

}
