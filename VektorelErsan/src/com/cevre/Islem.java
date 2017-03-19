package com.cevre;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {

		Scanner scanner= new Scanner (System.in);
		Park park = new Park();
		
		System.out.println("aðaç sayýsýný gir");
		park.setAgacSayisi(scanner.nextInt());
		
		System.out.println("park ismini gir");
		park.setIsmi(scanner.next());
		
		Park geziParki=new Park();
		System.out.println("aðaç sayýsýný gir");
		geziParki.setAgacSayisi(scanner.nextInt());
		
		System.out.println("park ismini gir");
		geziParki.setIsmi(scanner.next());
	
		System.out.println(park.getAgacSayisi());
		System.out.println(park.getparkIsmi());

		System.out.println(geziParki.getAgacSayisi());
		System.out.println(geziParki.getparkIsmi());
	}

}
