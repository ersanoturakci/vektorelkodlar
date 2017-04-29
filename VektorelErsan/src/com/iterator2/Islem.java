package com.iterator2;

import java.util.HashSet;

public class Islem {

	
	
	public static Lokanta[] diziGonder(){
		
		Lokanta lokanta1=new Lokanta("Nusret", "Etiler");
		Lokanta lokanta2=new Lokanta("Hosta", "Kadýköy");
		Lokanta lokanta3=new Lokanta("Ahm-et", "Bakýrköy");
		
		Lokanta[] myArray={lokanta1,lokanta2,lokanta3};
		
		
		return myArray;
			
				
	}
	
	public static void main(String[] args) {
		
		HashSet<Lokanta> hash=new HashSet<>();
		
		Lokanta lokanta1=new Lokanta("Nusret", "Etiler");
		Lokanta lokanta2=new Lokanta("Hosta", "Kadýköy");
		Lokanta lokanta3=new Lokanta("Ahm-et", "Bakýrköy");
		
		Lokanta[] myArray={lokanta1,lokanta2,lokanta3};	
		
		
		
		for (int i = 0; i < myArray.length; i++) {
			hash.add(myArray[i]);
			
		}
		
	
		
		for (Lokanta lokanta : hash) {
			System.out.println(lokanta.getAdres());
		}
		

		
	}	
		
	}
