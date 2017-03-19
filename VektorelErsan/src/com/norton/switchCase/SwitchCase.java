package com.norton.switchCase;

import java.util.Scanner;

public class SwitchCase {

public static void main(String[] args) {
		
Scanner oku = new Scanner(System.in);

int veri;

veri = oku.nextInt();

switch (veri) {
case 1:
	System.out.println("kaldý");
	break;
case 2:
	System.out.println("orta");
	break;
case 3:
		System.out.println("iyi");
		break;
case 4:
	System.out.println("çok iyi");
	break;

case 5:
	System.out.println("Pek iyi");
	break;

default:
	System.out.println("Geçersiz Veri");
	break;
}

	}

}
