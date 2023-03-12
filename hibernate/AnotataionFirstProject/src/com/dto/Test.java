package com.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration().configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
        Transaction tx=s.beginTransaction(); 
        
        ProductDTO pr =new ProductDTO();
        pr.setpID(1);
        pr.setpName("GC");
        
        System.out.println("Annotations");
        s.save(pr);
        tx.commit();
        s.close();
	}

}
