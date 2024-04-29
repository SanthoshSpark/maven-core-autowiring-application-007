package com.spring.core.demo;

//University.java
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class University {
	 private List<Student> students;
	 private List<Course> courses;
	
	 @Autowired
	 public University( ) {
		 
	 }
	 
	 // Autowired constructor for Student and Course dependencies
	 @Autowired
	 public University(List<Student> students, List<Course> courses) {
	     this.students = students;
	     this.courses = courses;
	 }
	
	 // Autowired setter for Student dependencies
	 @Autowired
	 public void setStudents(List<Student> students) {
	     this.students = students;
	 }
	
	 // Autowired setter for Course dependencies
	 @Autowired
	 public void setCourses(List<Course> courses) {
	     this.courses = courses;
	 }
	
	 public void displayUniversityInfo() {
	     System.out.println("University Information:");
	     System.out.println("Students:");
	     for (Student student : students) {
	         System.out.println(student.getName());
	     }
	     System.out.println("Courses:");
	     for (Course course : courses) {
	         System.out.println(course.getName());
	     }
	 }
}
