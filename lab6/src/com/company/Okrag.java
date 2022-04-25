package com.company;


public class Okrag extends Figura{
    Punkt srodek;
    double r;

    public Okrag() {
        this.srodek = new Punkt(0,0);
        this.r = 0;
    }

    public Okrag(Punkt srodek, double r) {
        this.srodek = srodek;
        this.r = r;
    }

    public Okrag(Punkt srodek, double r, String kolor) {
        super(kolor);
        this.srodek = srodek;
        this.r = r;
    }

    public double getPowierzchnia(){
        return this.r * this.r * Math.PI;
    }

    public double getSrednica(){
        return this.r * 2;
    }

    public double getPromien(){
        return this.r;
    }

    public void setPromien(double r) {
        this.r = r;
    }

    public void wSrodku(Punkt p){
        double a = srodek.getX();
        double b = srodek.getY();

        double x = p.getX();
        double y = p.getY();

        if((x-a)*(x-a) + (y-b)*(y-b) <= this.r*this.r){
            System.out.println("Punkt należy do okręgu");
        }else{
            System.out.println("Punkt nie należy do okręgu");
        }
    }

    @Override
    String opis() {
        return "Klasa Okrąg. Kolor obiektu: "+super.getKolor();
    }
}
