package com.evoker.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.evoker.domain.Login;
import com.evoker.domain.Organizer;
import com.evoker.util.SessionUtil;

public class OrganizerDao extends LoginDao {
	private Session sess = SessionUtil.getSession();
	
	public Organizer getOrganizerUserPass(Login login) {
		Organizer org = null;
		Transaction tx = sess.beginTransaction();
		Query query = sess.createQuery("from Organizer o where o.orgLogin=:login");
		query.setParameter("login", login);
		org = (Organizer) query.getSingleResult();
		tx.commit();
		return org;
	}
}