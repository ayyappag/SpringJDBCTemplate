package com.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.daoimplementation.StudentJDBCTemplate;

public class TestJdbcTemplate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		StudentJDBCTemplate studentJdbcTemplate = (StudentJDBCTemplate) ctx
				.getBean("studentJdbcTemplate");
		System.out.println("test create ** ");
		studentJdbcTemplate.create("KEY5", "KEY5", "KEY5@GMAIL.COM");
		Student student = studentJdbcTemplate.getStudent("KEY1");
		System.out.println("Student object using --- " + student.getEmail()
				+ "-- user id -- " + student.getUserid());

		List<Student> list = studentJdbcTemplate.listStudents();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student studentList = (Student) iterator.next();
			System.out.println("email -- " + studentList.getEmail()
					+ "-- userid--" + studentList.getUserid());
		}

	}

}
