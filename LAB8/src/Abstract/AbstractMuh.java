package Abstract;

public abstract class AbstractMuh {
	public String ad;
	public String brans;
	public int yas;
	public int puan;
	
	public AbstractMuh(String ad, int yas) {
		
		this.ad = ad;
		this.yas = yas;
		this.brans="Muhendis";
	}

	public void BilgileriYazdir()
	{
		System.out.println("-----------MUHENDÝS-----------");
		System.out.println("Muhendis ad:"+this.ad);
		System.out.println("Muhendis yas:"+this.yas);
		System.out.println("Muhendis puan:"+this.puan);
		System.out.println("-------------------------------");
	}
	
	public abstract int PuanHesapla();

}
