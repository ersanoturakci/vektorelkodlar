package com.norton.switchCase;

import java.util.Scanner;

public class StringSwithcCase {

	public static void main(String[] args) {
		
			
		
		Scanner oku = new Scanner(System.in);
		
		String barkod= oku.nextLine();
		int veri2= oku.nextInt();
		
		switch (barkod + "-" + veri2) {
		case "java-2017" :System.out.println("Java 20 Geldi");
			break;
		case "java-2016" :System.out.println("Java 19 Geldi");
			break;
		case "java-2015" :System.out.println("Java 18 Geldi");
			break;
		default:
		System.out.println("Hiç Olmadý");
		break;
		}
		
//		Scanner oku= new Scanner(System.in);
//		
//		int a= oku.nextInt();
//		int b= oku.nextInt();
//		
//		double sonuc= (b!=0)?(a*b):(b/a);
//		System.out.println(sonuc);
		
		
		
	}
}
