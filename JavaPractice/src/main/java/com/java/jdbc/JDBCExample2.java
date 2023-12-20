package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

/*1.Create a connection
2.Create a query/statement
3.Excecute statement/query
4.Close Connection*/
public class JDBCExample2 {

	public static void main(String[] args) throws SQLException {
		// Create a connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1512/pdborcl", "hr", "hr");
		// Create a query/statement
		Statement statement = connection.createStatement();
		String select = "Select sname,sid from student ";
		// String update = "Update student set sname 'Maxie' where sid=101";
		// String delete = "Delete student where sid=101";

		// Excecute statement/query
		ResultSet resultSet = statement.executeQuery(select);
		// statement.execute(update);
		// statement.execute(delete);
		while (resultSet.next()) {
			String sname = resultSet.getString("sname");
			int sid = resultSet.getInt("sid");

			System.out.println(sname + " " + sid);
		}
		// close connection
		connection.close();
	}

}
