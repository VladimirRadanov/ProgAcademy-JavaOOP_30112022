package com.progacademy.lesson04.students;

public class CSVStringConverter implements StringConverter {

    private String string;
    private final Student student = new Student();

    public CSVStringConverter() {
    }

    @Override
    public String toStringRepresentation(Student student) {
        return this.string =
                student.getName() + ", " +
                student.getLastName() + ", " +
                student.getGender() + ", " +
                student.getId() + ", " +
                student.getGroupName();
    }

    @Override
    public Student fromStringRepresentation(String str) {
        String[] strings = str.split(", ");

        student.setName(strings[0].trim());
        student.setLastName(strings[1].trim());
        student.setGender(strings[2].trim());
        student.setId(Integer.parseInt(strings[3].trim()));
        student.setGroupName(strings[4].trim());

        return student;
    }
}
