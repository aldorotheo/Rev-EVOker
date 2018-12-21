package com.evoker.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.evoker.domain.Judge;
import com.evoker.domain.Login;
import com.evoker.util.SessionUtil;

public class JudgeDao extends LoginDao {
	private Session sess = SessionUtil.getSession();
	
	public Judge getJudgeUserPass(Login login) {
		Judge judge = null;
		Transaction tx = sess.beginTransaction();
		Query query = sess.createQuery("from Judge j where j.judgeLogin=:login");
		query.setParameter("login", login);
		judge = (Judge) query.getSingleResult();
		tx.commit();
		
		return judge;
	}
}