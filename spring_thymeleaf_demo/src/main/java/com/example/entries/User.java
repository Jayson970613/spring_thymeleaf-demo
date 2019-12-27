package com.example.entries;

public class User {

	private String name;
	private Integer age;
	private boolean sex;
	private String role;
	
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public User(String name, Integer age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public User(String name, Integer age, boolean sex, String role) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.role = role;
	}

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

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
