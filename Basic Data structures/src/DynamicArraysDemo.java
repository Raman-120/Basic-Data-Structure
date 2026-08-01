public class DynamicArraysDemo {
    public static void main(String[] args){

        DynamicArrays dynamicArrays = new DynamicArrays();

        dynamicArrays.add("Guitar");
        dynamicArrays.add(4);
        dynamicArrays.add(true);

        dynamicArrays.insert(0, 3.6);

//        System.out.println(dynamicArrays.isEmpty());
//        System.out.println(dynamicArrays.size);
//        System.out.println(dynamicArrays.capacity);
        System.out.println(dynamicArrays);


    }
}
