package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	    //zad1
        zad1();

        //zad2
        zad2();

        //zad3
        System.out.println("Podaj trzy liczby");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        zad3(a,b,c);

        //zad6
        zad6('+');
    }
    public static void zad1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a,b,c(a!=0)");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if(a != 0){
            double delta = (b*b) - 4*a*c;
            if(delta > 0){
                double pierwiastekDelta = Math.sqrt(delta);
                double x1 = (-b - pierwiastekDelta)/2*a;
                double x2 = (-b + pierwiastekDelta)/2*a;

                System.out.println("Dwa rozwiązania: " + x1 + " oraz " + x2);
            }else if(delta == 0){
                double x = -b/2*a;
                System.out.println("Jedno rozwiązanie: " + x);
            }else{
                System.out.println("Brak rozwiązań rzeczywistych");
            }
        }else{
            System.out.println("Błędne dane");
        }
    }

    public static void zad2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj argument");

        double a = in.nextInt();

        System.out.println("a: ");
        if(a > 0){
            System.out.println(2*a);
        }else if(a < 0){
            System.out.println(-3*a);
        }else{
            System.out.println(0);
        }

        System.out.println("b: ");

        if(a >= 1){
            System.out.println(a*a);
        }else{
            System.out.println(a);
        }

        System.out.println("c: ");

        if(a > 2){
            System.out.println(2+a);
        }else if(a < 2){
            System.out.println(a-4);
        }else{
            System.out.println(8);
        }
    }

    public static void zad3(int a, int b, int c){
        for(int i = 0; i < 3; i++){
            if(a > b){
                int x = a;
                a=b;
                b=x;
            }
            if(b > c){
                int x = b;
                b=c;
                c=x;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }

    public static void zad6(char dzialanie){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int a = in.nextInt();
        int b = in.nextInt();

        if(dzialanie == '+'){
            System.out.println("Wybrałeś dodawanie: " + (a+b));
        }else if (dzialanie == '-'){
            System.out.println("Wybrałeś odejmowanie: " + (a-b));
        }
        else if (dzialanie == '/'){
            System.out.println("Wybrałeś dzielenie: " + (a/b));
        }else if (dzialanie == '*'){
            System.out.println("Wybrałeś mnożenie: " + (a*b));
        }
        else if (dzialanie == '%'){
            System.out.println("Wybrałeś modulo: " + (a%b));
        }else{
            System.out.println("Błędne działanie");
        }
    }
}
