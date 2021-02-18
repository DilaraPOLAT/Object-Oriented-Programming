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
			
			System.out.println("1-��renci ekle");
			System.out.println("2-��rencileri Listele");
			System.out.println("3-��renci Ara");
			System.out.println("4-��renci Sil");
			System.out.println("5-��k��");
			System.out.println("(1-5) aras�nda bir se�im yap�n�z:");
			secim=scan.nextInt();
			switch(secim) {
			case 1:
				System.out.println("��rencinin ad�n� giriniz:");
				ad=scan.next();
				System.out.println("��rencinin soyad�n� giriniz:");
				soyad=scan.next();
				System.out.println("��rencinin vize notunu giriniz:");
				vn=scan.nextInt();
				System.out.println("��rencinin final notunu giriniz:");
				fn=scan.nextInt();
				Ogrenci ogr=new Ogrenci(ad,soyad,vn,fn);
				liste.add(ogr);
				break;
			case 2:
				System.out.println("Listedeki ��renciler:");
				for(Ogrenci ogrenci:liste) {
					System.out.println("No:"+ogrenci.getNo()+" Ad:"+ogrenci.getAd()+" Soyad:"+ogrenci.getSoyad()+" Gecme Notu:"+ogrenci.getGecme_notu());
				}
				break;
			case 3:
				String aranacak_ad;
				System.out.println("Listede aramak istedi�iniz ��rencinin ad�n� giriniz:");
				aranacak_ad=scan.next();
				for(Ogrenci ogrenci:liste) {
					if(aranacak_ad.equals(ogrenci.getAd())) {
						System.out.println("Aranan ��renci Bulundu");
						System.out.println("No:"+ogrenci.getNo()+" Ad:"+ogrenci.getAd()+" Soyad:"+ogrenci.getSoyad()+" Gecme Notu:"+ogrenci.getGecme_notu());
					}
				}
				break;
			case 4:
				String silinecek_ad;
				System.out.println("Listeden silmek istedi�iniz ��rencinin ad�n� giriniz:");
				silinecek_ad=scan.next();
				for(Ogrenci ogrenci:liste) {
					if(silinecek_ad.equals(ogrenci.getAd())) {
						
						liste.remove(ogrenci);
						break;
					}
					
				}
				break;
			case 5:
				System.out.println("��k�� yap�l�yor..");
				dongu=false;
				break;
			default:
				System.out.println("1-5 aras�nda bir rakam giriniz..");
				break;
			
			
			}
			
		}
		

	}

}
