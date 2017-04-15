package com.spor;

public class Islem {

	public static void main(String[] args) {

		Spor sporBasketbol=new Spor();
		sporBasketbol.setTuru("Basketbol");
		
		Spor sporFutbol=new Spor();
		sporFutbol.setTuru("Futbol");
		
		Spor sporTenis=new Spor();
		sporTenis.setTuru("Tenis");
		
		Spor sporHokey=new Spor();
		sporHokey.setTuru("Hokey");
		
		
		Spor[] array=new Spor[4];
		
		array[0]=sporBasketbol;
		array[1]=sporFutbol;
		array[2]=sporHokey;
		array[3]=sporTenis;
	
		ekranaYazdir(array);
	
	
	}
	
	public static void ekranaYazdir(Spor[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i].getTuru());	
		}
	}
	
	

}
