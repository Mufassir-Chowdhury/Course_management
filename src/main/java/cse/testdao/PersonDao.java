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
//		studentList.add(new Person(2019331073, "Mufassir Ahmad Chowdhury", "Computer Science and Engineering", null,
//				null, null, null, "mac22214u@gmail.com", null));
//		studentList.add(new Person(2019331074, "John Doe", "Electrical Engineering", null, null, null, null,
//				"john.doe@gmail.com", null));
//		studentList.add(new Person(2019331075, "Jane Smith", "Mechanical Engineering", null, null, null, null,
//				"jane.smith@gmail.com", null));
//		studentList.add(new Person(2019331076, "Bob Johnson", "Civil Engineering", null, null, null, null,
//				"bob.johnson@gmail.com", null));
//		studentList.add(new Person(2019331077, "Alice Brown", "Chemical Engineering", null, null, null, null,
//				"alice.brown@gmail.com", null));
		return studentList;
	}
	
	public List<ListTile> getTeachers() {
		List<ListTile> studentList = new ArrayList<ListTile>();
		studentList.add(new ListTile("Mufassir Ahmad Chowdhury", "Assistant Professor", "mac22214u@gmail.com", "Computer Science and Engineering", "2019331073"));
		studentList.add(new ListTile("John Doe", "Associate Professor", "john.doe@gmail.com", "Electrical Engineering", "2019331074"));
		studentList.add(new ListTile("Jane Smith", "Professor", "jane.smith@gmail.com", "Mechanical Engineering", "2019331075"));
		studentList.add(new ListTile("Bob Johnson", "Lecturer", "bob.johnson@gmail.com", "Civil Engineering", "2019331076"));
		studentList.add(new ListTile("Alice Brown", "Lecturer", "alice.brown@gmail.com", "Chemical Engineering", "2019331077"));
//		studentList.add(new Person(2019331073, "Mufassir Ahmad Chowdhury", "Computer Science and Engineering", null,
//				"Assistant Professor", null, null, "mac22214u@gmail.com", null));
//		studentList.add(new Person(2019331074, "John Doe", "Electrical Engineering", null, "Associate Professor", null, null,
//				"john.doe@gmail.com", null));
//		studentList.add(new Person(2019331075, "Jane Smith", "Mechanical Engineering", null, "Professor", null, null,
//				"jane.smith@gmail.com", null));
//		studentList.add(new Person(2019331076, "Bob Johnson", "Civil Engineering", null, "Lecturer", null, null,
//				"bob.johnson@gmail.com", null));
//		studentList.add(new Person(2019331077, "Alice Brown", "Chemical Engineering", null, "Lecturer", null, null,
//				"alice.brown@gmail.com", null));
		return studentList;
	}
}
