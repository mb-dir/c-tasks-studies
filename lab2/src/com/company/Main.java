package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    //zad1
        zad1();
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
}
