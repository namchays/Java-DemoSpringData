package com.lenam.springboot.jpa.model;

public class EmployeeFullName {
	private String fullName;
	private Integer age;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public EmployeeFullName(String fullName, Integer age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}
//	public EmployeeFullName(String firstName,String LastName, Integer age) {
//		super();
//		this.fullName = firstName + " "+  LastName;
//		this.age = age;
//	}
	
}
