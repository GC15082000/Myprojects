package com.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 Table per Hierchacy Class
		//1.Table per subclass
		
		Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		CreditCardDTO cd = new CreditCardDTO();
		cd.setPaymentsID(1);
		cd.setAmount(2300);
		cd.setCreditCardType("VISA");
		
		ChequeDTO cq=new ChequeDTO();
		cq.setPaymentsID(2);
		cq.setAmount(2600);
		cq.setChequeType("ICICI");
		
		s.save(cd);
		s.save(cq);

		tx.commit();
		s.close();
		// sf.close();
		
		

	}

}
