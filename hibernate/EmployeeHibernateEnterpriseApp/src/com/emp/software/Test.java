package com.emp.software;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		Employee em =new Employee ();
		em.setEaddr("gc5");
		em.setEname("GC5");
		em.setEno(5);
		em.setEsal(5000);
		
		try{Configuration cfg =new Configuration().configure("Hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s= sf.openSession();
	    Transaction tx= s.beginTransaction();
	    
	    //int eno= (Integer)s.save(em);
	   s.persist(em);
	   tx.commit();
	   System.out.println(" record inserted completely");
	   
	    
//	    if(eno==1) {
//	       System.out.println(" record inserted completely");
//	    }
//	    else {
//	    	System.out.print("not inserted");
//	    }
	    
	   s.close();
	   sf.close();
	    }
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
