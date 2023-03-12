package collections;

import java.util.HashMap;
import java.util.Map;


public class Bucket_and_ball extends Ball{


	public static void main(String[] args) {
		Map<Integer,Ball> st = new HashMap<>();
		
		st.put(1,new Ball(11,"blue"));
		st.put(2,new Ball(12,"red")); 
		st.put(2,new Ball(12,"black")); 

		System.out.println();		
		System.out.println("After Sorting of Map....");
		
		for(Map.Entry<Integer ,Ball> sMap :st.entrySet()) {
		System.out.println(sMap);
		}
		

	}

}
