package com.progacademy.lesson05.task02_Students_GroupFileStorage;

public class CSVStringConverter implements StringConverter {

    private String string;

    public CSVStringConverter() {
    }

    @Override
    public String toStringRepresentation(Student student) {
        return this.string =
                student.getName() + ",\t" +
                student.getLastName() + ",\t" +
                student.getGender() + ",\t" +
                student.getId() + ",\t" +
                student.getGroupName();
    }

    @Override
    public Student fromStringRepresentation(String str) {
        String[] strings = str.split(",\t");
        Student student = new Student();

        student.setName(strings[0].trim());
        student.setLastName(strings[1].trim());
        student.setGender(strings[2].trim());
        student.setId(Integer.parseInt(strings[3].trim()));
        student.setGroupName(strings[4].trim());
        return student;
    }
}
