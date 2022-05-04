package com.springboot.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
//	http://localhost:8080/student
	@GetMapping("student")
	public Student student() {
		return new Student("Kamakshaiah", "Musunuru"); 
	}
	
//	http://localhost:8080/students
	@GetMapping("students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>(); 
		students.add(new Student("Kamakshaiah", "Musunuru")); 
		students.add(new Student("Sukanya", "Musunuru")); 
		students.add(new Student("Yoga Amrutha", "Musunuru")); 
		students.add(new Student("Sai Bhargav", "Musunuru"));
		return students; 
	}
	
//	http://localhost:8080/firstname/lastname
	@GetMapping("{firstName}/{lastName}")
	public Student studentpathvariableex(@PathVariable("firstName") String firstname, @PathVariable("lastName") String lastname) {
		return new Student(firstname, lastname); 
	}
}
