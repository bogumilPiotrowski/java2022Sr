package com.company.pliki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Zad1 {

    public static int[] liczZnakiSlowa()  {

        int[] wynik = new int[3];



        int chars = 0;
        int whitespaces = 0;
        int words = 0;
        Path filePath = Path.of("nowy_plik.txt");

        try {
            String content = Files.readString(filePath);
            whitespaces = content.split(" ").length;
            chars = content.toCharArray().length;
            words = content.trim().split("\\s+").length;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("znaki" + chars);
//        System.out.println("białe znaki" + whitespaces);
//        System.out.println("słowa" + words);
        return new int[]{chars, whitespaces, words};
    }
}
