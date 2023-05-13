package cse.testdao;

import java.util.ArrayList;
import java.util.List;

import cse.testmodels.Course;
import cse.testmodels.ListTile;

public class CourseDao {
	public List<ListTile> getCourse() {
		List<ListTile> courseList = new ArrayList<ListTile>();
		courseList.add(new ListTile("Computer Mechanics", "CSE-230", "Computer Science and Engineering", "Credits - 3", "CSE-230"));

		courseList.add(new ListTile("Introduction to Psychology", "PSY-101", "Psychology", "Credits - 3", "PSY-101"));

		courseList.add(new ListTile("Calculus I", "MATH-121", "Mathematics", "Credits - 3", "MATH-121"));

		courseList.add(new ListTile("Introduction to Sociology", "SOC-101", "Sociology", "Credits - 3", "SOC-101"));

		courseList.add(new ListTile("Introduction to Economics", "ECON-101", "Economics", "Credits - 3", "ECON-101"));

		return courseList;
		
	}
	
	public Course getCourseDetails() {
		return new Course("Algorithms", "CSE-221", "Computer Science and Engineering", 3);
	}
	
}
