package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class ZadanieZPlikami {

    public static void rozwiaz()  {

        try {
            PrintWriter zapis = new PrintWriter("nowy_plik.txt");
            zapis.println("Ala ma kota, a kot ma Alę");
            zapis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("nowy_plik.txt");

        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
