package com.norton.ifelse;

import java.util.Scanner;

public class IfElseIslemi {

	public static void main(String[] args) {
		
		boolean annemEvdemi;
	    String kontrolString; 
		 
		Scanner oku = new Scanner(System.in);
		
		kontrolString = oku.nextLine();
		
		if (kontrolString.equalsIgnoreCase("Evet") )
		{
		System.out.println("Günaydýn");
		} 
		
		else{		
		System.out.println("Merhaba");
		}
		
	}

}
