package com.company;

public class Powiesc extends Ksiazka{
    boolean czyLekturaSzkolna;

    public Powiesc(String tytul, String autor, int rokWydania, int iloscStron, boolean czyLekturaSzkolna) {
        super(tytul, autor, rokWydania, iloscStron);
        this.czyLekturaSzkolna = czyLekturaSzkolna;
    }

    @Override
    public void opis() {
        super.opis();
        if(this.czyLekturaSzkolna){
            System.out.println(this.tytul + " jest lekturą szkolną");
        }else{
            System.out.println(this.tytul + " nie jest lekturą szkolną");
        }
    }
}
