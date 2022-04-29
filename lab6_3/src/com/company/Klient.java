package com.company;

public class Klient {
    int id;
    String imie, nazwisko;

    public Klient(int id, String imie, String nazwisko) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void klientInfo(){
        System.out.println(this.imie + " " + this.nazwisko);
        System.out.println("Moje id: " + this.id);
    }
}
