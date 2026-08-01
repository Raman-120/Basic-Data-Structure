public class DynamicArraysDemo {
    public static void main(String[] args){

        DynamicArrays dynamicArrays = new DynamicArrays(5);

        dynamicArrays.add("Guitar");
        dynamicArrays.add(4);

//        dynamicArrays.insert(1, 3.6);
//        dynamicArrays.delete("Guitar");

//        System.out.println(dynamicArrays.isEmpty());
//        System.out.println(dynamicArrays.size);
        System.out.println(dynamicArrays.capacity);
       // System.out.println(dynamicArrays.search("Guitar"));
        System.out.println(dynamicArrays);


    }
}
