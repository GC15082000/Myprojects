package com.dto;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AnnotationConfiguration cfg=new AnnotationConfiguration().configure("Hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        
        BankDTO bk=new BankDTO();
        bk.setBankID(1541);
        bk.setBankIFSCCode("Xyz1541");
        bk.setBankName("SBI");
        
        BankDTO bk1=new BankDTO();
        bk1.setBankID(1641);
        bk1.setBankIFSCCode("Xyz1641");
        bk1.setBankName("SEBI");
     
        AccountDTO acc= new AccountDTO();
        acc.setAccID(1);
        acc.setAccType("ChildAccount");
        acc.setAccHolderName("Gaurav");
       
         
        AccountDTO acc1= new AccountDTO();
        acc1.setAccID(2);
        acc1.setAccType("ChildAccount1");
        acc1.setAccHolderName("Gaurav1");
      
        Set s1=new HashSet();
        s1.add(acc);
        s1.add(acc1);
        
        bk.setAccount(s1);
        bk1.setAccount(s1);
        
        s.save(bk);
        s.save(bk1);
   
        tx.commit();
        s.close();
       //sf.close();
       
	}

}
