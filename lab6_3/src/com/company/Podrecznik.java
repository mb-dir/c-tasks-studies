package com.company;

public class Podrecznik extends Ksiazka{
    String doJakiegoPrzedmiotu;
    int doKtorejKlasy;

    public Podrecznik(String tytul, String autor, int rokWydania, int iloscStron, String doJakiegoPrzedmiotu, int doKtorejKlasy) {
        super(tytul, autor, rokWydania, iloscStron);
        this.doJakiegoPrzedmiotu = doJakiegoPrzedmiotu;
        this.doKtorejKlasy = doKtorejKlasy;
    }

    @Override
    public void opis() {
        super.opis();
        System.out.println("Podręcznik do: " + this.doJakiegoPrzedmiotu);
        System.out.println("Podręcznik do: " + this.doKtorejKlasy + " klasy");
    }
}
