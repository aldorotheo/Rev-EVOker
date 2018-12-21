package com.evoker.domain;

public class OrgTourn {
	Organizer organizer;
	Tournament tournament;
	public Organizer getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	@Override
	public String toString() {
		return "OrgTourn [organizer=" + organizer + ", tournament=" + tournament + "]";
	}
	public OrgTourn(Organizer organizer, Tournament tournament) {
		super();
		this.organizer = organizer;
		this.tournament = tournament;
	}
	public OrgTourn() {
		super();
		// TODO Auto-generated constructor stub
	}
}
