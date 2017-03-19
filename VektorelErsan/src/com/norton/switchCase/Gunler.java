package com.norton.switchCase;

import java.util.Scanner;

public class Gunler {

	public static void main(String[] args) {
		
		Scanner oku = new Scanner (System.in);
		
		int veri;
		
		veri= oku.nextInt();
		
		switch (veri) {
		case 1:
			System.out.println("Pazartesi");
		case 2:
			System.out.println("Salý");
		case 3:
			System.out.println("Çarþamba");
		case 4:
			System.out.println("Perþembe");
		case 5:
			System.out.println("Cuma");
		default:
			System.out.println("Geçersiz Veri");
			
		}
		
		
	}
	
}
