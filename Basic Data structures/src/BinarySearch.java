import java.util.Arrays;
import java.lang.Math;

public class BinarySearch {
    public static void main(String[] args){

        // Binary Search in java
        // It is a search algorithm that finds the position of a targeted value within a sorted array or collections.
        // Half of the array or collection is eliminated or disregarded during each step.
        // Generally useful for large datasets and time complexity is O(log n) as it becomes more efficient as the
                                                                             //  grows even larger and larger
        int[] array = new int[100];
        int target = 45;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
//
//        int index = Arrays.binarySearch(array, target);
//
//        if(index == -1){
//            System.out.println("Element not found.");
//        }
//        else{
//            System.out.println("Element found at index: " + index);
//        }


        // This code snippet is to understand how binary search works


        int index = binarySearch(array, target);

        if(index == -1){
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + index);
        }

    }

    private static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle  = low + (high - low) / 2;
            int value = array[middle];

            System.out.println(value); // this is optional, you can see the steps and the value you will get
            // during bisection.
            if(value < target){
                low = middle +1;
            }
            else if(value > target){
                high = middle - 1;
            }
            else {
                return  middle; // target found.
            }
        }

        return -1;
    }
}
