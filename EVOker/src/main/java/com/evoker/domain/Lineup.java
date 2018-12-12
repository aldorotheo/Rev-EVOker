package com.evoker.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="evokerlineup")
public class Lineup {
	private Character primaryCharacter;
	private Character secondaryCharacter;
	private Character tertiaryCharacter;
	@Id
	private int lineupID;
	
	public Lineup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lineup(Character primaryCharacter, Character secondaryCharacter, Character tertiaryCharacter, int lineupID) {
		super();
		this.primaryCharacter = primaryCharacter;
		this.secondaryCharacter = secondaryCharacter;
		this.tertiaryCharacter = tertiaryCharacter;
		this.lineupID = lineupID;
	}

	public Character getPrimaryCharacter() {
		return primaryCharacter;
	}
	public void setPrimaryCharacter(Character primaryCharacter) {
		this.primaryCharacter = primaryCharacter;
	}
	public Character getSecondaryCharacter() {
		return secondaryCharacter;
	}
	public void setSecondaryCharacter(Character secondaryCharacter) {
		this.secondaryCharacter = secondaryCharacter;
	}
	public Character getTertiaryCharacter() {
		return tertiaryCharacter;
	}
	public void setTertiaryCharacter(Character tertiaryCharacter) {
		this.tertiaryCharacter = tertiaryCharacter;
	}
	public int getLineupID() {
		return lineupID;
	}
	public void setLineupID(int lineupID) {
		this.lineupID = lineupID;
	}

}
