package com.almanza.string.utils;

import com.almanza.string.utils.coder.Coder;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class StringUtilsApp {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto:");
        String text = scanner.nextLine();

        Coder coder = new Coder();

        String textEncoded = coder.encodeWithCharArray(text);
        System.out.println("El texto codificado es: " + textEncoded);

        String textDecoded = coder.decodeWithCharArray(textEncoded);
        System.out.println("El texto decodificado es: " + textDecoded);

        textEncoded = coder.encodeWithStream(text);
        System.out.println("El texto codificado es: " + textEncoded);

        textDecoded = coder.decodeWithStream(textEncoded);
        System.out.println("El texto decodificado es: " + textDecoded);
    }
}
