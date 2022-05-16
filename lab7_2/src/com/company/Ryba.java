package com.company;

public abstract class Ryba implements Plywanie{
    String nazwa;

    public Ryba(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void plyn() {
        System.out.println(this.nazwa + " plynie");
    }

    @Override
    public void wynurz() {
        System.out.println(this.nazwa + " wynurza sie");
    }

    @Override
    public void zanurz() {
        System.out.println(this.nazwa + " zanurza sie");
    }

    public void jedz(){
        System.out.println(this.nazwa + " je");
    }
    public void wydalaj(){
        System.out.println(this.nazwa + " wydala");
    }
}
