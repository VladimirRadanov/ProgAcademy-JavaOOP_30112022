package com.progacademy.lesson04.students;

public class Main {
    public static void main(String[] args) {

        StudentScanner studentScanner = new StudentScanner();
        Student student = studentScanner.getStudentFromConsoleInput();

        Group group = new Group("group01");
        try {
            group.addStudent(student);
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }
        System.out.println(group);

        CSVStringConverter csvStringConverter = new CSVStringConverter();
        String csvString = csvStringConverter.toStringRepresentation(student);
        System.out.println("Student to CSV result: " + csvString);

        Student studentFromCsv = csvStringConverter.fromStringRepresentation(csvString);
        System.out.println("CSV to Student result: " + studentFromCsv);
    }
}
