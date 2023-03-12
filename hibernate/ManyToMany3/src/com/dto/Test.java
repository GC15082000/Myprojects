package com.dto;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Test {

	public static void main(String[] args) {

	  Configuration cfg =new Configuration().configure("Hibernate.cfg.xml");
	  SessionFactory sf=cfg.buildSessionFactory();
	  Session s=sf.openSession(); 
	  Transaction tx=s.beginTransaction();
	  
	  UserDTO user=new UserDTO();
	  user.setuId(1);	  
	  user.setuName("Gaurav");
	  user.setuEmail("gaurav@Gmail.com");
	  
	  UserDTO user1=new UserDTO();
	  user1.setuId(2);	  
	  user1.setuName("Garvit");
	  user1.setuEmail("garvit@Gmail.com");
	  
	  UserDTO user2=new UserDTO();
	  user2.setuId(3);	  
	  user2.setuName("Rohit");
	  user2.setuEmail("rohit@Gmail.com");
	  
	  ProductDTO pr=new ProductDTO();
	  pr.setpID(1);
	  pr.setpName("Ring");
	  pr.setpManfDate("2020");
	  
	  ProductDTO pr1=new ProductDTO();
	  pr1.setpID(2);
	  pr1.setpName("Table");
	  pr1.setpManfDate("2019");
	  
	  ProductDTO pr2=new ProductDTO();
	  pr2.setpID(3);
	  pr2.setpName("Tie");
	  pr2.setpManfDate("2021");
	  
	  Set set =new HashSet();
	  set.add(user);
	  set.add(user1);
	  set.add(user2);
	  
//	  Set set1 =new HashSet();
//	  set1.add(pr);
//	  set1.add(pr1);
//	  set1.add(pr2);
	  
	  pr.setUser(set);
	  pr1.setUser(set);
	  pr2.setUser(set);
	  
	  s.save(pr);
	  s.save(pr1);
	  s.save(pr2);
	  
	  tx.commit();
	  s.close();
	  //sf.close();
	  
   }
}


