package com.progacademy.lesson05.task01_CopyFileByExtension;

import java.io.File;
import java.io.FileFilter;

public class FileExtensionFilter implements FileFilter {
    private String fileExtension;

    public FileExtensionFilter(String fileExtention) {
        this.fileExtension = fileExtention;
    }

    @Override
    public boolean accept(File file) {
        if (file.getName().endsWith(fileExtension)) return true;
        return false;
    }
}
