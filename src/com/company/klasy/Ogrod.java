package com.company.klasy;

public class Ogrod {
    int drzewa;
    static String trawa = "wysoka";

    void zasadzDrzewa() {
        this.drzewa++;
    }

    static void zetnijTrawe() {
        if (!trawa.equals("niska"))
        trawa = "niska";
    }
}
