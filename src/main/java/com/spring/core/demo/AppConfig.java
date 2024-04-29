package com.spring.core.demo;

//AppConfig.java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

	 @Bean
	 public Student student1() {
	     return new Student("Alice");
	 }
	
	 @Bean
	 public Student student2() {
	     return new Student("Bob");
	 }
	
	 @Bean
	 public Course course1() {
	     return new Course("Introduction to Computer Science");
	 }
	
	 @Bean
	 public Course course2() {
	     return new Course("Advanced Java Programming");
	 }
	
	 @Bean
	 public University university() {
	     return new University();
	 }
}
