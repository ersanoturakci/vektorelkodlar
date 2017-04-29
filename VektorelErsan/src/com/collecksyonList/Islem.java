package com.collecksyonList;

import java.util.LinkedList;
import java.util.List;

public class Islem {
	
	
	public static void main(String[] args) {
		
	
		List<Insaat> myList= new LinkedList<>();
		
		Insaat ins1= new Insaat(1, "EGR");
		Insaat ins2= new Insaat(2, "ATLI");
		Insaat ins3= new Insaat(3, "PI Makina");

		Insaat [] myArray={ins1, ins2,ins3};
		
	
		
		for (int i = 0; i < myArray.length; i++) {
			myList.add(myArray[i]);
		}
		
		
		for (Insaat insaat : myArray) {
			System.out.println(insaat.getName());
			System.out.println(insaat.getId());
		}
		
	}

}
