package cse.model;

/**
    The TeacherModel class represents a teacher entity in the system.
*/
public class TeacherModel {
	
	private int id;
	private String username;
	private String name;
	private String code;
	private String dept;
	private String designation;
	private String phone;
	private String email;

	/**
		Retrieves the ID of the teacher.
		@return the teacher ID
    */
	public int getId() {
		return id;
	}
	/**
		Sets the ID of the teacher.
		@param id the teacher ID to set
    */
	public void setId(int id) {
		this.id = id;
	}
	/**
		Retrieves the username of the teacher.
		@return the teacher username
    */
	public String getUsername() {
		return username;
	}
	/**
		Sets the username of the teacher.
		@param username the teacher username to set
    */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
		Retrieves the name of the teacher.
		@return the teacher name
    */
	public String getName() {
		return name;
	}
	/**
		Sets the name of the teacher.
		@param name the teacher name to set
    */
	public void setName(String name) {
		this.name = name;
	}
	/**
		Retrieves the code of the teacher.
		@return the teacher code
    */
	public String getCode() {
		return code;
	}
	/**
		Sets the code of the teacher.
		@param code the teacher code to set
    */
	public void setCode(String code) {
		this.code = code;
	}
	/**
		Retrieves the department of the teacher.
		@return the teacher department
    */
	public String getDept() {
		return dept;
	}
	/**
		Sets the department of the teacher.
		@param dept the teacher department to set
    */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
		Retrieves the designation of the teacher.
		@return the teacher designation
    */
	public String getDesignation() {
		return designation;
	}
	/**
		Sets the designation of the teacher.
		@param designation the teacher designation to set
    */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
		Retrieves the phone number of the teacher.
		@return the teacher phone number
    */
	public String getPhone() {
		return phone;
	}
	/**
		Sets the phone number of the teacher.
		@param phone the teacher phone number to set
    */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
		Retrieves the email of the teacher.
		@return the teacher email
    */
	public String getEmail() {
		return email;
	}
	/**
		Sets the email of the teacher.
		@param email the teacher email to set
    */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "TeacherModel [id=" + id + ", username=" + username + ", name=" + name + ", code=" + code + ", dept="
				+ dept + ", designation=" + designation + ", phone=" + phone + ", email=" + email + "]";
	}  
	
	
	
}
