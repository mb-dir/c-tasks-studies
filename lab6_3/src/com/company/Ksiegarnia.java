package com.company;

public class Ksiegarnia {

    //Kompozycja - obiekt w obiekcie
    Klient[] Klienci = {new Klient(1,"Adam", "Rek"), new Klient(2,"Paweł", "Rek"), new Klient(231,"Mateusz", "Kuker")};
    int iloscKsiazek, godzinaOtwarcia, godzinaZamkniecia;

    public Ksiegarnia(int iloscKsiazek, int godzinaOtwarcia, int godzinaZamkniecia) {
        this.iloscKsiazek = iloscKsiazek;
        this.godzinaOtwarcia = godzinaOtwarcia;
        this.godzinaZamkniecia = godzinaZamkniecia;
        this.Klienci = Klienci;
    }

    public void opis(){
        System.out.println("Biblioteka jest otwarta od " + this.godzinaOtwarcia + " do " + this.godzinaZamkniecia);
        System.out.println("Lista klientów: ");

        for (Klient k: Klienci) {
            k.klientInfo();
            System.out.println();
        }
    }
}
