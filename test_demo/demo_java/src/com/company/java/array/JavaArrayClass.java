package com.company.java.array;

import java.util.Arrays;
import java.util.Comparator;

public class JavaArrayClass {
    public static void main (String[] args) {
        //demo of copying array by iterating
        copyByIterating();
        System.out.println("------------------------------------------------------------");
        //demo of copying array by using copy method of Array class
        copyUsingCopyMethodOfArrayClass();
        System.out.println("------------------------------------------------------------");
        sortArray();
        System.out.println("------------------------------------------------------------");
        sortArrayOfObjects();
        System.out.println("------------------------------------------------------------");
    }

    private static void copyByIterating() {
        int[] source = new int[10];
        for(int i=0; i < source.length; i++) {
            source[i] = i;
        }
        System.out.println("Source array: " + Arrays.toString(source));

        int[] dest   = new int[10];
        for(int i=0; i < source.length; i++) {
            dest[i] = source[i];
        }
        System.out.println("Dest array: " + Arrays.toString(dest));
    }

    private static void copyUsingCopyMethodOfArrayClass() {
        int[] source = new int[10];
        for(int i=0; i < source.length; i++) {
            source[i] = i;
        }
        System.out.println("Source array: " + Arrays.toString(source));

        int[] dest = Arrays.copyOf(source, source.length);
        System.out.println("Dest array: " + Arrays.toString(dest));
    }

    private static void sortArray() {
        int[]   ints = new int[10];
        for(int i=0; i < ints.length; i++){
            ints[i] = 10 - i;
        }
        System.out.println(java.util.Arrays.toString(ints));
        java.util.Arrays.sort(ints);
        System.out.println(java.util.Arrays.toString(ints));
    }

    private static void sortArrayOfObjects() {
        Person[] peopleArray = new Person[3];
        peopleArray[0] = new Person("Quoc", 1);
        peopleArray[1] = new Person("Hieu"  , 3);
        peopleArray[2] = new Person("Vu"  , 2);

        System.out.println("Sorted by name");
        java.util.Arrays.sort(peopleArray, new Comparator<Person>() {
            @Override
            public int compare(Person e1, Person e2) {
                return e1.name.compareTo(e2.name);
            }
        });

        for(int i=0; i < peopleArray.length; i++) {
            System.out.println(peopleArray[i].name + adjustSpace(peopleArray[i].name) + peopleArray[i].id);
        }

        System.out.println("Sorted by id");
        java.util.Arrays.sort(peopleArray, new Comparator<Person>() {
            @Override
            public int compare(Person e1, Person e2) {
                return e1.id - e2.id;
            }
        });

        for(int i=0; i < peopleArray.length; i++) {
            System.out.println(peopleArray[i].name + adjustSpace(peopleArray[i].name) + peopleArray[i].id);
        }
    }

    private static String adjustSpace(String s) {
        char[] spaces = new char[] {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        int numOfSpaces = spaces.length - s.length();
        return new String(Arrays.copyOfRange(spaces, 0, numOfSpaces));
    }


    private static class Person {
        public String name;
        public int    id;

        public Person(String name, int id){
            this.name       = name;
            this.id = id;
        }
    }
}
