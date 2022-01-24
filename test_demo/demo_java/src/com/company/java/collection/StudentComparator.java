package com.company.java.collection;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAge()== s2.getAge())
            return 0;
        else
            return s1.getAge() > s2.getAge() ? 1 : -1;
    }
}