package VizeOdevi;
import java.util.Scanner;

public class AnaSayfa {	
	public static void main(String[] args) {
		String depAd,perAd,perSoyad,servisGuzergah;
		int depNo,dSayi,pSayi,Peryas,sSayi;
		Scanner scan=new Scanner(System.in);
		
		Departman d=new Departman();

		
		System.out.println("->Departman sayisini giriniz:");
		dSayi = scan.nextInt();
		
		
		Departman[] bilgiDep=new Departman[dSayi];
//Departman adýnda dizi olusturdum.Ve bilgileri kullanýcýdan alýyorum.
		int i,j,k;
		
		for(i=0;i<dSayi;i++) 
		{
			System.out.println(i+1+".Departman adi giriniz: ");
			depAd=scan.next();
			System.out.println(i+1+".Departman no giriniz: ");
			depNo=scan.nextInt();
			System.out.println("->Personel sayisi giriniz:");
			pSayi=scan.nextInt();
			bilgiDep[i]=new Departman(depAd,depNo);
//Personeller dizisinin boyutunu belirliyorum.ve fonksiyona gonderiyorum.
			d.diziPBoyut(pSayi);
			bilgiDep[i].diziPBoyut(pSayi);
			for(j=0;j<pSayi;j++)
			{
				System.out.println(j+1+".Personel adi giriniz: ");
				perAd=scan.next();
				System.out.println(j+1+".Personel soyadi giriniz: ");
				perSoyad=scan.next();
				System.out.println(j+1+".Personel yas giriniz: ");
				Peryas=scan.nextInt();
//Departman nesnesinden personeller ve personeller dizisine ulasýyorum ve dolduruyorum.
//Burada tekrardan depno almadim yukarida almýstým zaten onu gonderiyorum. 
				//Personel ID kendisi atanacak.
			
				d.Personeller[j]=new Personel(depNo,perAd,perSoyad,Peryas);
//Departman dizisine personeller dizisini gonderiyorum.ornegin departman dizisinin
//0.indeksine peronellerin 0.indeksindeki bilgileri yoluyorum.
				bilgiDep[i].Personeller[j]=d.Personeller[j];  
			}
			System.out.println("->Servis sayisi giriniz:");
			sSayi=scan.nextInt();
//Servisler dizisinin boyutunu belirliyorum.ve fonksiyona gonderiyorum.
			d.diziSBoyut(sSayi);
			bilgiDep[i].diziSBoyut(sSayi);
				
			for(k=0;k<sSayi;k++)
			{
					System.out.println(k+1+".Servis guzergah giriniz: ");
					servisGuzergah=scan.next();	
					//Burada tekrardan depno almadim yukarida almýstým zaten onu gonderiyorum.
					//servis  ýd kendisi atanacak.
					d.Servisler[k]=new Servis(depNo,servisGuzergah);
//Departman dizisine servisler dizisini gonderiyorum.					
					bilgiDep[i].Servisler[k]=d.Servisler[k];		
			}
		}
		int x;
		while(true) {
			System.out.println();
			System.out.println("(1) Tüm Departman Bilgilerini Listele\r\n"
					+ "(2) Departman Adýna Göre Arama Yap\r\n"
					+ "(3) Personel Adýna Göre Arama Yap\r\n"
					+ "(4) Servis Güzergâhýna Göre Arama Yap\r\n"
					+ "(5) Yaþý En Büyük ve En Küçük Personel/Personelleri Bul\r\n"
					+ "(6) Çýkýþ için tuþa basiniz.");
			System.out.println("Menu tercihi icin tusa basiniz:");
			x=scan.nextInt();
			if(x==1) {
				
				for( i=0;i<dSayi;i++)
				{	
					bilgiDep[i].BilgileriYazdir();//Departman dizisindeki Departman sýnýfýndaki bilgiler yazýlýyor
					System.out.println("Personeller:");
					for(j=0;j<bilgiDep[i].Personeller.length;j++)
					{
						bilgiDep[i].Personeller[j].PersonelYazdir(j+1);//Departman dizisindeki personeller sýnýfýndaki bilgiler yazýlýyor
					}
					System.out.println("Servisler:");
					for (k=0;k<bilgiDep[i].Servisler.length;k++)
					{
						bilgiDep[i].Servisler[k].ServisYazdir(k+1);//Departman dizisindeki servisler sýnýfýndaki bilgiler yazýlýyor
					}		
				}
			}
			else if(x==2)
			{
				String ad;
				System.out.println("Aranacak Departman adi giriniz:");
				ad=scan.next();
				int syc=0, a=bilgiDep.length;
				for(i=0;i<bilgiDep.length;i++)
				{
					syc++;
					if(	ad.contains(bilgiDep[i].getDepAd()))
			//Eger Departman adi ile girilen isim ayni ise if 'in icine girer.Ve bilgiler yazdirilir.
					{  
						
						bilgiDep[i].BilgileriYazdir();
						System.out.println("Personeller:");
						for(j=0;j<bilgiDep[i].Personeller.length;j++)
						{
							bilgiDep[i].Personeller[j].PersonelYazdir(j+1);
						}
						System.out.println("Servisler:");
						for (k=0;k<bilgiDep[i].Servisler.length;k++)
						{
							bilgiDep[i].Servisler[k].ServisYazdir(k+1);
						}
						System.out.println();			
					}
//Eger  if bloguna girmezse else if bakar syc a'ya yani demartman sayýsýna esit ise demek ki dongu bittecek.
//ve ekrana bulunmadi mesajý verilecek.
					else if(syc==a)
					{
						System.out.println("Üzgünüm  departman bulunamadi!");
						System.out.println();
					}
				}
			 }
			else if(x==3)
			{
				String ad;
				System.out.println("Aranacak Personel adi giriniz:");
				ad=scan.next();
				int syc=0, a=bilgiDep.length;
				for(i=0;i<bilgiDep.length;i++)
				{
					for(j=0;j<bilgiDep[i].Personeller.length;j++)
					{
						syc++;
						if(ad.contains(bilgiDep[i].Personeller[j].getPerAd()))
			//Departman dizisindeki Personeller adi ile girilen isim ayni ise if 'in icine girer ve bilgiler yazdirilir
						{   
							bilgiDep[i].BilgileriYazdir();
							System.out.println("Personeller:");
							bilgiDep[i].Personeller[j].PersonelYazdir(j+1);
							System.out.println();	
						}
//Eger  if bloguna girmezse else if bakar syc a'ya yani demartman sayýsýna esit ise demek ki dongu bittecek.
//ve ekrana bulunmadi mesajý verilecek.
						else if(syc==a)
						{
							System.out.println("Üzgünüm  perosnel bulunamadi!");
							System.out.println();
						}
					}  
				}
			}
			else if(x==4)
			{
				String ad;
				System.out.println("Aranacak servis güzergahi adi giriniz:");
				ad=scan.next();
				int syc=0, a=bilgiDep.length;
				for(i=0;i<bilgiDep.length;i++)
				{
					for(j=0;j<bilgiDep[i].Servisler.length;j++)
					{
						syc++;
						if(	ad.contains(bilgiDep[i].Servisler[j].getServisGuzergah()))
			//Departman dizisindeki servisler adi ile girilen isim ayni ise if 'in icine girer ve bilgiler yazdirilir
						{   
							bilgiDep[i].BilgileriYazdir();
							System.out.println("Servisler");
							bilgiDep[i].Servisler[j].ServisYazdir(j+1);
							System.out.println();		
						}
//Eger  if bloguna girmezse else if bakar syc a'ya yani demartman sayýsýna esit ise demek ki dongu bittecek.
//ve ekrana bulunmadi mesajý verilecek.
						else if(syc==a)
						{
							System.out.println("Üzgünüm  servis güzergahi bulunamadi!");
							System.out.println();
						}
					}  
				}
			}
			else if(x==5)
			{
				int yas_en_buyuk=0,yas_en_kucuk=1000;
				// en kucuk yasi buyuk bir sayi en buyuk yasý 0  belirledim cunku karsilastýrma yapmak icin  
				for( i=0;i<bilgiDep.length;i++)
				{
					for(j=0;j<bilgiDep[i].Personeller.length;j++)
					{
						yas_en_buyuk=bilgiDep[i].Personeller[j].perEnBYas(yas_en_buyuk);
			//personelin yasý fonksiyona gonderiliyor .Ve fonksiyon geriye deger donduruyor ve atama yapýlýyor.
						yas_en_kucuk=bilgiDep[i].Personeller[j].perEnKYas(yas_en_kucuk);
						
					}	
				}
				
//Burada en buyuk yas en kucuk yas ayni olan personelide yazmak icin dongu yaptim.
				for( i=0;i<bilgiDep.length;i++)
				{
					for(j=0;j<bilgiDep[i].Personeller.length;j++)
					{
//yas en buyuk en kucuk personellere ait yaslari yazdiriyorum.						
						if(bilgiDep[i].Personeller[j].getPerYas()==yas_en_buyuk)
						{
							System.out.println("-Yas En Buyuk Personel-");
							bilgiDep[i].BilgileriYazdir();
							System.out.println("Personeller:");
							bilgiDep[i].Personeller[j].PersonelYazdir(j+1);
							System.out.println();
							
						}
						if(bilgiDep[i].Personeller[j].getPerYas()==yas_en_kucuk)
						{
							System.out.println("-Yas En Kucuk Personel-");
							bilgiDep[i].BilgileriYazdir();
							System.out.println("Personeller:");
							bilgiDep[i].Personeller[j].PersonelYazdir(j+1);
							System.out.println();
						}
						
					}	
				}			
			}
			else if(x==6)
			{
				System.out.println("Programdan ciktiniz...");
				break;
		
			}	
		  }
		}	
	}