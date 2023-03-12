package com.dto;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Citizen ct = new Citizen();
		ct.setCitName("Gaurav1");
		ct.setCitCity("Ratlam1");
		
		VoterID vt1 = new VoterID();
		vt1.setVotIDNum(12);
		vt1.setVotName("GauravChouhan");
		vt1.setVotAge("20");
        
		ct.setVoter(vt1);
        		
		s.save(ct);
		tx.commit();

		s.close();
		// sf.close();

	}
}
