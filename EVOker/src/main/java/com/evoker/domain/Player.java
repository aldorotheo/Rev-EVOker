package com.evoker.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evokerplayers")
public class Player {
	@Id
	private int PlayerID;
	private int wins;
	private int losses;
	private Lineup lineup;
	private Login login;
	public int getPlayerID() {
		return PlayerID;
	}
	public void setPlayerID(int playerID) {
		PlayerID = playerID;
	}
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
	public Lineup getLineup() {
		return lineup;
	}
	public void setLineup(Lineup lineup) {
		this.lineup = lineup;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerID, int wins, int losses, Lineup lineup, Login login) {
		super();
		PlayerID = playerID;
		this.wins = wins;
		this.losses = losses;
		this.lineup = lineup;
		this.login = login;
	}

}
