package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Punkt pkt = new Punkt(4,4);
        Punkt pkt1 = new Punkt(1,2);

        Prostokat p = new Prostokat(1,2);
        System.out.println(p.getPowierzchnia());

        Okrag o = new Okrag(pkt, 9);
        o.wSrodku(pkt1);
    }
}
