package com.company;

class Prostokat extends Figura {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(double wys, double szer, String kolor) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	double getPowierzchnia() {
        return (szer * wys);
    }

	public void przesun(double x, double y){
		System.out.println("Przesuwam trójkąt o (" + x + ", " + y + ")");
	}

	@Override
	String opis() {
		return "Klasa Prostokąt. Kolor obiektu: "+super.getKolor();
	}
    
    
}