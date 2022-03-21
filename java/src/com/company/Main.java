package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc elementów w tablicy");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Wczytaj element: ");
            arr[i] = in.nextInt();
        }

        int newArr[] = multiple(arr);
        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }

    public static int[] multiple(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = 2*a[i];
        }
        return a;
    }

}
