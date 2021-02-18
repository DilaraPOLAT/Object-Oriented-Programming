package Ornekler;

public class OgretimUyesi extends Akademisyen {
	public String unvan;
	
	public String giris()
	{
		return this.unvan+" "+super.giris();
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public OgretimUyesi(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String ders,String unvan) {
		super(adsoyad, eposta, telefon, bolum, gorevler, ders);
		this.unvan = unvan;
	}

	@Override
	public void Dersegir(int dersaati) {
		// TODO Auto-generated method stub
		System.out.println(getUnvan()+""+getAdsoyad()+" "+getDers() +"saat "+dersaati+" Dersine   giridi.");
		
	}

	
	
	


}
