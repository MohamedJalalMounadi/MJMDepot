package com.Projet.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.SystemException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hibernat.Util.HibernatUtil;
import com.Projet.model.Marche;



public class MarcheDao {
	Session session = HibernatUtil.openSession();
	org.hibernate.Transaction tx = null;

	public void AddMarche(Marche M) throws IllegalStateException, SystemException {
		try {
			tx = session.getTransaction();
			((org.hibernate.Transaction) tx).begin();
			System.out.println("lool");
			session.saveOrUpdate(M);

			tx.commit();
			System.out.println("lool1");
		} catch (Exception e) {

			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Marche> getAllMarche() {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		List<Marche> list = new ArrayList<Marche>();
		try {

			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Marche");
			list = query.list();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Marche> getmarchebyprojet(int identif) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		List<Marche> list = new ArrayList<Marche>();
		try {

			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Marche where ProM_id='" + identif + "'");
			list = query.list();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	public void dropMarche(Marche Mar) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.delete(Mar);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}
	public Marche getMarcheById(int Id) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		Marche  Mar = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = (Query) session.createQuery("from Marche where idM='" + Id + "'");
			Mar = (Marche) ((org.hibernate.Query) query).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Mar;
		
}
	public void updateM(Marche M) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.update(M);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}













}
