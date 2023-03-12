package com.dto.Test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dto.CSE.CSEDTO;
import com.dto.HOD.HODDTO;
import com.dto.Parents.ParentsDTO;
import com.dto.Result.ResultDTO;
import com.dto.Students.StudentsDTO;
import com.dto.principal.PrincipalDTO;

public class Test {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();		
		Transaction tx = s.beginTransaction();
        
		ParentsDTO pr1=(ParentsDTO)s.get(ParentsDTO.class,161);
		ParentsDTO pr2=(ParentsDTO)s.get(ParentsDTO.class,162);
		ParentsDTO pr3=(ParentsDTO)s.get(ParentsDTO.class,163);
		ParentsDTO pr4=(ParentsDTO)s.get(ParentsDTO.class,164);
		
		StudentsDTO st1=(StudentsDTO)s.get(StudentsDTO.class,151);
		StudentsDTO st2=(StudentsDTO)s.get(StudentsDTO.class,152);
		StudentsDTO st3=(StudentsDTO)s.get(StudentsDTO.class,153);
		StudentsDTO st4=(StudentsDTO)s.get(StudentsDTO.class,154);
		
		HODDTO h1=(HODDTO)s.get(HODDTO.class, 181);
		HODDTO h2=(HODDTO)s.get(HODDTO.class, 182);
		HODDTO h3=(HODDTO)s.get(HODDTO.class, 183);
		HODDTO h4=(HODDTO)s.get(HODDTO.class, 184);
		
		CSEDTO cse =(CSEDTO)s.get(CSEDTO.class, 1);
		
		PrincipalDTO prin=(PrincipalDTO)s.get(PrincipalDTO.class, 1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter UserTYPE:Parent,Student,Teacher,HOD ");
		String s1=sc.next();
		System.out.println("<<<<<<<<<<<<<<<<Hello "+s1+">>>>>>>>>>>>>>>");
		System.out.println("Please Enter Your ID NUMBER");
		int id=sc.nextInt();
		if(id==161||id==151||id==181) {
		ResultDTO rs=(ResultDTO)s.get(ResultDTO.class,1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++Result+++++++++++++++++");
		System.out.println("College Name:"+rs.getsCollegeName());
		System.out.println("NAME:"+rs.getSname()+"       "+"Roll Number:"+rs.getRollno());
		System.out.println("Gender:"+rs.getSgender()+"       "+"Parent Name:"+pr1.getPname());
		System.out.println("DateOfBirth:"+rs.getSdob() +"      "+"Department :"+st1.getsDepartment());
		System.out.println("  ");
		System.out.println(cse);
		System.out.println("MARKS(%):"+rs.getSmarks());
		System.out.println("");
		System.out.println("Principal:"+prin.getpName()+"      "+"HOD:"+h1.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		}
		
		else if(id==162||id==152||id==182) {
		ResultDTO rs2=(ResultDTO)s.get(ResultDTO.class,2);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++Result+++++++++++++++++");
		System.out.println("College Name:"+rs2.getsCollegeName());
		System.out.println("NAME:"+rs2.getSname()+"          "+"Roll Number:"+rs2.getRollno());
		System.out.println("Gender:"+rs2.getSgender()+"        "+"Parent Name:"+pr2.getPname());
		System.out.println("DateOfBirth:"+rs2.getSdob()+"      "+"Department :"+st2.getsDepartment());
		System.out.println("  ");
		System.out.println("MARKS(%):"+rs2.getSmarks());
		System.out.println("");
		System.out.println("Principal:"+prin.getpName()+"      "+"HOD:"+h2.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		}
		
		else if(id==163||id==153||id==183) {
		ResultDTO rs3=(ResultDTO)s.get(ResultDTO.class,3);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++Result+++++++++++++++++");
		System.out.println("College Name:"+rs3.getsCollegeName());
		System.out.println("NAME:"+rs3.getSname()+"       "+"Roll Number:"+rs3.getRollno());
		System.out.println("Gender:"+rs3.getSgender()+"       "+"Parent Name:"+pr3.getPname());
		System.out.println("DateOfBirth:"+rs3.getSdob()+"      "+"Department :"+st3.getsDepartment());
		System.out.println("  ");
		System.out.println("MARKS(%):"+rs3.getSmarks());
		System.out.println("");
		System.out.println("Principal:"+prin.getpName()+"      "+"HOD:"+h3.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");}
		
		else if(id==164||id==154||id==184) {
		ResultDTO rs4=(ResultDTO)s.get(ResultDTO.class,4);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++Result+++++++++++++++++");
		System.out.println("College Name:"+rs4.getsCollegeName());
		System.out.println("NAME:"+rs4.getSname()+"       "+"Roll Number:"+rs4.getRollno());
		System.out.println("Gender:"+rs4.getSgender()+"       "+"Parent Name:"+pr4.getPname());
		System.out.println("DateOfBirth:"+rs4.getSdob()+"      "+"Department :"+st4.getsDepartment());
		System.out.println("  ");
		System.out.println("MARKS(%):"+rs4.getSmarks());
		System.out.println("");
		System.out.println("Principal:"+prin.getpName()+"      "+"HOD:"+h4.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		}
		
		else {
			System.out.println("INVALID USER!!!!");
		}
		tx.commit();

		s.close();
		// sf.close();

	}
}
