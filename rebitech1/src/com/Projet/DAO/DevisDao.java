package com.Projet.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.SystemException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hibernat.Util.HibernatUtil;
import com.Projet.model.Devis;





public class DevisDao {
	Session session = HibernatUtil.openSession();
	org.hibernate.Transaction tx = null;

	public void AddDevis(Devis D) throws IllegalStateException, SystemException {
		try {
			tx = session.getTransaction();
			((org.hibernate.Transaction) tx).begin();
			System.out.println("lool");
			session.saveOrUpdate(D);

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
	public List<Devis> getDevisbyprojet(int identif) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		List<Devis> list = new ArrayList<Devis>();
		try {

			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Devis where ProD_id='" + identif + "'");
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
	public Devis getDevisById(int Id) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		Devis De = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = (Query) session.createQuery("from Devis where id='" + Id + "'");
			De = (Devis) ((org.hibernate.Query) query).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return De;
	}
	
	public void dropDevis(Devis De) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.delete(De);
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
	public void updateD(Devis D) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.update(D);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
}}
