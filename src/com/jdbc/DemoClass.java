package com.jdbc;
import java.sql.*;
//1.import package
//2.load and register for driver --> com.mysql.jdbc.Driver
//3.Create connection
//4.Create a statement
//5.execute querry
//6.process result
//7.close
public class DemoClass {

	public static void main(String[] args) throws Exception  {
		String url = "jdbc:mysql://localhost:3306/sumandb1";
		String uname="root";
		String pw = "Root";
		int StuId = 5;
		String StuName = "Sairam";
		// String querry = "select StuName from student where StuId=1;";
		String querry = "insert into student values("+StuId+",'"+StuName+"')";
		Class.forName("com.mysql.cj.jdbc.Driver");//class forname telusko
		Connection con = DriverManager.getConnection(url, uname, pw);
		Statement st = con.createStatement();
		int count = st.executeUpdate(querry);
		System.out.println(count+"row/rows effected");
        st.close();
        con.close();
	}

}
