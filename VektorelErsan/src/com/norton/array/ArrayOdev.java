package com.norton.array;

import java.util.Scanner;

public class ArrayOdev {

	public static void main(String[] args) {

		double[] girilenVeri = doubleAl();
		String veri = stringeDonustur(girilenVeri);
		System.out.println(veri);
	}

	public static double[] doubleAl() {
		Scanner scanner = new Scanner(System.in);

		double[] arrayDouble = new double[3];
		for (int i = 0; i < arrayDouble.length; i++) {
			arrayDouble[i] = scanner.nextDouble();
		}
		return arrayDouble;

	}
	public static String stringeDonustur(double[] girilenVeri) {
		String s = "";
		for (int i = 0; i < girilenVeri.length; i++) {

			s = s + girilenVeri[i] + "-";

		}
		return s;

	}



}
