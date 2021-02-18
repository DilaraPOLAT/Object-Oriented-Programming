

package Abstract;
import java.util.Scanner;
public class Anasayfa {

	public static void BilgileriListele(AbstractMuh muhendis) {
		System.out.println(" ");
		muhendis.BilgileriYazdir();//Hata vermez cunku abstract degil
		
	}
	public static void PuanlariYazdir(AbstractMuh[] muhler) {
		System.out.println(" ");
		for(int i=0;i<muhler.length;i++)
		{
			System.out.println((i+1)+".muhendisin bransi:"+muhler[i].brans+" Yasi:"+muhler[i].yas+"puan:"+muhler[i].PuanHesapla());
		}
		
	}
	public static void main(String[] args) {
		String ad;
		int yas,toplam,bs,es,mas;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bilgisayar muhendisi sayisi giriniz:");
		bs=scan.nextInt();
		
		System.out.println("Elektronik muhendisi sayisi giriniz:");
		es=scan.nextInt();
		
		
		toplam=bs+es;
		//AbstractMuh muh=new AbstractMuh("Ali",30);->Hata verir cunku abstract olarak tanimli
		AbstractMuh[] muhendisler=new AbstractMuh[toplam];//Burada yer ayýrýyorum ici dolu degil bu yuzden hata vermiyor
		System.out.println(" ");
		
		for(int i=0;i<bs;i++)
		{
			System.out.println((i+1)+".siradaki Bilgisayar muhendisinin adini giriniz:");
			ad=scan.next();
			System.out.println((i+1)+".siradaki Bilgisayarin yasini giriniz:");
			yas=scan.nextInt();
			muhendisler[i]=new BilMuh(ad,yas);
		}
		for(int i=bs;i<bs+es;i++)
		{
			System.out.println((i+1)+".siradaki Elektrik muhendisinin adini giriniz:");
			ad=scan.next();
			System.out.println((i+1)+".siradaki Elektrik muhendisinin yasini giriniz:");
			yas=scan.nextInt();
			muhendisler[i]=new ElekMuh(ad,yas);
		}
		
		for(int i=0;i<toplam;i++)
		{
			BilgileriListele(muhendisler[i]);
		}
		PuanlariYazdir(muhendisler);
		

	}
	


}
