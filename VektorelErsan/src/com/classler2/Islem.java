package com.classler2;

public class Islem {

	public static void main(String[] args) {

		// Ogretmen ogretmenMustafa = new Ogretmen();
		// ogretmenMustafa.ogretmenIsmi="Mustafa Hoca";
		// ogretmenMustafa.ogretmenTC=1000;
		// ogretmenMustafa.ogretmenID=123;
		//
		// Ogretmen ogretmenUmut = new Ogretmen();
		// ogretmenUmut.ogretmenIsmi="Onur Hoca";
		// ogretmenUmut.ogretmenTC=2000;
		// ogretmenUmut.ogretmenID=456;
		//
		// System.out.println("isim : " +ogretmenMustafa.ogretmenIsmi);
		// System.out.println("TC :" + ogretmenMustafa.ogretmenTC);
		// System.out.println("ID : " + ogretmenMustafa.ogretmenID);
		//
		// System.out.println("isim" +ogretmenUmut.ogretmenIsmi);
		// System.out.println(" TC: " +ogretmenUmut.ogretmenTC);
		// System.out.println("ID: " + ogretmenUmut.ogretmenID);

		Hizmet hizmetci = new Hizmet();
		hizmetci.veriGir();
		hizmetci.isimYazdir();

		String yeniIsim = hizmetci.yeniIsim();
		System.out.println(yeniIsim);
	}

}
