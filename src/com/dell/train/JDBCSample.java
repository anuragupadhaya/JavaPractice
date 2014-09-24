package com.dell.train;

import java.sql.*;

public class JDBCSample {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to the database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			System.out.println("Preparing the SQL statement...");

			conn.setAutoCommit(false);

			stmt = conn.createStatement();

			String sql;

			sql = "select * from test";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt("empid") + " "
						+ rs.getString("name"));
			}
			rs.close();
			stmt.close();
		}

		catch (SQLException se) {
			System.out.println("caught 1");
			se.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {

			try {
				conn.close();
			} catch (SQLException se) {
				// TODO Auto-generated catch block
				System.out.println("caught 2");
				se.printStackTrace();
			}
		}
	}
}
