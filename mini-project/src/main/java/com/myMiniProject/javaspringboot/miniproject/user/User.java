package com.myMiniProject.javaspringboot.miniproject.user;

public class User {
	
	private Integer id;
	private String name;
	private String bloodGroup;
	private String email;
	private String domain;
	
	public User(int id, String name, String bloodGroup, String email, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.bloodGroup = bloodGroup;
		this.email = email;
		this.domain = domain;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", bloodGroup=" + bloodGroup + ", email=" + email + ", domain="
				+ domain + "]";
	}
	
	
}
