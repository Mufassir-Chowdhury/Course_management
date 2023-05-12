package cse.testmodels;

public class Course {
	private String name;
	private String code;
	private String department;
	private double credit;
	public Course(String name, String code, String department, double credit) {
		super();
		this.name = name;
		this.code = code;
		this.department = department;
		this.credit = credit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", code=" + code + ", department=" + department + ", credit=" + credit + "]";
	}
	
	
}
