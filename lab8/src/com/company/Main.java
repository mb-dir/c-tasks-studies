package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BlednaWartoscDlaSilniException, NieprawidlowyAdresException {
        Scanner in  = new Scanner(System.in);
        //zad1
        System.out.println("Podaj liczbe");
        try{
            int a = in.nextInt();
            if(a < 0){
                throw new IllegalArgumentException("Nie można obliczyć pierwiastka kwadratowego z liczby ujemnej w zbiorze R");
            }else{
                System.out.println(Math.sqrt(a));
            }
        }catch (InputMismatchException e){
            System.out.println("Nie podałeś liczby");
        }

        //zad2
        System.out.println(silnia(6));


        //zad3
        Adres adres = new Adres("null", "null", "12313", 0);
    }


    //zad2 - wymagana metoda
    public static int silnia(int n) throws BlednaWartoscDlaSilniException{
        if(n<0){
            throw new BlednaWartoscDlaSilniException("Silnia jest zdefiniowana dla n>=0");
        }
        if(n == 0){
            return 1;
        }else{
            return n*silnia(n-1);
        }
    }
}
