package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Instancje obiektów
        Punkt pkt = new Punkt(4,4);
        Punkt pkt1 = new Punkt(1,2);
        Prostokat p = new Prostokat(1,2, "Czerwony");
        Trojkat t = new Trojkat(1,2, "Niebiesko");
        Okrag o = new Okrag(pkt, 9);//Nie przekazuje koloru - domyślne będzie "biały" - patrz klasa figura
        Kwadrat k = new Kwadrat(4, "Lekko biały");

        //Wywołanie metod
        pkt.opis();
        pkt.przesun(3,4);
        pkt.opis();

        System.out.println(p.opis());
        System.out.println(t.opis());
        System.out.println(o.opis());
        System.out.println(k.opis());

        o.wSrodku(pkt1);
    }
}
