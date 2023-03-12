package com.dto;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		ElectronicItemsDTO ei = new ElectronicItemsDTO();
		ei.setEid(5);
		ei.setEprice(1000);
		ei.setEname("mobile");
		ei.setEmanufacturedCompany("boat");
		ei.setEchargable(true);
		
		Configuration cfg =new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory sf= cfg.buildSessionFactory();
        Session s= sf.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(ei);
       // SQL-QUERY
 	   /* 1. SELECT QUERY 
 	    * 2. SELECT USING COUNT FUNCTION 
 	    * 3. SELECT USING MAX FUNCTION 
 	    * 4. SELECT USING MIN FUNCTION 
 	    * 5. SELECT USING AVG FUNCTION 
 	    * 6. SELECT USING BETWEEN FUNCTION 
 	    * 7. SELECT USING LIKE %
 	    * 8. SELECT ORDERBY
 	    * 9. SELECT USING SUM FUNCTION 
 	    *10. SELECT USING ALIAS. 
 	    *11. SELECT USING GROUPBY. 
 	    *12.SELECT USING  DELETE OPERATOR
 	    *13.SELECT USING  AND OPERATOR
 	    *14.SELECT USING  NOT OPERATOR
 	    *15.SELECT USING  IN OPERATOR
 	   */
      //  Query q=s.createSQLQuery("SELECT * FROM myelectronicsitems.electronicitem");
 		
// 		Query q= s.createSQLQuery("select count(eid) from myelectronicsitems.electronicitem where ePrice>1500");
//		Query q= s.createSQLQuery("select max(ePrice) from myelectronicsitems.electronicitem");
// 		Query q= s.createSQLQuery("select min(ePrice) frommyelectronicsitems.electronicitem");
// 		Query q= s.createSQLQuery("select avg(ePrice)from myelectronicsitems.electronicitem");
// 		Query q= s.createSQLQuery("SELECT ename from myelectronicsitems.electronicitem where eprice  BETWEEN 1000 AND 15000");
//        Query q= s.createSQLQuery("select eprice from myelectronicsitems.electronicitem where ename like 'm%'");
// 		Query q= s.createSQLQuery("select eprice from myelectronicsitems.electronicitem order by eprice DESC");
// 		Query q= s.createSQLQuery("select sum(ePrice) from myelectronicsitems.electronicitem");
 		Query q= s.createSQLQuery("select eprice as price from myelectronicsitems.electronicitem");
//    	Query q= s.createSQLQuery("from myelectronicsitems.electronicitem");
//	    Query q= s.createSQLQuery("from myelectronicsitems.electronicitem");
 		
        
        List l=q.list();
//        
//        Iterator itr=l.iterator();
//        Object dto;        
//        while(itr.hasNext()) 
//        {
//        	dto=itr.next();
//        	System.out.println("Ename="+ ei.getEname());
//        }
//        
 //		System.out.println("count : "+l.get(0));
 //		System.out.println("MAX : "+l.get(0));
// 		System.out.println("MIN : "+l.get(0));
// 		System.out.println("AVG : "+l.get(0));
 //       System.out.println("BETWEEN : "+l.get(0));
 //		System.out.println("LIKE : "+l.get(0));
 //		System.out.println("ORDER BY : "+l.get(0));
// 		System.out.println("Sum  : "+l.get(0));
		System.out.println("ALIASAS : "+l.get(0));
// 		System.out.println("GROUPBY: "+l.get(0));
// 		System.out.println("DELETE : "+l.get(0));
// 		System.out.println("AND : "+l.get(0));
// 		System.out.println("NOT : "+l.get(0));

        
        
        tx.commit();
        sf.close();
        s.close();
        
	}

}
