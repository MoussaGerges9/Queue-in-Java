import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("First Person");
		queue.add("Second Person");
		queue.add("Third Person");
		queue.add("Fourth Person");
		queue.add("Fifth Person");
		queue.add("Last Person");

		System.out.println("Initialized queue: " + queue);
		System.out.println("Queue's peek: " + queue.peek());
		System.out.println("After getting peek: " + queue);

		queue.poll();
		System.out.println("After poll: " + queue);

		queue.remove("Fourth Person");
		System.out.println("After removing the Fourth Person: " + queue);
		System.out.println("Current queue size: " + queue.size());
		System.out.println("Does queue contains \"Third Person\": " + queue.contains("Third Person"));
		System.out.println("Second element after casting queue to array: " + queue.toArray()[1]);

		System.out.println("Element at the top: " + queue.element()); // Gets also the element at the top but through an error if the queue is empty
		queue.offer("Sorry for late.. I'm a new person!"); // It doesn't through an exception but returns false if the queue is full
		System.out.println("The queue after too many modifications: " + queue);
	}

}
