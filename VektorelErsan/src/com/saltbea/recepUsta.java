package com.saltbea;

public class recepUsta {

	private int id;
	public int masaSayisi;
	public int garsonSayisi;
	int etMiktari;
	
	
		public void etMiktariSorgula(){
		
			NusrEt nusreEt=new NusrEt();
		System.out.println(nusreEt.etMiktari);	
	}
}
