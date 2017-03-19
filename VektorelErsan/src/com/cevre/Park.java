package com.cevre;

public class Park {

	int agacSayisi;
	String parkIsmi;
	
	
	public void setIsmi(String ismi) {
		this.parkIsmi = "15 Temmuz " + ismi;
	}
	
	public void setAgacSayisi(int agacSayisi) {
		this.agacSayisi = agacSayisi/2;
	}
	
	public String getparkIsmi() {
		return this.parkIsmi;
	}
	
	public int getAgacSayisi() {
		return this.agacSayisi;
	}
	
	
}
