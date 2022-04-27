package com.company.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad2 {

    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo)  {

        File file = new File(nazwaPlikWe);

        try {
            Scanner myReader = new Scanner(file);
            PrintWriter zapis = new PrintWriter(nazwaPlikWy);
            for (int i = 0;myReader.hasNextLine(); i++) {
                String data = myReader.nextLine();
                System.out.println(data);
                if(data.contains(slowo)) {
                    zapis.println((i+1) + ": " + data);
                }
            }
            myReader.close();
            zapis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
