package com.dollop.entity;

public class contact {

	private Integer id;
	private String name;
	private String email;
	private String mobile;
	private Integer uId;

	public contact() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	

	

	public contact(  String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		
	}

	@Override
	public String toString() {
		return "contact [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", uId=" + uId
				+ "]";
	}

	public contact(Integer id, String name, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public contact(Integer id) {
		super();
		this.id = id;
	}

	public contact(Integer uid,String name) {
		super();
		this.name = name;
		this.uId = uid;
	}

	public contact(int parseInt, String parameter) {
		// TODO Auto-generated constructor stub
	}
	

	
}
