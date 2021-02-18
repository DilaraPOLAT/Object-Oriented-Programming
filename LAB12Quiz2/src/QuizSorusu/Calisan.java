package QuizSorusu;

public abstract class Calisan {
	public int id;
	public String ad;
	public String soyad;
	public int yas;
	public int cs;
	
	public static int count=1000;
	public Calisan(String ad, String soyad, int yas, int cs) {
		this.id = count=count+2;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cs = cs;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getCs() {
		return cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	

	public abstract double ZamOraniHesapla();







		
		
		
	
	
	

}
