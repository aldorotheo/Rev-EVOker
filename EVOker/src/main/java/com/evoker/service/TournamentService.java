package com.evoker.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.evoker.dao.TournamentDao;
import com.evoker.domain.Organizer;
import com.evoker.domain.Player;
import com.evoker.domain.Tournament;

@Service
public class TournamentService {
	
	TournamentDao td = new TournamentDao();
	
	public List<Tournament> addPlayerToTournament(Player player, Tournament tournament)
	{
		return td.addPlayertoTournament(player, tournament);
	}
	
	public Organizer addTournament(Organizer organizer, Tournament tournament) {
		System.out.println("hello");
		Organizer org = td.addTournament(organizer, tournament);
		return org;
		
	}
	
	public List<Tournament> getAllTournaments() {
		return td.getAllTournaments();
	}
}
