package com.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Subjects s = new Subjects(10);

		Maths m = new Maths(1, 80);

		Stat st = new Stat(2, "normal");

		English e = new English(3, "tense");

		session.save(s);
		session.save(m);
		session.save(st);
		session.save(e);

		tx.commit();
		session.close();

	}

}
