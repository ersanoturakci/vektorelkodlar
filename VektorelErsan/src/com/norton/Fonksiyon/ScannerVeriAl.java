package com.norton.Fonksiyon;

import java.util.Scanner;

public class ScannerVeriAl {

	public static void main(String[] args) {

		int veri = scannerVeriAl();
		yonlendirici(veri);

	}

	public static int scannerVeriAl() {
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		return sayi;
	}

	public static void yonlendirici(int veri) {

		if (tekMi(veri)) {
			System.out.println("tek");
		} else if (ciftMi(veri)) {
			System.out.println("çift");
		}

	}

	public static boolean tekMi(int veri) {
		if (veri % 2 == 1)
			return true;
		return false;
	}

	public static boolean ciftMi(int veri) {
		if (veri % 2 == 0)
			return true;
		return false;
	}

}
