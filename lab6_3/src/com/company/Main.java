package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Tworzenie przykładowych obiektów
        Ksiazka k = new Ksiazka("Kadlilak", "Karol", 1992, 78);
        Powiesc p = new Powiesc("Lalka", "Nie wiem", 1231, 999, true);
        Podrecznik podr = new Podrecznik("Bliżej świata", "Wsip", 2002, 876, "WF", 5);
        Ksiegarnia ksiegarnia = new Ksiegarnia(2137, 9, 19);

        //Przykład na rzutowanie
        //Książka nie jest referencją Powieści
        if(k instanceof Powiesc){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
        //Książka zrzutowana na powieść jest referencją Powieści
        Ksiazka k1 = (Powiesc) p;
        if(k1 instanceof Powiesc){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
        System.out.println();

        //Sprawdzenie działania części aplikacji powiązanej z klasą Książka i jej pochodnymi
        p.opis();

        System.out.println();

        //Działanie księgarni
        ksiegarnia.opis();
    }
}
