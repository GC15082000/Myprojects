import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class practice2 {

	public static void main(String[] args) {

		TreeMap<String,String> students = new TreeMap<String,String>();
		students.put("g","GC1");
		students.put("p","GC2");
		students.put("o","GC3");
		students.put("m","GC4");
		students.put(null, null);
		System.out.println(students);
		for(Map.Entry<String,String> st:students.entrySet()) {
			System.out.println(st);
		}
		
		
		
	}

}