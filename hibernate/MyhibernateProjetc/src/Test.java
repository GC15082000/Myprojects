

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		UserDTO us= new UserDTO();
		
	    us.setID(0);  
	    us.setFirst_name(null);	    
		us.setLast_name(null);
		us.setPassword(0);
	    us.setAddress("gc");
	    
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