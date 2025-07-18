import java.util.Queue;
import java.util.LinkedList;

public class queue {

	public static void main(String[] args) {
		Queue<Integer> queues = new LinkedList<> ();
		queues.add(10);
		queues.add(20);
		queues.add(30);
		
		System.out.println("Dequeued: " + queues.remove());
		System.out.println("Front element: " + queues.peek());
		System.out.println("Queue size: " + queues.size());
		
	}

}

