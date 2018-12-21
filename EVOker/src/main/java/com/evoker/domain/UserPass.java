package com.evoker.domain;

public class UserPass {
private String username;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "UserPass [username=" + username + ", password=" + password + "]";
}
public UserPass(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public UserPass() {
	super();
	// TODO Auto-generated constructor stub
}

}
