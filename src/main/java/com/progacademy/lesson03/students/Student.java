package com.progacademy.lesson03.students;

public class Student extends Human{
    int id;
    String groupName;

    public Student(String name, String lastName, HumanGenderEnum genderEnum, int id, String groupName) {
        super(name, lastName, genderEnum);
        this.id = id;
        this.groupName = groupName;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                "} "
                + super.toString();
    }
}
