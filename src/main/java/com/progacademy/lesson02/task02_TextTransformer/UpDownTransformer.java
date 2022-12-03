package com.progacademy.lesson02.task02_TextTransformer;

public class UpDownTransformer extends TextTransformer {

    @Override
    public String transform(String string) {
        char[] charArray = string.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) stringBuilder.append(String.valueOf(charArray[i]).toUpperCase());
            else stringBuilder.append(String.valueOf(charArray[i]).toLowerCase());
        }

        this.setString(stringBuilder.toString());
        return this.getString();
    }

}
