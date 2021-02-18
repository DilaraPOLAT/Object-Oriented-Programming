package Polimorfizm;

import java.util.Scanner;

public class AnaSayfa {

	public static void BilgileriListele(Muhendis muhendis) {
		System.out.println(" ");
		muhendis.BilgileriYazdir();
		
	}
	public static void PuanlariYazdir(Muhendis[] muhler) {
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
		
		System.out.println("Makine muhendisligi sayisi giriniz:");
		mas=scan.nextInt();
		toplam=bs+es+mas;
		
		Muhendis[] muhendisler=new Muhendis[toplam];
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
		for(int i=bs+es;i<toplam;i++)
		{
			System.out.println((i+1)+".siradaki Makine muhendisinin adini giriniz:");
			ad=scan.next();
			System.out.println((i+1)+".siradaki Makine muhendisinin yasini giriniz:");
			yas=scan.nextInt();
			muhendisler[i]=new MakMuh(ad,yas);
		}
		for(int i=0;i<toplam;i++)
		{
			BilgileriListele(muhendisler[i]);
		}
		PuanlariYazdir(muhendisler);
		

	}
	


}
