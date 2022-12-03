package com.progacademy.lesson02.task02_TextTransformer;

import java.io.*;

public class TextSaver {

    private TextTransformer textTransformer;
    private final File file = new File("src/main/java/com/progacademy/lesson02/task02_TextTransformer/text.txt");

    public TextSaver(TextTransformer textTransformer) {
        this.textTransformer = textTransformer;
    }

    void saveTextToFile(String text) throws IOException {

        if (!file.exists()) file.createNewFile();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsolutePath(),true));
                bufferedWriter.append(this.textTransformer.transform(text));
                bufferedWriter.newLine();
                bufferedWriter.close();

    }
}
