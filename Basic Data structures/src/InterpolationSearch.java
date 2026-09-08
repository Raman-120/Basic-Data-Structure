public class InterpolationSearch {
    public static void main(String[] args){

        // interpolation search = These are improvement over binary search. It is best for uniformly distributed data.
        // Basically, we are making a guess where the value we are searching might be in a data set , based on
        //            calculated probe results.
        // If probe is incorrect, search area is narrowed , and a new probe is created, and we try again.

        // average time complexity case : O(log(log n))
        // worst time complexity case : O(n) [values increase exponentially]


        // let's try this on an array

        int[] numbers = {1,2,3,4,5,6,7,8,8,9};
        int[] bigNumbers = {2,4,8,16,32,64,128,256,512,1024}; // demonstration with large data values

        // int index = interpolationSearch(numbers, 7);
        int index = interpolationSearch(bigNumbers, 128);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found.");
        }

    }

    private static int interpolationSearch(int[] array, int value){

        int low = 0;
        int high = array.length -1;

        while(value >= array[low] && value <= array[high] && low <= high){

            // formula to calculate probe
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            // optional
            System.out.println("Probe: " + probe);

            if(array[probe] == value){
                return probe;
            }
            else if(array[probe] < value){
                    low = probe +1 ;
            }
            else {
                high = array[probe] -1;
            }
        }

        return -1;
    }
}
