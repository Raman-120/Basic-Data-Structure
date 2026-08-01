public class DynamicArrays {

    int size; // it shows array size
    int capacity = 10; // it shows arrays capacity
    Object[] array;

    DynamicArrays(){
        this.array = new Object[capacity];
    }

    DynamicArrays(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // common used methods
    public void add(Object object){
        if(size >= capacity){
            grow();
        }
        array[size] = object;
        size++;
    }

    public void insert(int index, Object object){
        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i-1]; // [i-1] shifts all elements over to the right to make room for insertion.
        }
        array[index] = object;
        size++;
    }

    public void delete(Object object){

    }

    public int search(){
        return 1;
    }

    public void grow(){

    }

    public void shrink(){

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String string = "";
        for(int i = 0; i < size; i++){
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() -2) + "]";
        }
        else{
            string = "[]";
        }

        return string;
    }

}
