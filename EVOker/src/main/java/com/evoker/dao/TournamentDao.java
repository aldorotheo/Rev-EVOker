package com.evoker.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.evoker.domain.Organizer;
import com.evoker.domain.Player;
import com.evoker.domain.Ruleset;
import com.evoker.domain.Tournament;
import com.evoker.util.SessionUtil;

public class TournamentDao {
	private Session sess = SessionUtil.getSession();
	
	public List<Tournament> addPlayertoTournament(Player player, Tournament tournament) {
		Transaction tx = sess.beginTransaction();
		if (tournament.getTournamentBracket().size()<16) {
			Tournament tourn;
			Player player1 = (Player) sess.get(Player.class, player.getPlayerID());
			tourn = (Tournament) sess.get(Tournament.class, tournament.getTournamentID());
			tourn.getTournamentBracket().add(player1);
		}
		Query<Tournament> query = sess.createQuery("from Tournament t");
		List<Tournament> tournlist = new ArrayList<Tournament>();
	    tournlist =  query.getResultList();
		tx.commit();
		return tournlist;
	}
	
	public Organizer addTournament(Organizer organizer, Tournament tournament) {
		Transaction tx = sess.beginTransaction();
		Integer id = (Integer) sess.save(tournament.getRuleset());
		Ruleset rules = sess.get(Ruleset.class, id);
		tournament.setRuleset(rules);
		Integer id2 = (Integer) sess.save(tournament);
		Tournament tourn = sess.get(Tournament.class, id2);
		System.out.println(tourn);
		Organizer org = sess.get(Organizer.class, organizer.getOrganizerID());
		tournament.setTournamentOrganizer(org);
		sess.persist(tournament);
		tx.commit();
		return org;
	}
	public List<Tournament> getAllTournaments(){
		Transaction tx = sess.beginTransaction();
		Query<Tournament> query = sess.createQuery("from Tournament t");
		List<Tournament> tournlist = new ArrayList<Tournament>();
	    tournlist =  query.getResultList();
	    tx.commit();
		return tournlist;
	}
}

