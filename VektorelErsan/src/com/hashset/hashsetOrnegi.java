package com.hashset;

import java.util.HashSet;

public class hashsetOrnegi {

	public static void main(String[] args) {

		HashSet<String> myArray = new HashSet<>();

		myArray.add("Matamatik");
		myArray.add("Fizik");
		myArray.add("Tarih");
		myArray.add("T�rk�e");

		System.out.println(myArray);

		if (myArray.remove("Fizik")) {
			System.out.println("silindi");
			System.out.println(myArray);

			if (myArray.add("Matamatik")) {
				System.out.println("eklendi");
			}

			if (myArray.add("Co�rafya")) {
				System.out.println("eklendi");
			}
			
			System.out.println(myArray);
		}

	}
}
