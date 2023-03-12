package com.emp.software;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		Configuration cfg=null;
	    SessionFactory sf=null;
	   Session s= null;
	   Transaction tx= null;    
		try{
		Employee em =new Employee ();
		em.setEaddr("gc4");
		em.setEname("GC4");
		em.setEno(4);
		em.setEsal(4000);
		
		cfg =new Configuration().configure("Hibernate.cfg.xml");
	    sf = cfg.buildSessionFactory();
	    s= sf.openSession();
	    tx= s.getTransaction();
	    tx.begin();
	   
	  // s.update(em);
	   s.saveOrUpdate(em);
	   tx.commit();
	   System.out.println(" Employee Updated");

	 	    }
		catch(Exception e) {
			tx.rollback();
			System.out.println("Employee Updation Failure");			
			e.printStackTrace();
		}
		finally {
			s.close();
			sf.close();
		}
	}

}
