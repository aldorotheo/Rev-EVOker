package com.evoker.domain;

public class PlayerTourn {
	Tournament tournament;
	Player player;
	public PlayerTourn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerTourn(Player player, Tournament tournament) {
		super();
		this.player = player;
		this.tournament = tournament;
	}
	@Override
	public String toString() {
		return "PlayerTourn [player=" + player + ", tournament=" + tournament + "]";
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

}
