package cse.testdao;

import java.util.ArrayList;
import java.util.List;

import cse.testmodels.Person;

public class PersonDao {
	public Person getPerson() {
		return new Person(2019331073, "Mufassir Ahmad Chowdhury", "Computer Science and Engineering", null, null,
				"2019", "10", "mac22214u@gmail.com", "01771144308");
	}

	public List<Person> getStudents() {
		List<Person> studentList = new ArrayList<Person>();
		studentList.add(new Person(2019331073, "Mufassir Ahmad Chowdhury", "Computer Science and Engineering", null,
				null, null, null, "mac22214u@gmail.com", null));
		studentList.add(new Person(2019331074, "John Doe", "Electrical Engineering", null, null, null, null,
				"john.doe@gmail.com", null));
		studentList.add(new Person(2019331075, "Jane Smith", "Mechanical Engineering", null, null, null, null,
				"jane.smith@gmail.com", null));
		studentList.add(new Person(2019331076, "Bob Johnson", "Civil Engineering", null, null, null, null,
				"bob.johnson@gmail.com", null));
		studentList.add(new Person(2019331077, "Alice Brown", "Chemical Engineering", null, null, null, null,
				"alice.brown@gmail.com", null));
		return studentList;
	}
	
	public List<Person> getTeachers() {
		List<Person> studentList = new ArrayList<Person>();
		studentList.add(new Person(2019331073, "Mufassir Ahmad Chowdhury", "Computer Science and Engineering", null,
				"Assistant Professor", null, null, "mac22214u@gmail.com", null));
		studentList.add(new Person(2019331074, "John Doe", "Electrical Engineering", null, "Associate Professor", null, null,
				"john.doe@gmail.com", null));
		studentList.add(new Person(2019331075, "Jane Smith", "Mechanical Engineering", null, "Professor", null, null,
				"jane.smith@gmail.com", null));
		studentList.add(new Person(2019331076, "Bob Johnson", "Civil Engineering", null, "Lecturer", null, null,
				"bob.johnson@gmail.com", null));
		studentList.add(new Person(2019331077, "Alice Brown", "Chemical Engineering", null, "Lecturer", null, null,
				"alice.brown@gmail.com", null));
		return studentList;
	}
}
