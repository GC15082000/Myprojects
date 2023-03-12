package com.DTO;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		UserDTO us= new UserDTO();
		
	   // us.setID(1);  
	    us.setFirst_name("gc");	     ///usr1  //us2
		us.setLast_name("gcgc");
		us.setPassword(1234);
	    us.setAddress("gc");
	    
        Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
        //Transaction tx = s.beginTransaction();
		
		Session s1 = sf.openSession();
		UserDTO usr1 = (UserDTO) s1.get(UserDTO.class,1);
		System.out.println(" Address "+usr1.getAddress());
		s1.close();

		Session s2=sf.openSession();
		UserDTO usr2 = (UserDTO) s2.get(UserDTO.class,1);
		System.out.println(" Address "+usr2.getAddress());
		s2.close();
		
		 usr1 = (UserDTO) s2.get(UserDTO.class,1);
		System.out.println(" Address "+usr1.getAddress());
		s1.close();
		
		// INSERTION 
//		s1.save(us); 
//		s2.save(us); 
//		
		
		
		//tx.commit();
		
		
		//sf.close();
	    
	    
	}

}