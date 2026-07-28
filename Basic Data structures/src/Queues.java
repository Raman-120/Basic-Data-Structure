import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){

        // add = enqueue , offer()
        // remove = dequeue ,poll()
        // element() or peek() method is used to look at the head of the queue or the first element of the queue

        Queue<String> queue = new LinkedList<>();

        // adding elements in the queue
        queue.offer("The Police");
        queue.offer("Guns N Roses");
        queue.offer("Metallica");
        queue.offer("Axix Band");

        //displaying which element is the first element in  queue
        System.out.println(queue.element()); //displays The Police

        //displaying queue
        System.out.println(queue);

        // removing elements in the queue
        queue.poll();

        System.out.println(queue);

        //checks if the object is available in the queue
        System.out.println(queue.contains("Guns N Roses"));
    }
}
