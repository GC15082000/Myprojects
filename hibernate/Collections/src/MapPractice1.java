import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {
	 public static void main(String args[]) {
		 
		 Map<String,String> mp=new LinkedHashMap<>();
		 mp.put("gc","Gaurav");
		 mp.put("gc1", "Chouhan");
		 mp.put("gc3", "GAURAV");
		 mp.put(null, "gc");
		 mp.put(null, null);
		 
		 for(Map.Entry<String, String> map:mp.entrySet()) {
			 System.out.println(map.getKey()+" "+map.getValue());
		 }
		
	 }
}
 1 "2" //ov
 2     //