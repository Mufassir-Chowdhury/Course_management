package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.AdminModel;


/**
    This code represents a DAO (Data Access Object) class named AdminDao.
    It is responsible for interacting with the database to perform CRUD (Create, Read, Update, Delete) operations
    related to the 'admins' table in the 'course_management' database.
    The constructor establishes a connection to the MySQL database using JDBC (Java Database Connectivity).
    It specifies the URL, username, and password required to connect to the database.
    If the connection is successful, it prints the connection object to the console.
    The getAdmin() method retrieves an AdminModel object from the database based on the provided email.
    It prepares a SQL query using a PreparedStatement, sets the email parameter, and executes the query.
    If a matching record is found in the result set, the method maps the data to an AdminModel object and returns it.
*/
public class AdminDao {
	private Connection con;
	public AdminDao() {
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
	
	public AdminModel getAdmin(String email) {
		String sql = "select * from admins where email = ?";
		AdminModel adm = new AdminModel();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
					
			if(rs.next()) {
				adm.setId(rs.getInt("id"));
				adm.setUsername(rs.getString("username"));
				adm.setName(rs.getString("name"));
				adm.setEmail(rs.getString("email"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return adm;
	}
}
