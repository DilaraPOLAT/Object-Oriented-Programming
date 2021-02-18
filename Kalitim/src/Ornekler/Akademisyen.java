package Ornekler;

public abstract class  Akademisyen extends Calisan{
	String bolum,gorevler;
	String ders;
	
//	public void Dersegir()
//	{
//		System.out.println("Derse girildi!");
//	}
	
	public abstract void Dersegir(int dersaati);

	public Akademisyen(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String ders) {
		super(adsoyad, eposta, telefon);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.ders = ders;
	}

//	public void giris()
//	{
//		System.out.println(this.adsoyad+" giris yapti A kapisindan");
//	}
	public String giris()
	{
		//return this.adsoyad+" giris yapti A kapisindan";
		return super.giris()+"  A kapisindan";
	}
	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorevler() {
		return gorevler;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

}
