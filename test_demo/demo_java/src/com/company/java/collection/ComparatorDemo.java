package com.company.java.collection;

public class ComparatorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Student A", 20);
        Student s2 = new Student("Student B", 19);
        StudentComparator sComparator = new StudentComparator();
        int result = sComparator.compare(s1, s2);
        switch(result) {
            case -1:
                System.out.println("The " + s2.getName() + " is older!");
                break;
            case 1:
                System.out.println("The " + s1.getName() + " is older!");
                break;
            default:
                System.out.println("The two students are of the same age!");
        }
    }
}
