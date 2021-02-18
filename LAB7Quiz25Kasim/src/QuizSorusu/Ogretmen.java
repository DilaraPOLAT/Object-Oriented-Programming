package QuizSorusu;

public class Ogretmen {
	public String ad;
	public  String soyad;
	public String brans;
	public int yas;
	private static int ogretmensayisi=0;
	
	public Ogretmen (String ad, String soyad ,int yas)
	{
		this.ad=ad;
		this.soyad=soyad;
		this.yas=yas;
		this.ogretmensayisi++;
		
		
	}
	
	public Ogretmen() {
		// TODO Auto-generated constructor stub
	}

	public void BilgileriYazdir()
	{
		System.out.println("AD:"+this.ad+" "+"Soyad:"+this.soyad+" "+"Yas:"+this.yas+" "+"Brans:"+this.brans);
	}
	
	
	
	final public int OgretmenSayisiVer()
	{
		
		return this.ogretmensayisi;
	}
	
	
	
	
	

}
