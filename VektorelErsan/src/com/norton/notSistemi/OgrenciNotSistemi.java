package com.norton.notSistemi;

import java.util.Scanner;

public class OgrenciNotSistemi {

	public static void main(String[] args) {
	
		//int ogrenciNotu=80;
		
		String deger = "vektorel";
		String ikinciIfade="iki";
		
		Scanner girisYap = new Scanner(System.in);
		int ogrenciNotu = girisYap.nextInt();
		
		if (deger != null && deger.equals("vektorel"))
		System.out.println(deger);
		
		if (ikinciIfade.equals("ikinci ifadeyi yaz"))
			System.out.println(ikinciIfade);
			
			
		//burada sadece 80 ve üzerine AA ver diyoruz.
		if (ogrenciNotu>80 & ogrenciNotu<=100) {
			System.out.println("AA");
		}
		
		// Burada 70 ve üzerine BB ver diyoruz. 
		
		if (ogrenciNotu <= 80 & ogrenciNotu >70) {
			System.out.println("BB");
		}
		
		//Burada 50 veya altý için CC ver diyoruz.
		if (ogrenciNotu <= 50) {
			System.out.println("FF");
		}
		
		
		
		
		
		
		
 	}

}
