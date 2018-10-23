package com.Projet.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hibernat.Util.HibernatUtil;
import com.Projet.model.User;



public class UserDao {
	public User getUserByLogin(String login) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		User user = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = (Query) session.createQuery("from User where login='" + login + "'");
			user = (User) ((org.hibernate.Query) query).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}
}
