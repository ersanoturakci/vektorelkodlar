package com.matematik;

public class Topla {
int sonuc;

	
	public Topla(int a, int b){
		this.sonuc=a+b;
	}
	
	public Topla(int a, int b, int c){
		this.sonuc=a+b+c;
	}
	
	public Topla (int []array){
		for(int i=0;i<array.length;i++){
			this.sonuc+=array[i];
		}
	}
	
	public Topla (int []array,int[] array2){
		
		for(int i=0;i<array.length;i++){
			this.sonuc+=array[i];

		}
		
		for(int j=0;j<array2.length;j++){
			this.sonuc+=array2[j];
		}

	}
	
	

	public int getSonuc() {
		return this.sonuc;
	}
	
	
	
}
