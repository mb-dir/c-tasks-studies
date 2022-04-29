package com.company;

public class Ksiazka {
    String tytul, autor;
    int rokWydania, iloscStron;

    public Ksiazka(String tytul, String autor, int rokWydania, int iloscStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.iloscStron = iloscStron;
    }

    public void opis(){
        System.out.println("Tytuł: " + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Została wydana w: " + this.rokWydania + " roku");
        System.out.println("Ma " + this.iloscStron + " stron");
    }
}
