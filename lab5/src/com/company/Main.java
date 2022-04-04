package com.company;

public class Main {

    public static void main(String[] args) {

        Prostokat p1 = new Prostokat(4,3);
        p1.pole();
        p1.obw();
        p1.dlPrzek();

        System.out.println();

        Budynek b1 = new Budynek("Wieża wysoka", 1891, 91);
        b1.Info();
        b1.Wiek();

        System.out.println();

        Gatunek g1 = new Gatunek("Pies", "Zwierze", 12, "Ciekawy opis jakiś");

        g1.Info();
        g1.klon();
    }
}