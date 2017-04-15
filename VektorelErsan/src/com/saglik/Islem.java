package com.saglik;

public class Islem {

	public static void main(String[] args) {
		
		Doktor doktor=new Doktor();
		doktor.setName("Ersan");
		doktor.setTC(10);
		
		Hemsire hemsire=new Hemsire();
		hemsire.setName("Mehmet");
		hemsire.setTC(20);
		
		
		Hastane hastane=new Hastane();
		
		hastane.ameliyat(doktor);
		System.out.println("-----------------------------------");
		hastane.ameliyat(doktor, hemsire);
		
		
		
		
	}

	
}
