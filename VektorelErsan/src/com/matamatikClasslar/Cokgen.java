package com.matamatikClasslar;

public class Cokgen {
	
	int kenar;
	int[] array;
	
	public Cokgen(int birinciKenar, int ikinciKenar, int ucuncuKenar, int dorduncuKenar){
		
		array= new int [4];
		
		array[0]=birinciKenar;
		array[1]=ikinciKenar;
		array[2]=ucuncuKenar;
		array[3]=dorduncuKenar;
		
		for (int i =0;i<array.length;i++){
			System.out.println("Dörtlü Array : " + i);
		}
		
	}
	
	public Cokgen(int birinciKenar, int ikinciKenar, int ucuncuKenar, int dorduncuKenar, int besinciKenar){
		
		array= new int [5];
		
		array[0]=birinciKenar;
		array[1]=ikinciKenar;
		array[2]=ucuncuKenar;
		array[3]=dorduncuKenar;
		array[4]=dorduncuKenar;
		for (int i =0;i<array.length;i++){
			System.out.println("Beþli Array : " + i);
		}
	}
	
	public int cevreHesapla(){
		
		for (int i =0;i<array.length;i++){
			System.out.println("Beþli Array : " + i);
		int sonuc=array[i]+sonuc;
		
		
		//System.out.println("Beþli Array : " + sonuc);

	
	}
	}
