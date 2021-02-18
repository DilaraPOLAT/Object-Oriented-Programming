package Polimorfizm;

public class MakMuh extends Muhendis{

	public MakMuh(String ad, int yas) {
		super(ad, yas);
		this.brans="Makine Muhendisi";
	}

	@Override
	public void BilgileriYazdir() {
		// TODO Auto-generated method stub
		System.out.println("-----------MAKÝNE MUHENDÝSLÝÐÝ SÝNÝFÝ-----------");
		System.out.println("Muhendis ad:"+this.ad);
		System.out.println("Muhendis yas:"+this.yas);
		System.out.println("Muhendis bransi:"+this.brans);
		System.out.println("-------------------------------");
	}

}
