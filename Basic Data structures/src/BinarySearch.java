import java.util.Arrays;

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

        int index = Arrays.binarySearch(array, target);

        if(index == -1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element found at index: " + index);
        }


    }
}
