public class LinearSearch {
    public static void main(String[] args){

        // Linear Search  = we iterate through a collection one element at a time
        // Runtime complexity is Big O(n) which is linear time
        /*
        Disadvantages:
            - It is slow for large data sets

        Advantages
            - It is fast for searches in small to medium data sets
            - Does not need to be sorted.
            - Useful for data structure that do not have random access such as LinkedList.
         */

        // linear search demonstration using an array

        int[] numbers = {5,10,25,30,45,50,65,67};

        int index = linearSearch(numbers, 68);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found.");
        }

    }

    private static int linearSearch(int[] array, int value){

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return  -1;
    }
}
