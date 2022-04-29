package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ksiazka k = new Ksiazka("Dupa", "Karol dupa", 1992, 78);
        Powiesc p = new Powiesc("Lalka", "Nie wiem", 1231, 999, true);
        Podrecznik podr = new Podrecznik("Bliżej świata", "Wsip", 2002, 876, "WF", 5);
        Ksiegarnia ksiegarnia = new Ksiegarnia(2137, 9, 19);

        ksiegarnia.opis();
    }
}
