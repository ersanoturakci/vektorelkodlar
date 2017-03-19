package com.norton.Fonksiyon;

import java.util.Scanner;

public class FonksiyonOyun {
	public static void main(String[] args) {

		int orjinalCevap = soruSor1();
		int yarismacininCevabi = CevapAl();

		if((soruSor1()== CevapAl())){
			
		}
	}

	private static int CevapAl() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static int soruSor1() {
		int a=5;
		System.out.println(a + "'in karesi nedir?");
		return (int) Math.pow(a, 2);
	}

}
