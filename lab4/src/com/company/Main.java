package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        System.out.println("Zad1");
        zad1();
        System.out.println("Zad2");
        zad2();
        System.out.println("Zad3");
        zad3();
    }

    public static void zad1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc elementów w tablicy: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Podaj wartosc");
            arr[i] = in.nextInt();
        }
        System.out.println();
        double suma = 0;
        double srednia = 0;

        //przy pomocy zwykłego for'a
//        for(int i = 0; i < n; i++){
//            suma+=arr[i];
//        }
        //przy pomocy forEach
        for (int el:arr) {
            suma+=el;
        }
        srednia = suma/n;

        System.out.println("Suma: " + suma);
        System.out.println("Srednia: " + srednia);
    }

    public static void zad2(){
        boolean [] tab = new boolean[20];

        for(int i = 0 ; i < 20; i++){
            if(i%2 == 0) {
                tab[i] = true;
            }else{
                tab[i] = false;
            }
        }

        int i = 1;
        for (boolean el: tab) {
            System.out.print(el+" ");
            if(i % 5 ==0){
                System.out.println();
            }
            i++;
        }
    }
    public static void zad3(){
        double []arr = {1.2, 4.0, 5.6, 12.2, 0.01};//len = 5

        double suma = 0;
        for (double el: arr) {
            suma+=el;
        }
        double srednia = suma/5;

        double sumaKwadratowRoznicy = 0;

        for(int i = 0; i < 5; i++){
            double a = arr[i] - srednia;
            double aSquare = a*a;

            sumaKwadratowRoznicy += aSquare;
        }

        double s = sumaKwadratowRoznicy/(4);//4=5-1

        System.out.println(s);
    }
}
