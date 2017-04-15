package com.saglik;

public class Hastane {

	public void ameliyat(Doktor doktor, Hemsire hemsire) {
		
		System.out.println(doktor.getName());
		System.out.println(doktor.getTC());
		System.out.println(hemsire.getName());
		System.out.println(hemsire.getTC());
		
	}
	
	
	public void ameliyat(Doktor doktor){
		System.out.println(doktor.getName());
		System.out.println(doktor.getTC());
	}
	
	
	
}
