package com.matamatikClasslar;

import java.util.Scanner;

public class ClassDikDortGen {

	int a, b, sonuc;

	Scanner scanner = new Scanner(System.in);

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int alanHesapla() {

		sonuc = (int) (Math.sqrt(Math.pow(getA(), 2) * Math.pow(getB(), 2)));
		System.out.println(sonuc);
		return sonuc;

	}

}
