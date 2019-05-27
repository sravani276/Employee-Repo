package com.pawana.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestHibernate {
	public static void main(String[] args) {
		final SessionFactory sessionFactory;
		sessionFactory = new AnnotationConfiguration().configure().addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee em1 = new Employee("thota",25);
		session.save(em1);
		tx.commit();
		session.close();
	}


}
