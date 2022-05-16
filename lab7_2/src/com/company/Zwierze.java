package com.company;

public abstract class Zwierze implements Plywanie, Latanie{
    String nazwa;

    public Zwierze(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void plyn() {
        System.out.println(this.nazwa + " płynie");
    }

    @Override
    public void wynurz() {
        System.out.println(this.nazwa + " wynurza sie");
    }

    @Override
    public void zanurz() {
        System.out.println(this.nazwa + " zanurza sie");
    }

    @Override
    public void lec() {
        System.out.println(this.nazwa + " leci");
    }

    @Override
    public void wyladuj() {
        System.out.println(this.nazwa + " lądje");
    }
}
