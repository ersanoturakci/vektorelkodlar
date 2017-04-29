package com.iterator;

public class Hayvan {
	
int id;
String adi;
String turu;


public Hayvan(int id, String adi, String turu){
	this.id=id;
	this.adi=adi;
	this.turu=turu;
	
	}

public void setId(int id) {
	this.id = id;
}
public int getId() {
	return id;
}

public void setAdi(String adi) {
	this.adi = adi;
}

public String getAdi() {
	return adi;
}


public void setTuru(String turu) {
	this.turu = turu;
}
public String getTuru() {
	return turu;
}



}
