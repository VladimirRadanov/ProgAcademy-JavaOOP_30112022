package com.progacademy.lesson04.students;

import java.util.Scanner;

public class StudentScanner {
    private final Scanner scanner = new Scanner(System.in);
    private String name;
    private String lastName;
    private HumanGenderEnum genderEnum;
    private int id;
    private String groupName;

    public StudentScanner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HumanGenderEnum getGenderEnum() {
        return genderEnum;
    }

    public void setGenderEnum(String gender) {
        if (gender.equals("MALE")) this.genderEnum = HumanGenderEnum.MALE;
        if (gender.equals("FEMALE")) this.genderEnum = HumanGenderEnum.FEMALE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student getStudentFromConsoleInput() {

        System.out.println("Enter Student's Name and press Enter: ");
        setName(scanner.nextLine());

        System.out.println("Enter Student's Last Name and press Enter: ");
        setLastName(scanner.nextLine());

        System.out.println("Enter Student's gender(MALE or FEMALE) and press Enter: ");
        setGenderEnum(scanner.nextLine());

        System.out.println("Enter Student's ID and press Enter: ");
        setId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter Student's Group Name and press Enter: ");
        setGroupName(scanner.nextLine());


        return new Student(getName(), getLastName(), getGenderEnum(), getId(), getGroupName());
    }

    @Override
    public String toString() {
        return "StudentScanner{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", genderEnum=" + genderEnum +
                ", id=" + id +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
