import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorProgram {
 public static void main(String args[]) {
	 
	 List<Integer> ll=new CopyOnWriteArrayList<Integer>();
	 ll.add(1);
	 ll.add(2);
	 ll.add(3);
	 ll.add(10);
	 ll.add(20);
	 ll.add(3);
	 System.out.println(ll);
	 Collections.sort(ll);
	 //Iterator Interface
	Iterator<Integer> itr=ll.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
		 ll.add(5);
	 }
	
	 
 }
}
