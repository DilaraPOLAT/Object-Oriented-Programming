package interfaceJavaDersleri;

public class Akademisyen implements ICalisan{
	private String adSoyad,bolum,gorevler;

	public Akademisyen(String adSoyad, String bolum, String gorevler) {
		this.adSoyad = adSoyad;
		this.bolum = bolum;
		this.gorevler = gorevler;
		System.out.println(this.okul);
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
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

	@Override
	public void giris() {
		// TODO Auto-generated method stub
		System.out.println("Giris yapýldý.");
		
	}

	@Override
	public void cýkýs() {
		// TODO Auto-generated method stub
		System.out.println("cýkýs!");
		
	}

	@Override
	public boolean yemek(int saat) {
		// TODO Auto-generated method stub
		System.out.println("yemek yenildi.");
		return true;
	}

}
