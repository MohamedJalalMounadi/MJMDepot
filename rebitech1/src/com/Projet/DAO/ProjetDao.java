package com.Projet.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.SystemException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hibernat.Util.HibernatUtil;
import com.Projet.model.Projet;







public class ProjetDao {
	Session session = HibernatUtil.openSession();
	org.hibernate.Transaction tx = null;

	public void AddProjet(Projet P) throws IllegalStateException, SystemException {
		try {
			tx = session.getTransaction();
			 ((org.hibernate.Transaction) tx).begin();
				System.out.println("lool");
			session.saveOrUpdate(P);
		
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
	public List<Projet>  getAllProjet() {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		List<Projet> list = new ArrayList<Projet>();
		try {
			
			tx = session.getTransaction();
			tx.begin();	
			Query query = session.createQuery("from Projet");
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
		return  list;
	}
	
	public Projet getProjetByIdentif(String Identif) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		Projet Pro = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = (Query) session.createQuery("from Projet where identifiant='" + Identif + "'");
			Pro = (Projet) ((org.hibernate.Query) query).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Pro;
	}
	public void dropProjet(Projet pro) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.delete(pro);
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
	public Projet getProjetById(int Id) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		Projet Pro = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = (Query) session.createQuery("from Projet where id='" + Id + "'");
			Pro = (Projet) ((org.hibernate.Query) query).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Pro;
	}
	public void update(Projet P) {
		Session session = (Session) HibernatUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.update(P);
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
