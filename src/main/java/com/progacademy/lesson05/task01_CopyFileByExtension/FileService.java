package com.progacademy.lesson05.task01_CopyFileByExtension;

import java.io.*;

public class FileService {

    public static long copyFile(File fileIn, File fileOut) throws IOException {
        try (InputStream is = new FileInputStream(fileIn);
             OutputStream os = new FileOutputStream(fileOut);) {
            return is.transferTo(os);
        }
    }

    public static int copyFilesFromFolder(File dirIn, File dirOut) throws IOException {
        File[] files = dirIn.listFiles();
        int copiedFiles = 0;
        for (File file : files) {
            if (file.isFile()) {
                copyFile(file, new File(dirOut, file.getName()));
                copiedFiles++;
            }
        }
        return copiedFiles;
    }

    public static int copyFilesFromFolder(File dirIn, File dirOut, String extension) throws IOException{
        File[] files = dirIn.listFiles(new FileExtensionFilter(extension));
        int copiedFiles = 0;
        for (File file: files){
            if (file.isFile()) {
            copyFile(file, new File(dirOut, file.getName()));
            copiedFiles++;
            }
        }
        return copiedFiles;
    }

}
