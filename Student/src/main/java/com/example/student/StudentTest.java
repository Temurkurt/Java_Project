package com.example.student;

import java.util.ArrayList;

public class StudentTest {


    public static void main(String[] args) {

        ArrayList<Student> Students = new ArrayList<Student>();
        Students.add(new Student("Bedirhan", 145236, 95));
        Students.add(new Student("Seyfi", 587489, 35));
        Students.add(new Student("Suleiman", 896574, 88));
        Students.add(new Student("Mummy", 156848, 65));
        Students.add(new Student("Karam", 365412, 45));
        Students.add(new Student("Sevban", 896541, 77));
        Students.add(new Student("Ubade", 896523, 41));
        Students.add(new Student("Kublai", 985412, 56));
        Students.add(new Student("Server", 985412, 99));
        Students.add(new Student("Omar", 654123, 100));

        for (Student student: Students) {
            System.out.println(student);
            System.out.println("     ");
        }

    }
}