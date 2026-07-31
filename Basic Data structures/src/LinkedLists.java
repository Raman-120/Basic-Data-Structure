import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<>();

        // we can use linkedList as a stack and Queue

        //Stack Demonstration

//        linkedList.push("Guitar");
//        linkedList.push("Piano");
//        linkedList.push("Violet");
//        linkedList.push("Drum");
//        linkedList.push("Bass");
//        linkedList.pop(); //removes top object same as Stack follows LIFO i.e. Bass will be removed

        //Queue Demonstration

        linkedList.offer("Guitar");
        linkedList.offer("Piano");
        linkedList.offer("Violet");
        linkedList.offer("Drum");
        linkedList.offer("Bass");
        linkedList.poll(); // removes the first object as Queue follow FIFO  i.e. Guitar will be removed

        System.out.println(linkedList);


    }
}
