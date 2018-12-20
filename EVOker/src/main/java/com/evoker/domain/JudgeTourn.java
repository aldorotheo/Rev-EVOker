package com.evoker.domain;

public class JudgeTourn {
	Tournament tournament;
	Judge judge;
	public JudgeTourn(Tournament tournament, Judge judge) {
		super();
		this.tournament = tournament;
		this.judge = judge;
	}
	public JudgeTourn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTourn(Tournament tournament) {
		this.tournament = tournament;
	}
	public Judge getJudge() {
		return judge;
	}
	public void setJudge(Judge judge) {
		this.judge = judge;
	}
	@Override
	public String toString() {
		return "JudgeTourn [tournament=" + tournament + ", judge=" + judge + "]";
	}
	
}
