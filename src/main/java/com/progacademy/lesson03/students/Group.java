package com.progacademy.lesson03.students;

import java.util.Arrays;

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

    public Student[] sortByStudentLastName() {
        int numberOfStudents = 0;
        for (Student student : students) {
            if (student != null) numberOfStudents++;
        }

        String[] lastNames = new String[numberOfStudents];
        for (int i = 0, j = 0; i < students.length; i++) {
            if (students[i] != null) {
                lastNames[j] = students[i].getLastName();
                j++;
            }
        }
        Arrays.sort(lastNames);
        Student[] sortedStudents = new Student[students.length];
        for (int i = 0; i < lastNames.length; i++) {
            try {
                sortedStudents[i] = searchStudentByLastName(lastNames[i]);
            } catch (StudentNotFoundException e) {
                e.printStackTrace();
            }
        }
        return sortedStudents;
    }

    @Override
    public String toString() {
        String result = "Group name: " + getGroupName() + "\n";
        Student[] sortedStudents = sortByStudentLastName();
        for (Student student : sortedStudents) {
            if (student != null) result += student + "\n";
        }
        return result;
    }
}
