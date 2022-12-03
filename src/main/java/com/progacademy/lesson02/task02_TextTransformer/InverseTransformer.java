package com.progacademy.lesson02.task02_TextTransformer;

public class InverseTransformer extends TextTransformer {

    @Override
    public String transform(String string) {

        this.setString(new StringBuilder()
                .append(string)
                .reverse()
                .toString());

        return this.getString();
    }
}
