package com.matematik;

public class Islem {

	public static void main(String[] args) {

		Topla topla2Veri=new Topla(1,2);
		Topla topla3Veri=new Topla(1,2,3);
		
		int[] array= new int[3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		
		int[] array2= new int[3];
		array2[0]=1;
		array2[1]=2;
		array2[2]=3;
		
		Topla toplaArray= new Topla(array);
		Topla toplaIkiArray= new Topla(array, array2);

		System.out.println(topla2Veri.getSonuc());
		System.out.println(topla3Veri.getSonuc());
		System.out.println(toplaArray.getSonuc());
		System.out.println(toplaIkiArray.getSonuc());

	}

}
