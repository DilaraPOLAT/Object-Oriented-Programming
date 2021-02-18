package KalitimOrnek;

public class Ogrenci {
	private int id;
	private String ad_soyad;
	private double vize_notu;
	private double final_notu;
	
	private static int count=0;
	
	public Ogrenci(String ad_soyad,double vize_notu,double final_notu)
	{
		this.count=++count;
		this.ad_soyad=ad_soyad;
		this.final_notu=final_notu;
		this.vize_notu=vize_notu;
	}
	
	public class BilgileriYazdir
	{
		public void OgrenciBilgileriYazdir(Ogrenci ogr)
		{
			System.out.println("------------------------");
			System.out.println("Telefonun hýzý:"+ogr.id);
			System.out.println("Telefonun markasý:"+ogr.ad_soyad);
			System.out.println("Telefonun modeli:"+ogr.vize_notu);
			System.out.println("Telefonun hafýzasý:"+ogr.final_notu);
			
		}
	}
	
	public class GecmeNotuHesapla
	{
		public  double GecmeNotuHesapla()
		{
			double gn;
			gn=(vize_notu*0.4)+(final_notu*0.6);
			System.out.println("Ogrencinin adi:"+ad_soyad+"Ogrencinin gecme notu:"+gn);
			return gn;
		}
	}
	
	public class HarfHesapla
	{
		public void Hesapla()
		{
			GecmeNotuHesapla n=new GecmeNotuHesapla();
			double gn=n.GecmeNotuHesapla();
			if(gn<=50)
				System.out.println("Ogrencinin adi"+ad_soyad+"Harf notu :CC");
			else
				System.out.println("Ogrencinin adi"+ad_soyad+"Harf notu :AA");
		}
	}
	
	
	
	
	
	
	
	
	

}
