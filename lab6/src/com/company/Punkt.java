package com.company;

public class Punkt {
    public double x;
    public double y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj(){
        this.x = 0;
        this.y = 0;
    }

    public void opis(){
        System.out.println("x: " + x + ", y: " + y);
    }

    public void przesun(int x, int y){
        this.x +=x;
        this.y +=y;
    }
}
