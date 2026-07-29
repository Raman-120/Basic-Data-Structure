import java.util.*;

public class PriorityQueues {
    public static void main(String[] args){

    // Priority Queue is used to serve elements
    // Higher priority queue are served first before lower priority

//        Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
//        priorityQueue.offer(3.0);
//        priorityQueue.offer(4.0);
//        priorityQueue.offer(1.5);
//        priorityQueue.offer(3.6);
//        priorityQueue.offer(2.8);


        Queue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.offer("A");
        priorityQueue.offer("C");
        priorityQueue.offer("F");
        priorityQueue.offer("B");

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }


    }
}
