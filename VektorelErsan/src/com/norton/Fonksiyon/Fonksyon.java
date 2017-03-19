package com.norton.Fonksiyon;

import java.util.Scanner;

public class Fonksyon {

	public static void main (String[] arge){
		
		Scanner oku= new Scanner (System.in);
		
		System.out.print("Enter first number: " + "  " );  int a=oku.nextInt();
 
		System.out.print("Enter first number: " + "  " );  int b=oku.nextInt();
		
		carpmaislemi(a, b);
		hesapmakinasi(a,b);
		
		}
		
		static void hesapmakinasi(int a, int b){
			
		int sonuc=a+b;
			
		System.out.println("Toplama Ýþlemi" + sonuc);
									
		}
		
		
		static void carpmaislemi(int a , int b){
			
			int sonuc=a*b;
			System.out.println("Çarpma Ýþlemi" +sonuc);
		}
		
		
	}
	

