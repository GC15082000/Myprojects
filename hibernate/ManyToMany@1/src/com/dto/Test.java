package com.dto;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		TrainDTO tr = new TrainDTO();
		tr.settId(1);
		tr.settName("Avantika Express");

		TrainDTO tr1 = new TrainDTO();
		tr1.settId(2);
		tr1.settName("Rajdhani Express");

		PassengerDTO pr1 = new PassengerDTO();
		pr1.setpID(1);
		pr1.setpName("Gaurav");
		pr1.setpStation("Ujjain");

		PassengerDTO pr2 = new PassengerDTO();
		pr2.setpID(2);
		pr2.setpName("Garvit");
		pr2.setpStation("Delhi");

		Set s1 = new HashSet();
		s1.add(pr1);
		s1.add(pr2);

		tr.setPassenger(s1);
		tr1.setPassenger(s1);

        s.save(tr);
        s.save(tr1);
     
		tx.commit();
		s.close();
		// sf.close();

	}

}
