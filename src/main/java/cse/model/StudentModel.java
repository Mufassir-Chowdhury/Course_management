package cse.model;

public class StudentModel {
	private int id;
	private String username;
	private String name;
	private String dept;
	private String session;
	private String phone;
	private String email;
	
	/**
		Retrieves the ID of the student.
		@return the student ID
    */
	public int getId() {
		return id;
	}
	/**
		Sets the ID of the student.
		@param id the student ID to set
    */
	public void setId(int id) {
		this.id = id;
	}
	/**
		Retrieves the username of the student.
		@return the student username
    */
	public String getUsername() {
		return username;
	}
	/**
		Sets the username of the student.
		@param username the student username to set
    */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
		Retrieves the name of the student.
		@return the student name
    */
	public String getName() {
		return name;
	}
	/**
		Sets the name of the student.
		@param name the student name to set
    */
	public void setName(String name) {
		this.name = name;
	}
	/**
		Retrieves the dept of the student.
		@return the student dept
    */
	public String getDept() {
		return dept;
	}
	/**
	 * Sets the department of the student.
	 * 
	 * @param dept the student department to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * Retrieves the session of the student.
	 * 
	 * @return the student session
	 */
	public String getSession() {
		return session;
	}
	/**
	 * Sets the session of the student.
	 * 
	 * @param session the student session to set
	 */
	public void setSession(String session) {
		this.session = session;
	}
	/**
		Retrieves the phone number of the student.
		@return the student phone number
    */
	public String getPhone() {
		return phone;
	}
	/**
		Sets the phone number of the student.
		@param phone the student phone number to set
    */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
		Retrieves the email of the student.
		@return the student email
    */
	public String getEmail() {
		return email;
	}
	/**
		Sets the email of the student.
		@param email the student email to set
    */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", username=" + username + ", name=" + name + ", dept=" + dept + ", session="
				+ session + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
	
	
}


