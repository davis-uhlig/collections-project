package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/26/17.
 */
public class Teacher extends SchoolStudentsAndFaculty{
    private int id;

    public Teacher(){

    }

    public Teacher(String firstName, String lastName, int grade) {
        super(firstName, lastName, grade);
        this.id = SchoolStudentsAndFaculty.id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;

        return getId() == teacher.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
