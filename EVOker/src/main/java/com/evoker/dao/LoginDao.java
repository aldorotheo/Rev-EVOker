package com.evoker.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.evoker.domain.Login;
import com.evoker.util.SessionUtil;

public class LoginDao implements UserDao {

	public Login getLoginByUserPass(String username, String pass) {
		Login login = null;
		Session sess = SessionUtil.getSession();
		Transaction tx = sess.beginTransaction();
		Query query = sess.createQuery("from Login l where l.userName=:username and l.passWord=:password");
		query.setParameter("username", username);
		query.setParameter("password", pass);
		login = (Login) query.getSingleResult();
		tx.commit();
		sess.close();
		return login;
	}

}
