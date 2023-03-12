import java.util.HashSet;
import java.util.Set;
public class practice3 {

	public static void main(String[] args ){
		
		Set<Mobile> mb=new HashSet<>();
		mb.add(new Mobile(1));
		mb.add(new Mobile(2));
		mb.add(new Mobile(1));
		mb.add(new Mobile(10));
		mb.add(null);
		///mb.remove(new Mobile(1));
		//System.out.println(mb.size()); 
		System.out.println(mb);
	}
}
