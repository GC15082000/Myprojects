package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sorting extends Student {

	public static void main(String args[]) {
	List<Student> List1 = new ArrayList<Student>();
	
	List1.add(new Student(10,"gaurav","10th"));	
	List1.add(new Student(11,"gaurav","11th"));	
	
	for(Student std : List1) {
		System.out.println(std);
	}
	
	//Collections.sort(List1);
	
	//for(Student std : List1) {
	//	System.out.println(std);
	//}
	}
	
}
