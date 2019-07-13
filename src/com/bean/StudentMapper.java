package com.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setUserid(rs.getString("userid"));
		student.setEmail(rs.getString("userid"));
		student.setUsername(rs.getString("username"));
	
		return student;
	}
}
