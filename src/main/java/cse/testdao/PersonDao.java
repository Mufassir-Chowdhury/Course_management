package cse.testdao;

import java.util.ArrayList;
import java.util.List;

import cse.testmodels.ListTile;
import cse.testmodels.Person;

public class PersonDao {
	public Person getPerson() {
		return new Person(2019331073, "Mufassir Ahmad Chowdhury", "Computer Science and Engineering", null, null,
				"2019", "10", "mac22214u@gmail.com", "01771144308");
	}

	public List<ListTile> getStudents() {
		List<ListTile> studentList = new ArrayList<ListTile>();
		studentList.add(new ListTile("Mufassir Ahmad Chowdhury", "2019331073", "mac22214u@gmail.com", "Computer Science and Engineering", "2019331073"));
		studentList.add(new ListTile("John Doe", "2019331074", "john.doe@gmail.com", "Electrical Engineering", "2019331074"));
		studentList.add(new ListTile("Jane Smith", "2019331075", "jane.smith@gmail.com", "Mechanical Engineering", "2019331075"));
		studentList.add(new ListTile("Bob Johnson", "2019331076", "bob.johnson@gmail.com", "Civil Engineering", "2019331076"));
		studentList.add(new ListTile("Alice Brown", "2019331077", "alice.brown@gmail.com", "Chemical Engineering", "2019331077"));
		return studentList;
	}
	
	public List<ListTile> getTeachers() {
		List<ListTile> studentList = new ArrayList<ListTile>();
		studentList.add(new ListTile("Mufassir Ahmad Chowdhury", "Assistant Professor", "mac22214u@gmail.com", "Computer Science and Engineering", "2019331073"));
		studentList.add(new ListTile("John Doe", "Associate Professor", "john.doe@gmail.com", "Electrical Engineering", "2019331074"));
		studentList.add(new ListTile("Jane Smith", "Professor", "jane.smith@gmail.com", "Mechanical Engineering", "2019331075"));
		studentList.add(new ListTile("Bob Johnson", "Lecturer", "bob.johnson@gmail.com", "Civil Engineering", "2019331076"));
		studentList.add(new ListTile("Alice Brown", "Lecturer", "alice.brown@gmail.com", "Chemical Engineering", "2019331077"));
		return studentList;
	}
}
