package com.dto;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Test {
   public static void main (String... args)
   {
	  CompanyDTO dto =new CompanyDTO();
	  dto.setCid(2);
	  dto.setCproduct("COMPUTER2");
	  dto.setCname("GOOGLE2");
	  dto.setCcity("RATLAM");
	  dto.setCtype("Electronic2");
	  
	  Configuration cfg =new Configuration().configure("Hibernate.cfg.xml");
	  SessionFactory sf=cfg.buildSessionFactory();
	  Session s=sf.openSession();
	  Transaction tx=s.beginTransaction();
	  
	  //s.save(dto);
	  Criteria crit=s.createCriteria(CompanyDTO.class);
	  //crit.add(Restrictions.like("ctype","Electric"));
	 // crit.add(Restrictions.eq("ctype","Electric"));
	 // crit.add(Restrictions.like("ctype","Electric"));
	  
	  //Select attributes 
	 // ProjectionList p= Projections.projectionList();
	 // p.add(Projections.property("ctype"));
	  //p.add(Projections.property("cname"));
	  
	  //Aggregate Function 
	  // p.add(Projections.count("ctype"));
	  //  p.add(Projections.sum("cid"));
	 // p.add(Projections.min("cid"));
	 // p.add(Projections.max("cid"));
	   // p.add(Projections.avg("cid"));
	  
	  // And ,or operator
	 // crit.add(Projections.property("ctype"));
	 // crit.add(Restrictions.and(
//			 Restrictions.like("ctype","elect%"),
//	          Restrictions.eq("cid","5"))
//	          );
	  
	  // aliases
	  // crit.createAlias("ctype","type");
   
	   // first few
	  //crit.setFirstResult(5);
      
	  // max records
	  //crit.setMaxResults(4);
	  
	  //orderby
	 // crit.addOrder(Order.asc("cid"));
   	 // crit.addOrder(Order.desc("cid"));

	 // crit.setProjection(p);
	  
	  List l=crit.list();
	  System.out.println(l);
	  tx.commit();	 
	  s.close();
	  //sf.close();
	  
   }
}
