package com.spring.orm1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
//		Student student=new Student(234,"Gaurav","Ratlam");
//		int r=studentDao.insert(student);
//		System.out.println("Done "+r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;
		while (go) {
			System.out.println("Press 1 to add a new Student");
			System.out.println("Press 2 to display all Student");
			System.out.println("Press 3 to get detail of single  Student");
			System.out.println("Press 4 to delete Student");
			System.out.println("Press 5 to update Student");
			System.out.println("Press 6 to exit");

			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					Student student = new Student(1, "Gaurav1", "Pune");
					studentDao.insert(student);
					System.out.println("DONE");
					break;

				case 2:
					studentDao.getAllStudent();
					System.out.println("DONE");
					break;

				case 3:
					studentDao.getStudent(1);
					System.out.println("DONE");
					break;

				case 4:
					studentDao.delete(3);
					System.out.println("DONE");
					break;

				case 5:	Student student1 = new Student(1, "Gaurav1", "MP");
					studentDao.update(student1);
					System.out.println("DONE");
					break;

				
				case 6:// to exit
					go = false;
					System.out.println("DONE");
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Invalid input");
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Thanks for using  application");
		System.out.println("See you soon!");

	}

}
