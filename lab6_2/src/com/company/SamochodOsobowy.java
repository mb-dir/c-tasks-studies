package com.company;

public class SamochodOsobowy extends Samochod{
    double waga, pojemnoscSilnika;
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukjci, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukjci, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    @Override
    public void opis() {
        System.out.println("Marka: " + super.marka);
        System.out.println("Model: " + super.model);
        System.out.println("Nadwozie: " + super.nadwozie);
        System.out.println("Kolor: " + super.kolor);
        System.out.println("Rok produkcji: " + super.rokProdukjci);
        System.out.println("Przebieg: " + super.przebieg);
        System.out.println("Waga: " + this.waga + " t");
        System.out.println("Pojemnosc silnika: " + this.pojemnoscSilnika+" l");
        System.out.println("Maksymalna ilosc osób: " + this.iloscOsob);
    }
}
