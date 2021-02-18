package Ornekler;

public class Calisan {
	protected String adsoyad,eposta,telefon;

   public Calisan(String adsoyad, String eposta, String telefon) {
		
		this.adsoyad = adsoyad;
		this.eposta = eposta;
		this.telefon = telefon;
	}
	
   public String giris()
	{
		return this.adsoyad+" giris yapti";
	}
   
//	public void giris()
//	{
//		System.out.println(this.adsoyad+" giris yapti");
//	}
	//static int GirisSayisi=0;
	
//	public static int giris()
//	{
//		return ++Calisan.GirisSayisi;
//	}
	
	public String getAdsoyad() {
		return adsoyad;
	}

	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public static void listele(Calisan[] girisYapanlar )
	{
		for(Calisan c:girisYapanlar)
		{
			System.out.println(c.giris());
		}
	}

	

	

}
