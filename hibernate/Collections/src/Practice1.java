import java.util.PriorityQueue;

public class Practice1 {
	public static void main(String[] args) {
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
	    pQueue.add("Apple");
	    pQueue.add("Nokia");
	    pQueue.add("Samsung");
	    pQueue.add("Apple");
	    
	    System.out.println(pQueue.poll() + " " + pQueue.poll());
	    System.out.println(" " + pQueue.peek() + " " + pQueue.poll());
	    System.out.println(" " + pQueue.peek() + " " + pQueue.poll());
	  
  }
}
// apple nokia samsung Apple