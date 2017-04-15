package com.kalitim.ulasim;

public class Islem {

	
	public static void main(String[] args) {
		
	OtoYol otoyol =new OtoYol();
	otoyol.hizSiniri();
	otoyol.setIsim("Ankara yolu");
	otoyol.setSeritSayisi(4);
	otoyol.setTipi("Otoban");

	KoyYol koyyol= new KoyYol();
	koyyol.setIsim("Lalahan");
	koyyol.setSeritSayisi(2);
	koyyol.setTipi("KoyYolu");
	koyyol.hizSiniri();
	
	System.out.println(otoyol.getIsim());
	System.out.println(otoyol.getSeritSayisi());
	System.out.println(otoyol.getTipi());
	
	System.out.println(koyyol.getIsim());
	System.out.println(koyyol.getSeritSayisi());
	System.out.println(koyyol.getTipi());
	
	int[] array=new int[3];
	
	array[0]=100;
	array[1]=100;
	array[2]=100;
	
	
	int sonuc = koyyol.yolHesapla(array);
	System.out.println(sonuc);
	
	int sonuc2 = otoyol.yolHesapla(array);
	System.out.println(sonuc2);
	
	}
}
