package com.company.java.collection;

public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "";
    }

    @Override
    public int compareTo(Student s) {
        System.out.println(this.age+" "+ s.age);
        if(this.age == s.age)
            return 0;
        else
            return this.age > s.age ? 1 : -1;
    }
}