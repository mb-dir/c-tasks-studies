package com.company;

class Trojkat extends Figura
{
	double wys=0, podst=0;

	Trojkat(double wys, double podst) {
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(double wys, double podst, String kolor) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}

	@Override
	String opis() {
		return "Klasa Trójkąt. Kolor obiektu: "+super.getKolor();
	}
	
}