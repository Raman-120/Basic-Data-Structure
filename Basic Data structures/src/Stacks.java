import java.util.Stack;

public class Stacks {
    public static void main(String[] args){

        //push() to add data on top of stack
        //pop() to remove data from top of stack


        Stack<String> stack = new Stack<>();

       // System.out.println(stack.isEmpty()); //returns true as stack is empty

        stack.push("The Last Of US");
        stack.push("God of War");
        stack.push("Elden Ring");
        stack.push("Call of Duty");

        // stack.pop(); // removes the top content of the stack i.e. Call of Duty

       // String newGame = stack.pop();

        // we can use peek to see the content stored in the top of the stack
       // System.out.println(stack.peek());

        System.out.println(stack.search("God of War"));

        System.out.println(stack);

    }

}
