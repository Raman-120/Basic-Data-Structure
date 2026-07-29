import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args){

    // Priority Queue is used to serve elements
    // Higher priority queue are served first before lower priority

        Queue<Double> priorityQueue = new LinkedList<>();
        priorityQueue.offer(3.0);
        priorityQueue.offer(4.0);
        priorityQueue.offer(1.5);
        priorityQueue.offer(3.6);
        priorityQueue.offer(2.8);

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }


    }
}
