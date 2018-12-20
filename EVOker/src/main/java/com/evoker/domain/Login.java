package com.evoker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="evokerlogin")
@Component
public class Login {
	@Id
	@Column(name="login_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loginID;
	@Column(name="username")
	private String userName;
	@Column(name="pass")
	private String passWord;
	@Column(name="user_type")
	private int userType;
	
	@Override
	public String toString() {
		return "Login [loginID=" + loginID + ", userName=" + userName + ", passWord=" + passWord + ", userType="
				+ userType + "]";
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

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
