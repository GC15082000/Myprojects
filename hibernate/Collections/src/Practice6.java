import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice6 {

	  public static void main(String []args) {
		Student s1=new Student(1,"Gaurav");
		Student s2=new Student(3,"Rohit");
		Student s3=new Student(2,"Kunal");
		 
		List l=new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	  }
	}


