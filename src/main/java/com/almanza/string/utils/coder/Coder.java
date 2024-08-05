package com.almanza.string.utils.coder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Coder {

    public String encodeWithCharArray(String text) {
        char[] textToCharArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(textToCharArray[i])) {
                if (textToCharArray[i] == 'A' || textToCharArray[i] == 'a') {
                    textToCharArray[i] = (char) (textToCharArray[i] + 25);
                } else {
                    textToCharArray[i] = (char) (textToCharArray[i] - 1);
                }
            }
        }

        return new String(textToCharArray);
    }

    public String decodeWithCharArray(String text) {
        char[] textToCharArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(textToCharArray[i])) {
                if (textToCharArray[i] == 'Z' || textToCharArray[i] == 'z') {
                    textToCharArray[i] -= 25;
                } else {
                    textToCharArray[i] += 1;
                }
            }
        }

        return new String(textToCharArray);
    }

    public String encodeWithStream(String text) {
        List<String> stringList = Arrays.stream(text.split(" ")).toList();

         return stringList.stream().map(t -> {
            for (char c : t.toCharArray()) {
                if (c == 'A' || c == 'a') {
                    t = t.replace(c, (char) (c + 25));
                } else {
                    t = t.replace(c, (char) (c - 1));
                }
            }
            return t;
        }).collect(Collectors.joining(" "));
    }

    public String decodeWithStream(String text) {
        List<String> stringList = Arrays.stream(text.split(" ")).toList();

        return stringList.stream().map(t -> {
            for (char c : t.toCharArray()) {
                if (c == 'Z' || c == 'z') {
                    t = t.replace(c, (char) (c - 25));
                } else {
                    t = t.replace(c, (char) (c + 1));
                }
            }
            return t;
        }).collect(Collectors.joining(" "));
    }
}
