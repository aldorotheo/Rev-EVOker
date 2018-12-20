package com.evoker.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "evokerplayers")
@Component
public class Player {
	@Id
	@Column(name="player_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int playerID;
	@Column(name="win")
	private int wins;
	@Column(name="loss")
	private int losses;
	@ManyToMany
	@JoinTable(name="evokerlineup", joinColumns=@JoinColumn(name="player_id"), inverseJoinColumns=@JoinColumn(name="char_id"))
	private List<EVOCharacter> lineup;
	@OneToOne
	@JoinColumn(name="login_id")
	private Login login;
	@Column(name="numChars")
	private int numChars;
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public int getWins() {
		return wins;
	}
	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", wins=" + wins + ", losses=" + losses + ", lineup=" + lineup
				+ ", login=" + login + ", numChars=" + numChars + "]";
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
	public List<EVOCharacter> getLineup() {
		return lineup;
	}
	public void setLineup(List<EVOCharacter> lineup) {
		this.lineup = lineup;
	}
	public Login getLogin() {
		return login;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (playerID != other.playerID)
			return false;
		return true;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Player() {
		super();
	}
	public Player(int playerID, int wins, int losses, List<EVOCharacter> lineup, Login login, int numChars) {
		super();
		this.playerID = playerID;
		this.wins = wins;
		this.losses = losses;
		this.lineup = lineup;
		this.login = login;
		this.numChars = numChars;
	}
	public int getNumChars() {
		return numChars;
	}
	public void setNumChars(int numChars) {
		this.numChars = numChars;
	}

}
