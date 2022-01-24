package com.company.collection.comparator;

import com.company.collection.comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Quy Nhon"));
        listStudents.add(new Student(2, "Hoa", 19, "Ha Noi"));
        listStudents.add(new Student(3, "Phu", 20, "Da Nang"));
        listStudents.add(new Student(4, "Quy", 22, "Binh Dinh"));
        // sort list student
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        });
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
