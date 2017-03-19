package com.saltbealokantalar;

import com.saltbea.NusrEt;
import com.saltbea.recepUsta;

public class Musteri {

	private int id;
	
	void recepUstayiAra(){
		recepUsta recepusta =new recepUsta();
		System.out.println(recepusta.masaSayisi);
	}
	
	
	void NusretAra(){
		NusrEt nusrEt  =new NusrEt();
		System.out.println(nusrEt.masaSayisi);
	}
	
}
