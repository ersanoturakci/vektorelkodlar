package com.norton.Fonksiyon;

import java.util.Scanner;

public class FonksyonSekilveToplama {

	public static void main(String[] args) {

		
		Scanner oku= new Scanner (System.in);
		
		int sayi= oku.nextInt();
		int a= 	faktoriyel(sayi);	
		System.out.println("Dýþarda" + a);
		
//		enbuyuk(5,15);
	//int a= 	asalsayi(sonuc);
	}
//		toplama(5,6);
//		ekranaSekilBas(5);
//		cikarma(88, 5);
//		}
//		
//		static void ekranaSekilBas(int yildiz){
//		
//			for(int i = 0; i<yildiz; i++){
//			System.out.print("*");
//			}
//		System.out.println(" ");
//			}
//				
//			static void toplama(int a, int b){
//			int sonuc=a+b;
//			System.out.println(sonuc);
//			}
//			
//			static void cikarma(int a, int b){
//			int sonuc=a-b;
//			System.out.println(sonuc);
//			}
//
//			
//			
			public static int faktoriyel(int sayi){
				int sonuc=1;
				for(int i=1 ; i<sayi ; i++){
				sonuc+=i*sonuc;
				}
				System.out.println("farktoryel" + sonuc);
				System.out.println("Ýçerde" + sonuc);
				return sonuc;
				
			}
			
			
			
//			public static void enbuyuk(int a, int b){
//				if (a<b)
//				{
//				System.out.println(b);
//				}
//				else { 	System.out.println("en büyük:" + a);
//				}
//					
//				}

			public static int asalsayi(int sonuc){
			boolean control=true;
			for(int i=2;i<sonuc;i++){
				if (sonuc%i==0){
					System.out.println(sonuc + "Asaldýr");
					control=false;
					break;
					}
				
			}
			if (control)
				System.out.println(sonuc + "deðildir");
			
			return sonuc;
			
			}

			
}
