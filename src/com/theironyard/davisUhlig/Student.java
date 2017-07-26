package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/26/17.
 */
public class Student extends SchoolStudentsAndFaculty {
    private int id;

    public Student(){

    }

    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName, grade);
        this.id = SchoolStudentsAndFaculty.id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
