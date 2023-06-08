package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.AuthModel;

/**
    This code represents a DAO (Data Access Object) class named AuthDao.
    It is responsible for interacting with the database to perform CRUD (Create, Read, Update, Delete) operations
    related to the 'auths' table in the 'course_management' database.
    The constructor establishes a connection to the MySQL database using JDBC (Java Database Connectivity).
    It specifies the URL, username, and password required to connect to the database.
    If the connection is successful, it prints the connection object to the console.
    The getAuth() method retrieves an AuthModel object from the database based on the provided email.
    It prepares a SQL query using a PreparedStatement, sets the email parameter, and executes the query.
    If a matching record is found in the result set, the method maps the data to an AuthModel object and returns it.
*/
public class AuthDao {
	private Connection con;
	public AuthDao() {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println(con);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public AuthModel getAuth(String email) {
		String sql = "select * from auths where email = ?";
		AuthModel auth = new AuthModel();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				auth.setId(rs.getInt("id"));
				auth.setEmail(rs.getString("email"));
				auth.setPassword(rs.getString("password"));
				auth.setRole(rs.getString("role"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return auth;
	}
}
