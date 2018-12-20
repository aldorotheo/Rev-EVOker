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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="evokertournament")
@Component
public class Tournament {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tournament_ID")
	private int tournamentID;
	@Column(name="tournament_name")
	private String tournamentName;
	@ManyToOne
	@JoinColumn(name="tournament_organizer")
	private Organizer tournamentOrganizer;
	@ManyToOne
	@JoinColumn(name="tournament_judge")
	private Judge tournamentJudge;
	@OneToOne
	@JoinColumn(name="tournament_ruleset")
	private Ruleset ruleset;
	@OneToMany(mappedBy="tournament")
	@JsonManagedReference("evokertournament-evokermatchup")
	List<Matchup> matchups;
	@Column(name="tournament_date")
	private String tournamentDate;
	@ManyToMany
	@JoinTable(name="evokerplayerlist", joinColumns=@JoinColumn(name="tournament_id"), inverseJoinColumns=@JoinColumn(name="player_id"))
	private List<Player> tournamentBracket;
	public int getTournamentID() {
		return tournamentID;
	}
	public void setTournamentID(int tournamentID) {
		this.tournamentID = tournamentID;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public Organizer getTournamentOrganizer() {
		return tournamentOrganizer;
	}
	public void setTournamentOrganizer(Organizer tournamentOrganizer) {
		this.tournamentOrganizer = tournamentOrganizer;
	}
	public Judge getTournamentJudge() {
		return tournamentJudge;
	}
	public void setTournamentJudge(Judge tournamentJudge) {
		this.tournamentJudge = tournamentJudge;
	}
	public Ruleset getRuleset() {
		return ruleset;
	}
	public void setRuleset(Ruleset ruleset) {
		this.ruleset = ruleset;
	}
	public List<Matchup> getMatchups() {
		return matchups;
	}
	public void setMatchups(List<Matchup> matchups) {
		this.matchups = matchups;
	}
	public String getTournamentDate() {
		return tournamentDate;
	}
	public void setTournamentDate(String tournamentDate) {
		this.tournamentDate = tournamentDate;
	}
	public List<Player> getTournamentBracket() {
		return tournamentBracket;
	}
	public void setTournamentBracket(List<Player> tournamentBracket) {
		this.tournamentBracket = tournamentBracket;
	}
	@Override
	public String toString() {
		return "Tournament [tournamentID=" + tournamentID + ", tournamentName=" + tournamentName
				+ ", tournamentOrganizer=" + tournamentOrganizer + ", tournamentJudge=" + tournamentJudge + ", ruleset="
				+ ruleset + ", matchups=" + matchups + ", tournamentDate=" + tournamentDate + ", TournamentBracket="
				+ tournamentBracket + "]";
	}
	public Tournament(int tournamentID, String tournamentName, Organizer tournamentOrganizer, Judge tournamentJudge,
			Ruleset ruleset, List<Matchup> matchups, String tournamentDate, List<Player> tournamentBracket) {
		super();
		this.tournamentID = tournamentID;
		this.tournamentName = tournamentName;
		this.tournamentOrganizer = tournamentOrganizer;
		this.tournamentJudge = tournamentJudge;
		this.ruleset = ruleset;
		this.matchups = matchups;
		this.tournamentDate = tournamentDate;
		this.tournamentBracket = tournamentBracket;
	}
	public Tournament() {
		super();
		this.tournamentJudge = new Judge();
		// TODO Auto-generated constructor stub
	}
	
	


}