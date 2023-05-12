package cse.testdao;

import java.util.*;

import cse.testmodels.Course;

public class CourseDao {
	public List<Course> getCourse() {
		List<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course("Computer Mechanics", "CSE-230", "Computer Science and Engineering", 3));

		courseList.add(new Course("Introduction to Psychology", "PSY-101", "Psychology", 3));

		courseList.add(new Course("Calculus I", "MATH-121", "Mathematics", 3));

		courseList.add(new Course("Introduction to Sociology", "SOC-101", "Sociology", 3));

		courseList.add(new Course("Introduction to Economics", "ECON-101", "Economics", 3));

		return courseList;
		
	}
}
