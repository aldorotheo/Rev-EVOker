package com.evoker.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="evokerlogin")
public class Login {
	@Id
	private int loginID;
	private String userName;
	private String passWord;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Login(int loginID, String userName, String passWord) {
		super();
		this.loginID = loginID;
		this.userName = userName;
		this.passWord = passWord;
	}

	public int getLoginID() {
		return loginID;
	}
	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
