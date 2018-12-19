package com.example.springvalidation.entity;

public class Person2 {

	private String name;
	private Integer age;
	private String email;
	private String contactNumber;
	private String aboutMe;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", aboutMe=" + aboutMe + "]";
	}

}
