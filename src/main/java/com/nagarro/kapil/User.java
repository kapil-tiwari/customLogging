package com.nagarro.kapil;

public class User {

	private Integer id;
	private String userName;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public User(Integer id, String userName, Integer age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
