package com.company;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Zadanie4 {
    public static void rozwiaz() {
        char[] arr = new Scanner(System.in).nextLine().toCharArray();
        int sum = 0;
        for (char x : arr) if (Character.isDigit(x)) sum += Character.getNumericValue(x);
        System.out.println(sum);
    }
}
//Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi.