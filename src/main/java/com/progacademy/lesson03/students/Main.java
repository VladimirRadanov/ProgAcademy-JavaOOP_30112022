package com.progacademy.lesson03.students;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pete1", "Pupkin", HumanGenderEnum.MALE, 0, "group1");
        Student student2 = new Student("Pete2", "Pupkin2", HumanGenderEnum.MALE, 1, "group1");
        Student student3 = new Student("Mary", "Sokolova", HumanGenderEnum.FEMALE, 2, "group1");
        Student student4 = new Student("Mary2", "Sokolova2", HumanGenderEnum.FEMALE, 3, "group1");
        Student student5 = new Student("Pete5", "Pupkin5", HumanGenderEnum.MALE, 4, "group1");
        Student student6 = new Student("Pete6", "Pupkin6", HumanGenderEnum.MALE, 5, "group1");
        Student student7 = new Student("Pete7", "Pupkin7", HumanGenderEnum.MALE, 6, "group1");
        Student student8 = new Student("Pete8", "Pupkin8", HumanGenderEnum.MALE, 7, "group1");
        Student student9 = new Student("Pete9", "Pupkin9", HumanGenderEnum.MALE, 8, "group1");
        Student student10 = new Student("Pete10", "Pupkin10", HumanGenderEnum.MALE, 9, "group1");
        Student student11 = new Student("Pete11", "Pupkin11", HumanGenderEnum.MALE, 10, "group1");

        Group group = new Group("group01");
        try {
            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student4);
            group.addStudent(student5);
            group.addStudent(student6);
            group.addStudent(student7);
            group.addStudent(student8);
            group.addStudent(student9);
            group.addStudent(student10);
//        group.addStudent(student11);
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }

        System.out.println(group);

        try {
            System.out.println(group.searchStudentByLastName("Pupkin"));
//            System.out.println(group.searchStudentByLastName("Pupkin20"));
        } catch (StudentNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(group.removeStudentByID(0));
        System.out.println(group.removeStudentByID(20));

        System.out.println(group);

    }
}
