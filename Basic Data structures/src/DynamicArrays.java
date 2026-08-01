public class DynamicArrays {

    int size;
    int capacity = 10;
    Object[] array;

    DynamicArrays(){
        this.array = new Object[capacity];
    }

    DynamicArrays(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }



}
