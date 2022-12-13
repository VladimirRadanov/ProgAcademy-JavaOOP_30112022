package com.progacademy.lesson04.students;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (
                ((Student) o1).getLastName().compareTo(
                ((Student) o2).getLastName()) > 0) return 1;
        if (
                ((Student) o1).getLastName().compareTo(
                ((Student) o2).getLastName()) < 0) return -1;
        return 0;
    }
}
