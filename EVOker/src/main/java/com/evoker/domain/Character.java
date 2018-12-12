package com.evoker.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="evokercharacters")
public class Character {
	@Id
	private int charID;
	private String charName;
	public Character(int charID, String charName) {
		super();
		this.charID = charID;
		this.charName = charName;
	}
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCharID() {
		return charID;
	}
	public void setCharID(int charID) {
		this.charID = charID;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	
}
