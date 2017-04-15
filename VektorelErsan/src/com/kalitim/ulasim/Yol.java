package com.kalitim.ulasim;

public class Yol {

	String isim;
	String tipi;
	int seritSayisi;
	
	
	public void hizSiniri(){
		System.out.println("Yol Max:80 ");
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public String getTipi() {
		return tipi;
	}


	public void setTipi(String tipi) {
		this.tipi = tipi;
	}


	public int getSeritSayisi() {
		return seritSayisi;
	}


	public void setSeritSayisi(int seritSayisi) {
		this.seritSayisi = seritSayisi;
	}
	
	public int yolHesapla(int[] array) {

		int sonuc = 0;
		for (int i = 0; i < array.length; i++) {
			sonuc = sonuc + array[i];
		}
		return sonuc;
	}
	
}
