package com.evoker.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.evoker.domain.EVOCharacter;
import com.evoker.domain.Player;
import com.evoker.util.SessionUtil;

public class CharacterDao {
	
	private Session sess = SessionUtil.getSession();
	public EVOCharacter getCharacterByName(String name) {
		EVOCharacter evochar = null;
		Transaction tx = sess.beginTransaction();
		Query query = sess.createQuery("from EVOCharacter c where c.charName=:char_name");
		query.setParameter("char_name", name);
		evochar = (EVOCharacter) query.getSingleResult();
		tx.commit();
		return evochar;
	}
}
