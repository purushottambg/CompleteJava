package collection.deque;
import java.util.*;

public class QueuExample1 {
    public static void main(String[] args) {
        // Using LinkedList as a Queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek()); // Retrieves but does not remove
        System.out.println("Poll: " + queue.poll()); // Retrieves and removes
        System.out.println("After Poll: " + queue);

        // Using PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        priorityQueue.offer(15);

        System.out.println("\nPriorityQueue: " + priorityQueue);
        System.out.println("Poll: " + priorityQueue.poll()); // Retrieves the smallest element
        System.out.println("After Poll: " + priorityQueue);
    }
}

