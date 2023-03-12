package com.emp.software;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		Configuration cfg=null;
	    SessionFactory sf=null;
	   Session s= null; 
	   
		try{
	
		cfg =new Configuration().configure("Hibernate.cfg.xml");
	    sf = cfg.buildSessionFactory();
	    s= sf.openSession();
	    /*Employee em =(Employee) s.get(Employee.class, 1);
	    System.out.println(" Employee Details");
	    System.out.println("        ");
	    System.out.println("Employee name "+em.getEname());
	    System.err.println("Employee Eno "+em.getEno());*/
	    
	    Employee em =(Employee) s.load(Employee.class, 10);
	   // System.out.println(" Employee Details");
	    //System.out.println("        ");
	   // System.out.println("Employee name "+em.getEname());
	    System.out.println("Employee Eno "+em.getEno());
	 	    }
		catch(Exception e) {
			
			System.out.println("Employee Updation Failure");			
			e.printStackTrace();
		}
		finally {
			s.close();
			sf.close();
		}
	}

}
