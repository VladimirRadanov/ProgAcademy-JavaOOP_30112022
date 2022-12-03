package com.progacademy.lesson02.task02_TextTransformer;

public class TextTransformer {

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String transform(String string){
        return this.string = string.toUpperCase();
    }

    @Override
    public String toString() {
        return this.getString();
    }
}
