package com.progacademy.lesson05.task02_Students_GroupFileStorage;

import java.io.*;

public class GroupFileStorage {
    private static File fileStorageFolder = new File("src/main/java/com/progacademy/lesson05/task02_Students_GroupFileStorage/fileStorage/");

    public static void saveGroupToCSV(Group gr) throws IOException {
        gr.sortStudentsByLastName();
        CSVStringConverter csvStringConverter = new CSVStringConverter();
        File file = new File(fileStorageFolder, gr.getGroupName() + ".csv");

        Student[] students = gr.getStudents();

//        Group header
        /*try (Writer writer = new FileWriter(file)) {
            writer.write("Name,\tLast Name,\tGender,\tID,\tGroup\n");
        } catch (IOException e) {
            throw e;
        }*/
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Name,\tLast Name,\tGender,\tID,\tGroup\n");
        } catch (IOException e) {
            throw e;
        }

//        Students of the Group
        /*for (Student student : students) {
            try (Writer writer = new FileWriter(file, true)) {
                if (student != null) {
                    writer.append(csvStringConverter.toStringRepresentation(student));
                    writer.append(System.lineSeparator());
                }
            } catch (IOException e) {
                throw e;
            }
        }*/
        for (Student student: students) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){
                if (student != null){
                    bufferedWriter.append(csvStringConverter.toStringRepresentation(student) + "\n");
                }
            } catch (IOException e) {
                throw e;
            }
        }
    }

    public static Group loadGroupFromCSV(File file) throws IOException {
        CSVStringConverter csvStringConverter = new CSVStringConverter();
//        String result = "";
        String[] result = new String[10];
        Student[] students = new Student[10];
        Group group = new Group(file.getName().substring(0, file.getName().lastIndexOf(".")));

        /*try (Reader reader = new FileReader(file)) {
            char[] chars = new char[1000];
            int readChars = 0;
            for (; ; ) {
                readChars = reader.read(chars);
                if (readChars <= 0) {
                    break;
                }
                result += new String(chars, 0, readChars);
            }
        } catch (IOException e) {
            throw e;
        }*/
//        String[] strings = result.split("\n");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            for (int i = 0; i < result.length; i++) {
                result[i] = bufferedReader.readLine();
                if (result[i] == null) break;
            }
        } catch (IOException e) {
            throw e;
        }

        for (int i = 1; i < result.length; i++) {
            if (result[i] == null) break;
            students[i - 1] = csvStringConverter.fromStringRepresentation(result[i]);
        }

        for (Student student : students) {
            if (student != null) {
                try {
                    group.addStudent(student);
                } catch (GroupOverflowException e) {
                    e.printStackTrace();
                }
            }
        }

        return group;
    }

    public static File findFileByGroupName(String groupName, File workFolder) throws FileNotFoundException {
        if (!workFolder.exists() || !workFolder.isDirectory()) throw new FileNotFoundException("Folder not found");
        File[] files = workFolder.listFiles();
        for (File file : files) {
            if (file.isFile() && groupName.equals(file.getName().substring(0, file.getName().lastIndexOf("."))))
                return file;
        }
        throw new FileNotFoundException("File not found");
    }
}
