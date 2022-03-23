package com.company;

import java.util.Scanner;

public class Zadanie1 {
    public static void rozwiaz() {
        String a = new Scanner(System.in).nextLine();
        System.out.println(a.chars().filter(value -> value == a.charAt(a.length()-1)).count());
    }
}
