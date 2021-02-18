package Ornekler;

public class Asistan extends Akademisyen {
	protected String yuksekLisans;
	
	@Override
	public String giris()
	{
		return "Asistan"+super.giris();
	}

	public String getYuksekLisans() {
		return yuksekLisans;
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}

	public Asistan(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
			String yuksekLisans) {
		super(adsoyad, eposta, telefon, bolum, gorevler, ders);
		this.yuksekLisans = yuksekLisans;
	}

	@Override
	public void Dersegir(int dersaati) {
		// TODO Auto-generated method stub
		System.out.println(getAdsoyad()+" "+getDers() +" Dersine asistan olarak  giridi.");
		
	}

}
