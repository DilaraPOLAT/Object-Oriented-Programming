package Polimorfizm;

public class BilMuh extends Muhendis{

	public BilMuh(String ad, int yas) {
		super(ad, yas);
		this.brans="Bilgisayar Muhendisligi";
	}

	@Override
	public void BilgileriYazdir() {
		System.out.println("-----------BÝLGÝSAYA MUHENDÝSLÝÐÝ SÝNÝFÝ-----------");
		System.out.println("Muhendis ad:"+this.ad);
		System.out.println("Muhendis yas:"+this.yas);
		System.out.println("Muhendis bransi:"+this.brans);
		System.out.println("-------------------------------");
	}

	@Override
	public int PuanHesapla() {
		this.puan=yas*4;
		return this.puan;
	}
	

}
