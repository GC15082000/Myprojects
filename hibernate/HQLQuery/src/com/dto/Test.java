package com.dto;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dto.CoursesDTO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CoursesDTO cur = new CoursesDTO();
       cur.setCourseID(1);
       cur.setCourseInstructor("GAURAV3");
       cur.setCourseName("C++3");
       cur.setCoursePrice(3500);
       
       Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
		
	   SessionFactory sf = cfg.buildSessionFactory();

	   Session s = sf.openSession();

	   Transaction tx = s.beginTransaction();
	   
	   s.save(cur);
	   
	   //QUERY
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
	 		Query q= s.createQuery("from CoursesDTO ");
	 		
//	 		Query q= s.createQuery("select count(courseID) from CoursesDTO where coursePrice>1500");
//	 		Query q= s.createQuery("select max(coursePrice) from CoursesDTO");
//	 		Query q= s.createQuery("select min(coursePrice) from CoursesDTO");
//	 		Query q= s.createQuery("select avg(coursePrice)from CoursesDTO");
//	 		Query q= s.createQuery("from CoursesDTO");
//	 		Query q= s.createQuery("from CoursesDTO");
//	 		Query q= s.createQuery("from CoursesDTO");
//	 		Query q= s.createQuery("select sum(coursePrice) from CoursesDTO");
//	 		Query q= s.createQuery("from CoursesDTO");
//	    	Query q= s.createQuery("from CoursesDTO");
//		    Query q= s.createQuery("from CoursesDTO");
	 		
	 		
	 		List l = q.list();
 		    Iterator it = l.iterator();	 	    
	 		CoursesDTO dto;
	 		while(it.hasNext())
	 		{
	 		dto=(CoursesDTO)it.next();
	 		System.out.println("CourseID :" +cur.getCourseID());				
	 		}
	 		
//	 		System.out.println("count : "+l.get(0));
//	 		System.out.println("MAX : "+l.get(0));
//	 		System.out.println("MIN : "+l.get(0));
//	 		System.out.println("AVG : "+l.get(0));
//	 		System.out.println("BETWEEN : "+l.get(0));
//	 		System.out.println("LIKE : "+l.get(0));
//	 		System.out.println("ORDERBY : "+l.get(0));
//	 		System.out.println("Sum  : "+l.get(0));
//    		System.out.println("ALIASAS : "+l.get(0));
//	 		System.out.println("GROUPBY: "+l.get(0));
//	 		System.out.println("DELETE : "+l.get(0));
//	 		System.out.println("AND : "+l.get(0));
//	 		System.out.println("NOT : "+l.get(0));
	 		tx.commit();
	 		sf.close();
	 		s.close();
	}

}
