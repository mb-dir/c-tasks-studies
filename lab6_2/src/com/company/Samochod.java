package com.company;

public class Samochod {
    public String marka, model, nadwozie, kolor = "";
    public int rokProdukjci, przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukjci, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukjci = rokProdukjci;
        this.przebieg = przebieg;
        if(this.przebieg < 0){
            System.out.println("Prebieg nie może być ujemny, ustawiam domyślną wartość 0");
            this.przebieg = 0;
        }
    }

    public Samochod(String marka, String model, String kolor, int rokProdukjci) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rokProdukjci = rokProdukjci;
        this.krotkiOpis(this.marka, this.model, this.kolor, this.rokProdukjci);
    }

    //Poniższa metoda tyczy się następującej części zadania "Dodatkowo w klasie Samochod przeciąż konstruktor w taki sposób, bywartości pól były parametrami metody"
    //modyfikator private został tutaj użyty specjalne, ponieważ jak rozumiem ta metoda musi być wywołana w wewnątrz klasy - nie moze
    //być wywołana z poziomu obiektu
    private void krotkiOpis(String marka, String model, String kolor, int rokProdukjci){
        System.out.println(kolor + " " + marka + " " + model + " został wyprodukowany w " + rokProdukjci + " roku");
    }

    public void opis(){
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Nadwozie: " + this.nadwozie);
        System.out.println("Kolor: " + this.kolor);
        System.out.println("Rok produkcji: " + this.rokProdukjci);
        System.out.println("Przebieg: " + this.przebieg);
    }
}
