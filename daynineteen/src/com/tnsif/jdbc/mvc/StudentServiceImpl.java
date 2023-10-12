package com.tnsif.jdbc.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService{
	static Connection cn;
	Statement st;
	PreparedStatement pst;
	
	public StudentServiceImpl() throws SQLException {
		cn = DBUtil.getCn();
		st = cn.createStatement();
	}

	@Override
	public void addStudent(Student student) throws SQLException {
		pst = cn.prepareStatement("INSERT INTO student VALUES(?,?,?)");
		pst.setInt(1,  student.getId());
		pst.setString(2, student.getSname());
		pst.setInt(3, student.getPer());
		int n = pst.executeUpdate();
		System.out.println("Student added...");
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		List<Student> studList = new ArrayList<Student>();
		ResultSet rs = st.executeQuery("SELECT * FROM student");
		while(rs.next()) {
			Student st = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3));
			studList.add(st);
		}
		rs.close();
		return studList;
	}

	@Override
	public List<Student> getStudentsByPer(int value) throws SQLException {
		List<Student> studList = new ArrayList<Student>();
		pst = cn.prepareStatement("SELECT * FROM student WHERE price>=?");
		pst.setInt(1, value);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Student st = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3));
			studList.add(st);
		}
		pst.close();
		rs.close();
		return studList;
	}

	@Override
	public List<Student> getStudentsNameStartsWith(String str) throws SQLException {
		List<Student> studList = new ArrayList<Student>();
		pst = cn.prepareStatement("SELECT * FROM student WHERE name LIKE ?");
		pst.setString(1, str);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Student st = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3));
			studList.add(st);
		}
		pst.close();
		rs.close();
		return studList;
	}

	@Override
	public int deleteAllStudents() throws SQLException {
		int n = st.executeUpdate("DELETE FROM student");
		return n;
	}

	@Override
	public int deleteByRollNo(int value) throws SQLException {
		int n = st.executeUpdate("DELETE FROM student WHERE id = "+value);
		return n;
	}

	@Override
	public int updateStudentPer(int value) throws SQLException {
		pst = cn.prepareStatement("UPDATE student SET price=price+? WHERE price<=?");
		pst.setInt(1, value);
		pst.setInt(2, 100-value);
		int n = pst.executeUpdate();
		return n;
	}

	@Override
	public int updateStudentPerByRollNo(int rvalue, int pvalue) throws SQLException {
		pst = cn.prepareStatement("UPDATE student SET price=? WHERE id=?");
		pst.setInt(1, pvalue);
		pst.setInt(2, rvalue);
		int n = pst.executeUpdate();
		return n;
	}
	
	@Override
	protected void finalize() {
		try {
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}