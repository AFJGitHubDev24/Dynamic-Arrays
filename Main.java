public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        /*
            System.out.println(dynamicArray.get(0));
            dynamicArray.insert(0, "X");
            dynamicArray.delete("B");
            System.out.println(dynamicArray.search("A"));
            System.out.println(dynamicArray.search("B"));
        */

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

    }
}
