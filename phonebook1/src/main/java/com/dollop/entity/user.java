package com.dollop.entity;

public class user {

	public static user User;
	private static  Integer uId;
	private String Name;
	private String Email;
	private static  String Password;
	private String Contact;


	public user() {
		super();
	}

	public static user getUser() {
		return User;
	}

	public static void setUser(user user) {
		User = user;
	}

	

	public static Integer getuId() {
		return uId;
	}

	public static void setuId(Integer uId) {
		uId = uId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public static  String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public user( String name, String email, String password, String contact) {
		super();
	
		
		Name = name;
		Email = email;
		Password = password;
		Contact = contact;
		
	
	}
	

	public user(String name, String email, String contact) {
		super();
		Name = name;
		Email = email;
		Contact = contact;
	}

	public user(String name, String email) {
		super();
		
		Name = name;
		Email = email;
	
	}

	public user(Integer uId) {
		super();
		uId=uId;
	}

	@Override
	public String toString() {
		return "user [uId=" + uId + ", Name=" + Name + ", Email=" + Email + ", Contact=" + Contact + "]";
	}

	
	


	
}
