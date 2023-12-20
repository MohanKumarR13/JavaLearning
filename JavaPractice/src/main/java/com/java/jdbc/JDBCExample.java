package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*1.Create a connection
2.Create a query/statement
3.Excecute statement/query
4.Close Connection*/
public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		// Create a connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1512/pdborcl", "hr", "hr");
		// Create a query/statement
		Statement statement = connection.createStatement();
		String insert = "Insert into student values(101,'Max')";
		String update = "Update student set sname 'Maxie' where sid=101";
		String delete = "Delete student where sid=101";

		// Excecute statement/query
		statement.execute(insert);
		statement.execute(update);
		statement.execute(delete);

		// close connection
		connection.close();
	}

}
