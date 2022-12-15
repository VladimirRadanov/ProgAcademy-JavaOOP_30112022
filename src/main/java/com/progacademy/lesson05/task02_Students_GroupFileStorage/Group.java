package com.progacademy.lesson05.task02_Students_GroupFileStorage;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private String groupName;
    private final Student[] students;

    public Group(String groupName) {
        this.students = new Student[10];
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        throw new GroupOverflowException("No places available in group");
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getLastName().equals(lastName)) return students[i];
            }
        }
        throw new StudentNotFoundException("No student found with provided Last Name");
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public void sortStudentsByLastName(){
        Arrays.sort(students, Comparator.nullsLast(new StudentLastNameComparator()));
    }

    @Override
    public String toString() {
        String result = "Group name: " + getGroupName() + "\n";
        sortStudentsByLastName();
        for (Student student : students) {
            if (student != null) result += student + "\n";
        }
        return result;
    }
}
