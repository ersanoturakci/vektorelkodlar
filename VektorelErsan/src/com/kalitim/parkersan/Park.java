package com.kalitim.parkersan;

public class Park extends Orman implements IPark {

	@Override
	public void insan() {
		System.out.println("insan implement");
	}

	@Override
	public void hayvan() {
		System.out.println("hayvan implement");

	}

	public Park(String adi) {
		System.out.println("merhaba ben " + adi + " parki");
	}

}