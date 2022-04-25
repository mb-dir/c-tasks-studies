package com.company;

public class Kwadrat extends Prostokat{
    double bokKwadratu;

    public Kwadrat(double bokKwadratu, String kolor) {
        super(bokKwadratu, bokKwadratu, kolor);
        this.bokKwadratu = bokKwadratu;
    }

    public double getBokKwadratu() {
        return bokKwadratu;
    }

    public void setBokKwadratu(float bokKwadratu) {
        this.bokKwadratu = bokKwadratu;
    }

    @Override
    String opis() {
        return "Klasa Kwadrat. Kolor obiektu: "+super.getKolor();
    }

}
