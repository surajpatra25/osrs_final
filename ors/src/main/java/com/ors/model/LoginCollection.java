package com.ors.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="login")
public class LoginCollection {

	private String Id;
	private String firstName;
	private String lastName;
	private String user_name;
	private String passwd;
	private String emailId;
	public LoginCollection() {
	}
	public LoginCollection(String firstName, String lastName, String userName, String password, String emailId) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.user_name=userName;
		this.passwd=password;
		this.emailId=emailId;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
