package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //zad1
        zad1();

        //zad2
        double a,b;
        System.out.println("Podaj a i b");
        a=in.nextInt();
        b=in.nextInt();
        zad2(a,b);

        //zad3
        if(zad3(2)){
            System.out.println("Parzysta");
        }else{
            System.out.println("Nieparzysta");
        }

        //zad4
        if(zad4(15)){
            System.out.println("Dzieli sie przez 3 i 5");
        }else{
            System.out.println("Nir dzieli sie przez 3 i 5");
        }

        //zad5
        System.out.println(zad5(3));

        //zad6
        System.out.println(zad6(9));

        //zad7
        int x,y,z;
        System.out.println("Podaj długości odcinków");

        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();

        zad7(x,y,z);

    }

    //zad 1
    public static void zad1(){
        System.out.println("Michał, 19");
    }
    //zad2
    public static void zad2(double a, double b) {
        double suma = a+b;
        double roznica = a-b;
        double iloczyn = a*b;
        double iloraz = a/b;

        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);
    }
    //zad3
    public static boolean zad3(int a){
        if(a % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    //zad4
    public static boolean zad4(int a){
        if(a%15 == 0){
            return true;
        }else {
            return false;
        }
    }
    //zad5
    public static int zad5(int a){
        return a*a*a;
    }

    //zad6
    public static double zad6(int a){
        return Math.sqrt(a);
    }
    //zad7
    public static void zad7(int a, int b, int c){
        if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a){
            System.out.println("Można zbudować trójkąt prostokątny");
        }else{
            System.out.println("Nie można zbudować trójkąta prostokątnego");
        }
    }
}
