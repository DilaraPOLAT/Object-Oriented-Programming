package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		ArrayList<Ogrenci> liste=new ArrayList<Ogrenci>();
		
		boolean dongu=true;
		int secim,vn,fn;
		String ad,soyad;
		
		while(dongu) {
			
			System.out.println("1-Öðrenci ekle");
			System.out.println("2-Öðrencileri Listele");
			System.out.println("3-Öðrenci Ara");
			System.out.println("4-Öðrenci Sil");
			System.out.println("5-Çýkýþ");
			System.out.println("(1-5) arasýnda bir seçim yapýnýz:");
			secim=scan.nextInt();
			switch(secim) {
			case 1:
				System.out.println("Öðrencinin adýný giriniz:");
				ad=scan.next();
				System.out.println("Öðrencinin soyadýný giriniz:");
				soyad=scan.next();
				System.out.println("Öðrencinin vize notunu giriniz:");
				vn=scan.nextInt();
				System.out.println("Öðrencinin final notunu giriniz:");
				fn=scan.nextInt();
				Ogrenci ogr=new Ogrenci(ad,soyad,vn,fn);
				liste.add(ogr);
				break;
			case 2:
				System.out.println("Listedeki Öðrenciler:");
				for(Ogrenci ogrenci:liste) {
					System.out.println("No:"+ogrenci.getNo()+" Ad:"+ogrenci.getAd()+" Soyad:"+ogrenci.getSoyad()+" Gecme Notu:"+ogrenci.getGecme_notu());
				}
				break;
			case 3:
				String aranacak_ad;
				System.out.println("Listede aramak istediðiniz öðrencinin adýný giriniz:");
				aranacak_ad=scan.next();
				for(Ogrenci ogrenci:liste) {
					if(aranacak_ad.equals(ogrenci.getAd())) {
						System.out.println("Aranan Öðrenci Bulundu");
						System.out.println("No:"+ogrenci.getNo()+" Ad:"+ogrenci.getAd()+" Soyad:"+ogrenci.getSoyad()+" Gecme Notu:"+ogrenci.getGecme_notu());
					}
				}
				break;
			case 4:
				String silinecek_ad;
				System.out.println("Listeden silmek istediðiniz öðrencinin adýný giriniz:");
				silinecek_ad=scan.next();
				for(Ogrenci ogrenci:liste) {
					if(silinecek_ad.equals(ogrenci.getAd())) {
						
						liste.remove(ogrenci);
						break;
					}
					
				}
				break;
			case 5:
				System.out.println("Çýkýþ yapýlýyor..");
				dongu=false;
				break;
			default:
				System.out.println("1-5 arasýnda bir rakam giriniz..");
				break;
			
			
			}
			
		}
		

	}

}
