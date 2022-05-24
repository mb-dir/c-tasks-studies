package com.company;

import java.util.InputMismatchException;

public class Adres {
    String ulica, miasto, kodPocztowy;
    int numerDomu;

    public Adres(String ulica, String miasto, String kodPocztowy, int numerDomu) throws NieprawidlowyAdresException {
        this.ulica = ulica;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.numerDomu = numerDomu;

        if(this.ulica == null){
            throw new NieprawidlowyAdresException("Ulica nie może być nulem");
        }
        if(this.miasto == null){
            throw new NieprawidlowyAdresException("Misto nie może być nulem");
        }
        if(this.kodPocztowy == null){
            throw new NieprawidlowyAdresException("Kod pocztowy nie może być nulem");
        }
        if(this.numerDomu <= 0){
            throw new NieprawidlowyAdresException("Numer domu musi być większy od 0");
        }
    }
}