package com.dto;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        
        TrainDTO tr=new TrainDTO();
        tr.settId(1);
        tr.settName("Avantika Express");
     
        PassengerDTO pr1= new PassengerDTO();
        pr1.setpID(1);
        pr1.setpName("Gaurav");
        pr1.setpStation("Ujjain");
        pr1.setTrain(tr);
        
         
        PassengerDTO pr2= new PassengerDTO();
        pr2.setpID(2);
        pr2.setpName("Garvit");
        pr2.setpStation("Delhi");
        pr2.setTrain(tr);
        
        // one to many
       Set s1=new HashSet();
        s1.add(pr1);
        s1.add(pr2);
//        
//        bk.setAccount(s1);
//        s.save(bk);
        //many-to-one
        s.save(pr1);
        s.save(pr2);
//    
////        
        tx.commit();
        s.close();
       //sf.close();
       
	}

}
