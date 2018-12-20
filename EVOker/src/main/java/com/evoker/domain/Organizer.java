package com.evoker.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="evokerorganizer")
@Component
public class Organizer {
	@Id
	@Column(name="organizer_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int organizerID;
	@OneToOne
	@JoinColumn(name="login_id")
	private Login orgLogin;
	@Column(name="numran")
	private int numRan;
//	@ManyToMany
//	@JoinTable(name="current_tournaments", joinColumns=@JoinColumn(name="organizer_id"), inverseJoinColumns=@JoinColumn(name="tournament_id"))
	public Organizer(int organizerID, Login orgLogin, int numRan) {
		super(); 
		this.organizerID = organizerID;
		this.orgLogin = orgLogin;
		this.numRan = numRan;
	}
	public Organizer() {
		super();
	}
	
	public int getOrganizerID() {
		return organizerID;
	}
	public void setOrganizerID(int organizerID) {
		this.organizerID = organizerID;
	}
	public Login getOrgLogin() {
		return orgLogin;
	}
	public void setOrgLogin(Login orgLogin) {
		this.orgLogin = orgLogin;
	}
	public int getNumRan() {
		return numRan;
	}
	public void setNumRan(int numRan) {
		this.numRan = numRan;
	}
	@Override
	public String toString() {
		return "Organizer [organizerID=" + organizerID + ", orgLogin=" + orgLogin + ", numRan=" + numRan + "]";
	}
	
}
