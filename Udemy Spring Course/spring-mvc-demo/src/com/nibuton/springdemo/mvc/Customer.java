package com.nibuton.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.nibuton.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;
	private String firstName;
	
	@NotNull(message = "is required")
	@Min(value = 1, message = "minimum 1")
	@Max(value = 10, message = "maximum 10")
	private Integer freePasses;
	
	@Pattern(regexp = "\\+?[78](-?\\d){10}", message = "phone is incorrect")
	private String phone;
	
	@CourseCode(value = "KAT", message = "Must start with KAT")
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
