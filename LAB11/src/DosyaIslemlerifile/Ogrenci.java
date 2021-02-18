package DosyaIslemlerifile;

public class Ogrenci {
	private int no;
	private String ad;
	private String soyad;
	

	public Ogrenci( String ad, String soyad, int no) {
		this.ad = ad;
		this.soyad = soyad;
		this.no=no;
	}

	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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
	

}
