package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //zad1
        int n;
        System.out.println("Podaj liczbe studentów");
        n=in.nextInt();
        zad1(n);

        //zad2
        zad2();
    }

    public static void zad1(int n){
        Scanner in = new Scanner(System.in);
        int i = 0;
        double s = 0;
        while(i<n){
            System.out.println("Podaj ilość pkt");
            int p = in.nextInt();
            s+=p;
            i++;
        }
        System.out.println("Srednia: " + (s/n));
    }

    public static void zad2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podan n");
        int n = in.nextInt();
        int ileD = 0;
        int ileU = 0;
        int sumaD = 0;
        int sumaU = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Podaj wyraz ciągu");
            int w = in.nextInt();
            if(w >= 0){
                ileD++;
                sumaD += w;
            }else{
                ileU++;
                sumaU+=w;
            }
        }
        System.out.println("Suma dodatnich: " + sumaD);
        System.out.println("Ilość dodatnich: " + ileD);
        System.out.println("Suma ujemnych: " + sumaU);
        System.out.println("Ilość ujemnych: " + ileU);
    }
}
