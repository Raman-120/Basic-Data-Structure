import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<>();

        // we can use linkedList as a stack and Queue

        //Stack Demonstration

        linkedList.push("Guitar");
        linkedList.push("Piano");
        linkedList.push("Violet");
        linkedList.push("Drum");
        linkedList.push("Bass");

        System.out.println(linkedList);


    }
}
