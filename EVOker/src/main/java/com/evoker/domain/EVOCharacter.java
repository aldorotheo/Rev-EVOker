package com.evoker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="evokercharacters")
@Component
public class EVOCharacter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="char_id")
	private int charID;
	@Column(name="char_name")
	private String charName;
	@Column(name="wins")
	private int wins;
	@Column(name="losses")
	private int losses;
	
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public EVOCharacter(int charID, String charName) {
		super();
		this.charID = charID;
		this.charName = charName;
	}
	@Override
	public String toString() {
		return "EVOCharacter [charID=" + charID + ", charName=" + charName + ", wins=" + wins + ", losses=" + losses
				+ "]";
	}
	public EVOCharacter() {
		super();
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
