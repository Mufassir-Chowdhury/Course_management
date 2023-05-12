package cse.testmodels;

public class Person {
	private int id;
	private String name;
	private String department;
	private String code;
	private String designation;
	private String session;
	private String currentSemester;
	private String email;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getCurrentSemester() {
		return currentSemester;
	}
	public void setCurrentSemester(String currentSemester) {
		this.currentSemester = currentSemester;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person(int id, String name, String department, String code, String designation, String session,
			String currentSemester, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.code = code;
		this.designation = designation;
		this.session = session;
		this.currentSemester = currentSemester;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", department=" + department + ", code=" + code
				+ ", designation=" + designation + ", session=" + session + ", currentSemester=" + currentSemester
				+ ", email=" + email + ", phone=" + phone + "]";
	}
	
}
