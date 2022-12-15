package com.progacademy.lesson05.task01_CopyFileByExtension;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File inputDir = new File("src/main/java/com/progacademy/lesson05/task01_CopyFileByExtention/inputDir");
        File outputDir = new File("src/main/java/com/progacademy/lesson05/task01_CopyFileByExtention/outputDir");

        try {
            System.out.println("Number of files copied: " +
                    FileService.copyFilesFromFolder(inputDir, outputDir, "txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
