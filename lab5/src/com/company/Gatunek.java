package com.company;

public class Gatunek {
    String nazwaRodzaju;
    String nazwaGatunku;
    int podstawowaLiczbaChromosomow;
    int liczbaChromosomow;
    String opis;

    public Gatunek(String nazwaRodzaju, String nazwaGatunku, int podstawowaLiczbaChromosomow, String opis) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunku = nazwaGatunku;
        this.podstawowaLiczbaChromosomow = podstawowaLiczbaChromosomow;
        this.liczbaChromosomow = podstawowaLiczbaChromosomow*2;
        this.opis = opis;
    }

    public void Info(){
        System.out.println("Nazwa rodzaju: " + this.nazwaRodzaju);
        System.out.println("Nazwa gatunku: " + this.nazwaGatunku);
        System.out.println("Podstawowa liczba chromosomow: " + this.podstawowaLiczbaChromosomow);
        System.out.println("Liczba chromosomow: " + this.liczbaChromosomow);
        System.out.println("Opis: " + this.opis);
    }

    public Gatunek klon(){
        Gatunek klon = new Gatunek(this.nazwaRodzaju, this.nazwaGatunku, this.podstawowaLiczbaChromosomow, this.opis);

        System.out.println("Proces klonowania zakończony");

        return klon;
    }
}
