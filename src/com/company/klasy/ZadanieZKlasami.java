package com.company.klasy;

public class ZadanieZKlasami {
    public static void rozwiaz() {
        Dom dom1 = new Dom();
        dom1.oknaMale = 3;
        dom1.oknaDuze = 5;
        Dom.dlugosc = 5;
        Dom.szerokosc = 7;
        System.out.println(dom1.sumujOkna());
        System.out.println(Dom.powiezchnia());

        Ogrod ogrod = new Ogrod();
        ogrod.drzewa = 6;
        System.out.println(ogrod.drzewa);
        System.out.println(Ogrod.trawa);
        Ogrod.zetnijTrawe();
        System.out.println(Ogrod.trawa);

    }
}
