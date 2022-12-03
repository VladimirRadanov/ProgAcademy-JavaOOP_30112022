package com.progacademy.lesson02.task02_TextTransformer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TextTransformer textTransformer = new TextTransformer();
        InverseTransformer inverseTransformer = new InverseTransformer();
        UpDownTransformer upDownTransformer = new UpDownTransformer();

        String text = "transform text";

        System.out.println("Transform test:\t" + textTransformer.transform(text));
        System.out.println("Inverse test:\t" + inverseTransformer.transform(text));
        System.out.println("UpDown test:\t" + upDownTransformer.transform(text));


        new TextSaver(new TextTransformer()).saveTextToFile(text);
        new TextSaver(new InverseTransformer()).saveTextToFile(text);
        new TextSaver(new UpDownTransformer()).saveTextToFile(text);

    }
}
