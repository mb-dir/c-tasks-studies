package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
    }
}
