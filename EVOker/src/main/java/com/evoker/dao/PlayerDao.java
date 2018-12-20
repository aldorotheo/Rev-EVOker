package com.evoker.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.evoker.domain.EVOCharacter;
import com.evoker.domain.Login;
import com.evoker.domain.Player;
import com.evoker.service.PlayerService;
import com.evoker.util.SessionUtil;

public class PlayerDao extends LoginDao {
	private Session sess = SessionUtil.getSession();
	public Player getPlayerUserPass(Login login) {
		Player player = null;
		Transaction tx = sess.beginTransaction();
		Query query = sess.createQuery("from Player p where p.login=:login");
		query.setParameter("login", login);
		player = (Player) query.getSingleResult();
		tx.commit();
		
		return player;
	}
	
	public Player addCharacterToLineup(EVOCharacter character, Player player) {
		Transaction tx = sess.beginTransaction();
		Player editplayer = sess.get(Player.class, player.getPlayerID());
		boolean dupe = false;
		for(int i = 0; i<editplayer.getLineup().size(); i++) {
			if (editplayer.getLineup().get(i).getCharID()== (character.getCharID())) {
				dupe = true;
				break;
			}
		}
		if (editplayer.getNumChars() < 3 & !dupe)
		{
			editplayer.getLineup().add(character);
			editplayer.setNumChars(editplayer.getNumChars()+1);
		}
			sess.persist(editplayer);
		tx.commit();
		return editplayer;
	}
	
	public Player editCharacterInLineup(EVOCharacter character1, EVOCharacter character2, Player player) {
		Transaction tx = sess.beginTransaction();
		Player editplayer = sess.get(Player.class, player.getPlayerID());
		boolean dupe = false;
		for(int i = 0; i<editplayer.getLineup().size(); i++) {
			if (editplayer.getLineup().get(i).getCharID()== (character2.getCharID())) {
				dupe = true;
				break;
			}
		}
		if (!dupe)
			for (int i = 0; i<player.getLineup().size(); i++) {
				if (editplayer.getLineup().get(i).getCharID()== (character1.getCharID())) {
					editplayer.getLineup().set(i, character2);
					break;
				}
			}
			sess.persist(editplayer);
		tx.commit();
		return editplayer;
	}
}
