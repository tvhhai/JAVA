package com.company.java.array;

import java.util.Arrays;

public class JavaArray {
    public static void main (String[] args) {
        //demo of declaration and instantiation of an array
        declareAndInstantiate();
        System.out.println("------------------------------------------------------------");
        //demo of declaration and instantiation of an array
        arrayLiteral();
        System.out.println("------------------------------------------------------------");
        insertInArray();
        System.out.println("------------------------------------------------------------");
        removeItemFromArray();
        System.out.println("------------------------------------------------------------");
    }

    private static void declareAndInstantiate() {
        // DECLARE an Array of integers.
        int[] arr;
        // INSTANTIATE - allocating memory for 5 integers.
        arr = new int[5];
        // assign value to the first elements of the array
        arr[0] = 10;
        // assign value to the second elements of the array
        arr[1] = 20;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
    }

    private static void arrayLiteral() {
        int[]   intArray1 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[]   intArray2 = { 1,2,3,4,5,6,7,8,9,10 };
        String[] stringArray = {"one", "two", "three"};

        // accessing the elements of the specified array
        for (int i = 0; i < intArray1.length; i++) {
            System.out.println("Element at index " + i + " : " + intArray1[i]);
        }
    }

    private static void insertInArray() {
        int[] ints   = new int[20];
        for(int i=0; i < ints.length; i++){
            ints[i] = i;
        }

        System.out.println("Original array: " + Arrays.toString(ints));

        int insertIndex = 0;
        int newValue    = 999;
        //move elements below insertion point.
        for(int i=ints.length-1; i > insertIndex; i--){
            ints[i] = ints[i-1];
        }
        //insert new value
        ints[insertIndex] = newValue;
        System.out.println("Modified array: " +Arrays.toString(ints));
    }

    private static void removeItemFromArray() {
        int[] ints   = new int[20];
        for(int i=0; i < ints.length; i++){
            ints[i] = i;
        }

        System.out.println("Original array: " + Arrays.toString(ints));

        ints[10] = 123;
        int removeIndex = 10;
        for(int i = removeIndex; i < ints.length -1; i++){
            ints[i] = ints[i + 1];
        }
        System.out.println("Modified array: "+ Arrays.toString(ints));
    }
}
