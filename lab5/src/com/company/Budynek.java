package com.company;

public class Budynek {
    String nazwa;
    int rokBudowy;
    int ilePieter;

    int obecnyRok = 2022;

    public Budynek(String nazwa, int rokBudowy, int ilePieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.ilePieter = ilePieter;
    }

    public void Info(){
        System.out.println("Nazwa: " + this.nazwa);
        System.out.println("Rok budowy: " + this.rokBudowy);
        System.out.println("Ilość pięter: " + this.ilePieter);
    }

    public void Wiek(){
        System.out.println("Wiek: " + (obecnyRok - this.rokBudowy));
    }
}