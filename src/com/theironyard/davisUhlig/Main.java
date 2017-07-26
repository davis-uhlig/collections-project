package com.theironyard.davisUhlig;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            Student firstGrader = new Student("first name" + i, "last name" + i, 1);
            students.add(firstGrader);
        }
        for (int i = 0; i < 3; i++){
            Teacher firstGradeTeacher = new Teacher("first name" + i, "last name" + i, 1);
            teachers.add(firstGradeTeacher);
        }
        System.out.println(students);
        System.out.println(teachers);

        Map<Teacher, Set<Student>> teacherClass = new HashMap<>();
        for (int i = 0; i < 3; i++){
            Set<Student> studentsInClass = new HashSet<>();
            for (int j = 0; j < 5; j++){
                studentsInClass.add(students.get((i*5) + j));

            }
            teacherClass.put(teachers.get(i), studentsInClass);

        }
        System.out.println("---------------");
        System.out.println("Teachers");
        System.out.println("---------------");
        for (Teacher teacher : teacherClass.keySet()){
            System.out.println(teacher);
        }
        System.out.println();
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Students in class");
        System.out.println("-------------------");
        for (Set student : teacherClass.values()){
            System.out.println(student);
        }

    }

}
