package com.DTO;



import org.hibernate.Session;
import org.hibernate.Transaction;

import UserDTO;


public class Test {

	public static void main(String[] args) {
		UserDTO us= new UserDTO();
		
	    us.setID(0);  
	    us.setFirst_name(null);	    
		us.setLast_name(null);
		us.setPassword(0);
	    us.setAddress(null);
	    
        Configuration cfg = new Configuration().configure("Configuration.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();
//
////		ProductDTO prodDto = (ProductDTO) session.get(ProductDTO.class, 2);
////
////		System.out.println("Price ="+prodDto.getPrice());
		s.save(us); /// Insert operation 
		
		tx.commit();
		s.close();
		sf.close();
	    
	    
	}

}