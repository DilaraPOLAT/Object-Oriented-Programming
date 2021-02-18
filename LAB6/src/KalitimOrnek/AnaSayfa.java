package KalitimOrnek;

public class AnaSayfa {
	public static void main(String[] args)
	{
//		Samsung sa=new Samsung("S5",32,1.5,38);
//		sa.BilgileriYazdýr();
//		sa.HafizaDegerlendir(sa.hafiza);
//		sa.HizDegerlendir();
//		sa.KameraDegerlendir();
		
//		Samsung sa2=new Samsung();
//		sa2.BilgileriYazdýr();
//		sa2.HafizaDegerlendir(sa2.hafiza);
//		sa2.HizDegerlendir();
//		sa2.KameraDegerlendir();
		
		Ogrenci ogr=new Ogrenci("Ali Kara",70,80);
		Ogrenci.BilgileriYazdir ob= ogr.new BilgileriYazdir();
		ob.OgrenciBilgileriYazdir(ogr);
		
		Ogrenci.GecmeNotuHesapla go=ogr.new GecmeNotuHesapla();
		go.GecmeNotuHesapla();
		
		Ogrenci.HarfHesapla ho=ogr.new HarfHesapla();
		ho.Hesapla();
		
	}

}
