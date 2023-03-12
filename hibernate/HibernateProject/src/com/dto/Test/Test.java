package com.dto.Test;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dto.Circle.Circle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
          
        Circle c= new Circle();
        c.setIdCircle(1);
        System.out.println("Circle"+ c.getIdCircle());
        tx.commit();
        s.close();
       //sf.close();
       
	}

}
