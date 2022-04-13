package com.company.klasy;
;
public class Dom {
    int oknaDuze;
    int oknaMale;
    static double szerokosc;
    static double dlugosc;

    int sumujOkna() {
        return this.oknaDuze + this.oknaMale;
    }

    static double powiezchnia() {
        return szerokosc*dlugosc;
    }

}
