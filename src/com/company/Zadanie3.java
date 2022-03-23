package com.company;

import java.util.Scanner;

public class Zadanie3 {
    public static void rozwiaz() {
        String a = new Scanner(System.in).nextLine().replaceAll("\\s+","").toLowerCase();
        System.out.println(new StringBuilder(a).reverse().toString().toLowerCase().equals(a));
    }
}
