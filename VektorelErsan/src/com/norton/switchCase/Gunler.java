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
			System.out.println("Sal�");
		case 3:
			System.out.println("�ar�amba");
		case 4:
			System.out.println("Per�embe");
		case 5:
			System.out.println("Cuma");
		default:
			System.out.println("Ge�ersiz Veri");
			
		}
		
		
	}
	
}
