package Ornek1;

import java.util.ArrayList;

public class Calisan {
	public int Id;
	public String ad;
	public String soyad;
	public int yas;
	public ArrayList<Cocuk> Cocuklar;
	public Calisan( int Id,String ad, String soyad, int yas) {
		this.ad = ad;
		this.Id = Id;
		this.soyad = soyad;
		this.yas = yas;
		Cocuklar=new ArrayList<Cocuk>();
	}

}
