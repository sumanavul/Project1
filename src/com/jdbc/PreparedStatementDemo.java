package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception  {
		String url = "jdbc:mysql://localhost:3306/sumandb1";
		String uname="root";
		String pw = "Root";
		int StuId = 6;
		String StuName = "Satwik";
		String querry = "insert into student values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");//class forname telusko
		Connection con = DriverManager.getConnection(url, uname, pw);
		PreparedStatement st = con.prepareStatement(querry);
		st.setInt(1, 6);
		st.setString(2, "Satwik");
		int count = st.executeUpdate();
		System.out.println(count+"row/rows effected");
        st.close();
        con.close();
	}

}
