package CollectionTests;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Pgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		//Queue<String> pq = new LinkedList<String>();
		pq.add("carrot");
		pq.add("apple");
		 pq.add("banana");
	System.out.println(pq.poll() +":" + pq.peek());

	}

}
