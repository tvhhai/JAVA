package generic;

public class GenericDemo {
    public static void main(String[] args) {
        //generic method demo
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        GenericMethod.printArray(intArray);   // pass an Integer array
        System.out.println("\nArray characterArray contains:");
        GenericMethod.printArray(charArray);   // pass a Character array


        //bounded type demo
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, BoundedType.maximum( 3, 4, 5 ));
        System.out.printf("Max of %s, %s and %s is %s\n","pear", "apple", "orange", BoundedType.maximum("pear", "apple", "orange"));

        //generic class demo
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}
