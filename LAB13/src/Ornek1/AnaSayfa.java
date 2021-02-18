package Ornek1;

import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String cad,csoyad,coad;
		int cyas,coyas,syc,csayisi,id,cosayisi;
		
		ArrayList<Calisan> calisanlar=new ArrayList<Calisan>();
		System.out.println("Calisan sayisi giriniz:");
		
		syc=scan.nextInt();
		for(int i=0;i<syc;i++) {
			
			System.out.println("Calisanin ýd:");
			id=scan.nextInt();
			
			System.out.println("Calisanin ad:");
			cad=scan.next();
			
			System.out.println("Calisanin soyad:");
			csoyad=scan.next();
			
			System.out.println("Calisanin yas:");
			cyas=scan.nextInt();
			
			Calisan calisan=new Calisan(id,cad,csoyad,cyas);
			
			System.out.println("cocuk sayisi giriniz:");
			cosayisi=scan.nextInt();
			for(int j=0;j<cosayisi;j++) {
				System.out.println("Cocuk ad:");
				coad=scan.next();
				
				System.out.println("cocuk yas");
				coyas=scan.nextInt();
				
				Cocuk cocuklar=new Cocuk(coad,coyas);
				calisan.Cocuklar.add(cocuklar);
				
			}
			calisanlar.add(calisan);
			
			
		}
		System.out.println("Tum Calisan Bilgieri:");
		for( Calisan cls:calisanlar) {
			System.out.println(cls.Id+" "+cls.ad+" "+cls.soyad+" "+cls.yas);
			for(Cocuk cck:cls.Cocuklar) {
				System.out.println("\t"+cck.ad+" "+cck.yas);
			}
		}

	}

}
