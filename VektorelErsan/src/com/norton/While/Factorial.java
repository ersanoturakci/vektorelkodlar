package com.norton.While;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner oku= new Scanner (System.in);
		
	int sinirDeger= oku.nextInt();
	int sayac=1, sonuc=1;
			

	
		while (sayac<=sinirDeger){
			sonuc=sonuc*sayac;
			
			sayac++;
			
			}
			System.out.println(sonuc);
		
	}

}
