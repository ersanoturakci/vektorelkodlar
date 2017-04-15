package com.tryCatch;import java.io.ObjectInputStream.GetField;

public class Islem {

	
	public static void main(String[] args){
		
		Kisi kisi=new Kisi();
	//	ErsanHatasi ersanHatasi=new ErsanHatasi(null, 20);
		
	try {
		if(kisi.getVeri()==null){
//			System.out.println(kisi.getVeri().toLowerCase());
			int zaman=150;
			throw new ErsanHatasi("null mes", zaman);
			
		}
	} catch (ErsanHatasi e){
		System.out.println(e.getMessage());
		
		
		}
		
	}
	
}
	

