package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Samochod s = new Samochod("Opel", "Astra", "Szybkie", "Szybki", 1221, -2222);
        s.opis();

        System.out.println();

        Samochod s1 = new Samochod("Opel", "Astra", "Czarny", 1992);

        System.out.println();

        SamochodOsobowy so = new SamochodOsobowy("Opel", "Corsa", "Szybkie", "Szybki", 1221, 12121, 3.0, 1.0, 6);
        so.opis();
    }
}
