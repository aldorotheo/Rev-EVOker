package com.evoker.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="evokerjudges")
@Component
public class Judge {
	@Id
	@Column(name="judge_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int judgeID;
	@Column(name="numjudged")
	private int numJudged;
	@OneToOne
	@JoinColumn(name="login_id")
	private Login judgeLogin;
	public Judge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Judge(int numJudged, Login judgeLogin, int judgeID) {
		super();
		this.numJudged = numJudged;
		this.judgeLogin = judgeLogin;
		this.judgeID = judgeID;
	}
	public int getNumJudged() {
		return numJudged;
	}
	public void setNumJudged(int numJudged) {
		this.numJudged = numJudged;
	}
	public Login getJudgeLogin() {
		return judgeLogin;
	}
	public void setLogin(Login login) {
		this.judgeLogin = login;
	}
	public int getJudgeID() {
		return judgeID;
	}
	public void setJudgeID(int judgeID) {
		this.judgeID = judgeID;
	}
	@Override
	public String toString() {
		return "Judge [judgeID=" + judgeID + ", numJudged=" + numJudged + ", judgeLogin=" + judgeLogin + "]";
	}
	
}
