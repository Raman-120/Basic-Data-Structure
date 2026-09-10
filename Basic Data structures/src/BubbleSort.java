public class BubbleSort {
    public static void main(String[] args){

        // Bubble sorting  is a sorting algorithm that compares a JSON elements and check to see if there is an
        // order, if not then elements are switched, then the next pair of JSON elements is compared and we
        // continue this pattern until all the elements are in order.

        // time complexity : O(n^2)
        // It is okayish for small data sets but,
        // It is horrible for large data sets


        int[] numbers = {5,6,7,8,9,4,3,2,1};

        bubbleSort(numbers);

        for(int i : numbers){
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array){

        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j <array.length - i -1; j++){
                // for ascending order
               // if(array[j] > array[j+1])

                // for descending order
                if(array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
