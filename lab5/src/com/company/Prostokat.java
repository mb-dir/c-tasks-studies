package com.company;

public class Prostokat {
    int dl;
    int szerokosc;

    public Prostokat(int dl, int szerokosc) {
        this.dl = dl;
        this.szerokosc = szerokosc;
    }

    public void pole(){
        int pole = this.dl * this.szerokosc;
        System.out.println("Pole: " + pole);
    }
    public void obw(){
        int obw = this.dl + this.szerokosc;
        System.out.println("Obw: " + obw);
    }
    public void dlPrzek(){
        double dlPrzek = Math.sqrt(this.dl*this.dl + this.szerokosc*this.szerokosc);
        System.out.println("Dł orzekatnej: " + dlPrzek);
    }
}