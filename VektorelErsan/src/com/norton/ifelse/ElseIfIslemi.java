package com.norton.ifelse;

import java.util.Scanner;

public class ElseIfIslemi {

	public static void main(String[] args) {
		
		int karAl, vergiDilimi ;
		double sonVergi;
		System.out.print("Kar Oranýný Giriniz:  ");

		Scanner oku=new Scanner(System.in);
		vergiDilimi = oku.nextInt();
		
		if(vergiDilimi >=1000){
			System.out.print("Yüksek Vergi");
		}else if(vergiDilimi >=500){
			System.out.print("Orta Vergi");
		}else if(vergiDilimi >0){
				System.out.print("Düþük Vergi");
		}else System.out.print("Yanlýþ giriþ yaptýnýz!!");
		
		System.out.print("Vergi Dilim Payý 1-10 arasý Giriniz:  ");
		
		Scanner oku2 = new Scanner(System.in);
		
		karAl= oku2.nextInt();
		sonVergi= vergiDilimi/karAl;
		
		System.out.println(sonVergi);
		
	}

}
