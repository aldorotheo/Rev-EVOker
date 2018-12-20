package com.evoker.domain;

public class LineupEdit {
	String oldCharacterName;
	String newCharacterName;
	Player player;
	public String getOldCharacterName() {
		return oldCharacterName;
	}
	public void setOldCharacterName(String oldCharacterName) {
		this.oldCharacterName = oldCharacterName;
	}
	public String getNewCharacterName() {
		return newCharacterName;
	}
	public void setNewCharacterName(String newCharacterName) {
		this.newCharacterName = newCharacterName;
	}
	
	public LineupEdit(String oldCharacterName, String newCharacterName, Player player) {
		super();
		this.oldCharacterName = oldCharacterName;
		this.newCharacterName = newCharacterName;
		this.player = player;
	}
	public LineupEdit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
}
