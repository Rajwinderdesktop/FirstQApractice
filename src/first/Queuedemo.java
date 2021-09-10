package first;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queuedemo {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityBlockingQueue<Integer>();

		q.add(5);
		q.add(4);
		q.add(3);
		q.add(2);
		q.add(1);

		// Display contents of the queue.
		System.out.println("Elements of queue " + q);

		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-  " + head);

		// Rest all methods of collection
		// interface like size and contains
		// can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue-  " + size);
		int hede= q.poll();
		System.out.println(hede);
		System.out.println(q);
		
		
	}
}
