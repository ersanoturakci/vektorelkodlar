package com.norton.ifelse;

import java.util.Scanner;

public class ElseIfIslemi {

	public static void main(String[] args) {
		
		int karAl, vergiDilimi ;
		double sonVergi;
		System.out.print("Kar Oran�n� Giriniz:  ");

		Scanner oku=new Scanner(System.in);
		vergiDilimi = oku.nextInt();
		
		if(vergiDilimi >=1000){
			System.out.print("Y�ksek Vergi");
		}else if(vergiDilimi >=500){
			System.out.print("Orta Vergi");
		}else if(vergiDilimi >0){
				System.out.print("D���k Vergi");
		}else System.out.print("Yanl�� giri� yapt�n�z!!");
		
		System.out.print("Vergi Dilim Pay� 1-10 aras� Giriniz:  ");
		
		Scanner oku2 = new Scanner(System.in);
		
		karAl= oku2.nextInt();
		sonVergi= vergiDilimi/karAl;
		
		System.out.println(sonVergi);
		
	}

}
