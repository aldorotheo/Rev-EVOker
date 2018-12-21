package com.evoker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="evokermatchup")
public class Matchup {
	@Id
	@Column(name="matchup_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int matchup_id;
	@Column(name="player1")
	String player1;
	@Column(name="player2")
	String player2;
	@JsonBackReference("evokertournament-evokermatchup")
	@ManyToOne
	@JoinColumn(name="tournament_id")
	Tournament tournament;
	public int getMatchup_id() {
		return matchup_id;
	}
	public void setMatchup_id(int matchup_id) {
		this.matchup_id = matchup_id;
	}
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	@Override
	public String toString() {
		return "Matchup [matchup_id=" + matchup_id + ", player1=" + player1 + ", player2=" + player2 + ", tournament="
				+ tournament + "]";
	}
	public Matchup(int matchup_id, String player1, String player2, Tournament tournament) {
		super();
		this.matchup_id = matchup_id;
		this.player1 = player1;
		this.player2 = player2;
		this.tournament = tournament;
	}
	public Matchup() {
		super();
	}
	
	
}
