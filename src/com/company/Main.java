package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a = new Scanner(System.in).nextLine();
        System.out.println(a.chars().filter(value -> value == a.charAt(a.length()-1)).count());
    }

}