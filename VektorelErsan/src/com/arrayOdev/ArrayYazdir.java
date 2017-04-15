package com.arrayOdev;

public class ArrayYazdir {
	
	public static void main(String[] args) {
		
		
		String mes="Yasasin Cumhuriyet";
		
		char[] array=mes.toCharArray();
		for (int i = 0; i < array.length; i++) {
								
			if (i%2==0){ 
			
		array[i]= String.valueOf(array[i]).toUpperCase().charAt(0);
							
			}
									
		}
		String s= new String(array);
		System.out.println(s);
	}

}
