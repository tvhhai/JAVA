package com.company.java.collection;

public class ComparableDemo {

    public static void main(String[] args) {
        Student s1 = new Student("Adam", 45);
        Student s2 = new Student("Steve", 60);
        int result = s1.compareTo(s2);

        switch(result) {
            case -1: {
                System.out.println("The " + s2.getName() + " is older!");
                break;
            }

            case 1: {
                System.out.println("The " + s1.getName() + " is older!");
                break;
            }

            default:
                System.out.println("The two students are of the same age!");

        }
    }



}

