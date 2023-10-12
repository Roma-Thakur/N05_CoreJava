package com.tnsif.jdbc.mvc;

import java.sql.SQLException;
import java.util.List;
//Program to define Service interface for JDBC Crud operation on Student

public interface IStudentService {

	abstract void addStudent(Student student) throws SQLException;
	
	List<Student> getAllStudents() throws SQLException;
	
	List<Student> getStudentsByPer(int value) throws SQLException;
	
	List<Student> getStudentsNameStartsWith(String str) throws SQLException;
	
	int deleteAllStudents() throws SQLException;
	
	int deleteByRollNo(int value)throws SQLException;
	
	int updateStudentPer(int value) throws SQLException;
	
	int updateStudentPerByRollNo(int rvalue, int pvalue) throws SQLException;


}
