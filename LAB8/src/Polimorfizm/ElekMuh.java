package Polimorfizm;

public class ElekMuh extends Muhendis{

	public ElekMuh(String ad, int yas) {
		super(ad,yas);
		this.brans="Elektrik MUhendisi";
	}

	@Override
	public void BilgileriYazdir() {
		
		System.out.println("-----------Elektrik MUHENDÝSLÝÐÝ SÝNÝFÝ-----------");
		System.out.println("Muhendis ad:"+this.ad);
		System.out.println("Muhendis yas:"+this.yas);
		System.out.println("Muhendis bransi:"+this.brans);
		System.out.println("-------------------------------");
	}

	@Override
	public int PuanHesapla() {
		this.puan=yas*5;
		return this.puan;
	}

}
