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
		em.setEno(4);
		
		cfg =new Configuration().configure("Hibernate.cfg.xml");
	    sf = cfg.buildSessionFactory();
	    s= sf.openSession();
	    tx= s.getTransaction();
	    tx.begin();
	   
	   s.delete(em);
	  
	   tx.commit();
	   System.out.println(" Employee Deleted");

	 	    }
		catch(Exception e) {
			tx.rollback();
			System.out.println("Employee Delation Failure");			
			e.printStackTrace();
		}
		finally {
			s.close();
			sf.close();
		}
	}

}
