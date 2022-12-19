package com.progacademy.lesson05.task02_Students_GroupFileStorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pete1", "Pupkin3", HumanGenderEnum.MALE, 0, "group1");
        Student student2 = new Student("Pete2", "Pupkin2", HumanGenderEnum.MALE, 1, "group1");
        Student student3 = new Student("Mary", "Sokolova5", HumanGenderEnum.FEMALE, 2, "group1");
        Student student4 = new Student("Mary2", "Sokolova2", HumanGenderEnum.FEMALE, 3, "group1");

        Group group01 = new Group("group01");
        Group group02 = new Group("group02");
        try {
            group01.addStudent(student1);
            group01.addStudent(student2);
            group01.addStudent(student3);
            group01.addStudent(student4);
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }

        try {
            group02.addStudent(student1);
            group02.addStudent(student2);
            group02.addStudent(student3);
            group02.addStudent(student4);
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }

        try {
//        Check file save
            System.out.println("Saving groups to CSV file...");
            GroupFileStorage.saveGroupToCSV(group01);
            GroupFileStorage.saveGroupToCSV(group02);

//        Check file loading
            System.out.println("\nLoading group from file:");
            System.out.println(
                    GroupFileStorage.loadGroupFromCSV(
                            new File("src/main/java/com/progacademy/lesson05/task02_Students_GroupFileStorage/fileStorage/group01.csv"))
            );

        } catch (IOException e) {
            e.printStackTrace();
        }

//        Check file search by group name
        System.out.println("Searching file for the group name:");
        try {
            System.out.println(
                    GroupFileStorage.findFileByGroupName("group02",
                                    new File("src/main/java/com/progacademy/lesson05/task02_Students_GroupFileStorage/fileStorage/"))
                            .getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
