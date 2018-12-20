package com.evoker.domain;

public class AddCharacter {
	String charname;
	Player player;
	public String getCharname() {
		return charname;
	}
	public void setCharname(String charname) {
		this.charname = charname;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	@Override
	public String toString() {
		return "AddCharacter [charname=" + charname + ", player=" + player + "]";
	}
	public AddCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddCharacter(String charname, Player player) {
		super();
		this.charname = charname;
		this.player = player;
	}

}
