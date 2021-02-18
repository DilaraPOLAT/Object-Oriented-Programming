package Polimorfizm;

public class Muhendis {
	public String ad;
	public String brans;
	public int yas;
	public int puan;
	public Muhendis(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
		this.brans="Muhendis";
	}

	public void BilgileriYazdir()
	{
		System.out.println("-----------MUHENDİS-----------");
		System.out.println("Muhendis ad:"+this.ad);
		System.out.println("Muhendis yas:"+this.yas);
		System.out.println("Muhendis puan:"+this.puan);
		System.out.println("-------------------------------");
	}
	
	public int PuanHesapla()
	{
		this.puan=yas*3;
		return puan;
	}
}
