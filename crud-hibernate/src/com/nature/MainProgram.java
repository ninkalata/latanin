package com.nature;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nature.model.dress;
import com.nature.util.HibernateUtilities;

public class MainProgram {
	
	SessionFactory sessionFactory = HibernateUtilities.getSessionFactory();
	Session session = sessionFactory.openSession();

	public static void main(String[] args) {
		new MainProgram().performCRUD();
	}

	public void performCRUD() {
		savedress();
		//getdresss();
		//updatedress(2, "Updated!");
		//deletedress(3);

		session.close();
		sessionFactory.close();
	}

	private void savedress() {
		session.beginTransaction();
		dress dress = new dress();
		dress.setName("shirt");
		dress.setCategory("jeans");
		dress.setDescription("cotton");
		dress.setPrice(500);
		session.save(dress);
		session.getTransaction().commit();
	}

	private void getdresss() {
		session.beginTransaction();
		Query selectQuery = session.createQuery("FROM dress");
		List<dress> dresss = (List<dress>) selectQuery.list();
		session.getTransaction().commit();
		for (dress dress : dresss) {
			System.out.println(dress);
		}
	}

	private void updatedress(int id, String description) {
		session.beginTransaction();
		dress dress = (dress) session.get(dress.class, id);
		dress.setDescription(description);
		session.getTransaction().commit();
	}

	private void deletedress(int id) {
		session.beginTransaction();
		dress dress = (dress) session.get(dress.class, id);
		session.delete(dress);
		session.getTransaction().commit();
	}

}
