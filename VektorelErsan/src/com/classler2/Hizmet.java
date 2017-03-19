package com.classler2;

import java.util.Scanner;

public class Hizmet {

	String hizmetIsmi;
	int hizmetId;

	void veriGir() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hizmetçi ID Gir: ");
		hizmetId = scanner.nextInt();
		System.out.print("Hizmetçi Ýsmi Gir: ");

		hizmetIsmi = scanner.next();
	}

	public void isimYazdir() {
		System.out.println("hizmetIsmi: " + hizmetIsmi);
		System.out.println("hizmetId: " + hizmetId);
		
	}

	String yeniIsim(){
		String yeniIsim= "verktorel - " + hizmetIsmi;
		return yeniIsim;
	}
	
}
