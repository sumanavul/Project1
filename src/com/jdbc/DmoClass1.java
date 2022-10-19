package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DmoClass1 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/sumandb1";
		String uname="root";
		String pw = "Root";
		String query = "Select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");//class forname telusko
		Connection con = DriverManager.getConnection(url, uname, pw);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
        String userdata ="";
        while(rs.next()) {
        	userdata = rs.getInt(1)+" : "+rs.getString(2);
        	System.out.println(userdata);
        }
        con.close();
        st.close();
	}

}
