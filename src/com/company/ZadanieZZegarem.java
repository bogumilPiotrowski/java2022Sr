package com.company;

import java.text.DecimalFormat;
import java.util.*;

public class ZadanieZZegarem {

    static HashSet<String> arrayList = new HashSet<>();

    public static void rozwiaz() {
        Random r = new Random();
        int a = r.nextInt(10000);
//        int a = 2340;

        String pattern="0000";
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        System.out.println(myFormatter.format(a));
        findMax(myFormatter.format(a));


    }

    private static void findMax(String a) {
        findPermutations(a);
        ArrayList<String> b = new ArrayList<>(arrayList.stream().filter(s -> validate(s)).toList());
        if (b.size() == 0){
            System.out.println("Nie można ułożyć");
            return;
        }
        System.out.println();
        b.sort(String::compareTo);
        System.out.println("Wynik " + b.get(b.size() - 1));
    }


    static boolean validate(String a) {
        ArrayList<Integer> tab = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            tab.add(Integer.parseInt(String.valueOf(a.charAt(i))));
        }
        if (tab.get(0) > 2 || tab.get(0) < 0)
            return false;
        if (tab.get(0) == 2 && tab.get(1) > 3)
            return false;
        if (Integer.parseInt(a.substring(2,4)) > 60) {
            return false;
        }

        return true;
    }

    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            if (validate(String.valueOf(chars))) {
                arrayList.add(String.valueOf(chars));
            }

        }

        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void findPermutations(String str) {

        if (str == null || str.length() == 0) {
            return;
        }

        permutations(str.toCharArray(), 0);
    }

}
