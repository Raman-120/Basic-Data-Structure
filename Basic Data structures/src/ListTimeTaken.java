import java.util.LinkedList;
import java.util.ArrayList;

public class ListTimeTaken {
    public static void main(String[] args){

        //This program demonstrates the time taken by LinkedList and ArrayList to execute

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        long startTime;
        long endTime;
        long elapsedTime;

        // for LinkedList

        startTime = System.nanoTime();

        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.getLast();
        //linkedList.removeFirst();
        //linkedList.remove(500000);
        linkedList.removeLast();

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: " + elapsedTime + " ns");


        // for arrayList
        startTime = System.nanoTime();

        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.getLast();
       // arrayList.removeFirst();
        //arrayList.remove(500000);
        arrayList.removeLast();

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: " + elapsedTime + " ns");

    }
}
