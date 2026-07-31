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
        //linkedList.poll(); // removes the first object as Queue follow FIFO  i.e. Guitar will be removed

        // LinkedLists really shines in insertion and deletion

        //For insertion
        linkedList.add(3,"Bansuri");

        //For deletion
        linkedList.remove("Violet");

        // We can also use LinkedList for search but that is not recommended as it is non-contiguous i.e.
        // it stores data at anywhere in the computer memory location

        //For Searching an element
        System.out.println(linkedList.indexOf("Drum"));


        // We can also peek the head or tail element in LinkedList
        System.out.println(linkedList.peekFirst()); // For head peek
        System.out.println(linkedList.peekLast()); // For tail peek

        // We can also add and remove element at the head or tail of the LinkedList
        linkedList.addFirst("Sitar"); // Add at the first index
        linkedList.addLast("Madal"); // Add at the last index

        linkedList.removeFirst(); // Removes the first element
        linkedList.removeLast(); // Removes the last element

        System.out.println(linkedList);



    }
}
