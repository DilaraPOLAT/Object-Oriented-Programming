package QuizSorusu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Isci> list=new ArrayList<Isci>();
		String ad,soyad,maas;
		int sayi,yas,cs;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac isci girilecek:");
		sayi=scan.nextInt();
		for(int i=0;i<sayi;i++)
		{
			System.out.println("��SC� AD:");
			ad=scan.next();
			System.out.println("��SC� SOYAD:");
			soyad=scan.next();
			System.out.println("��SC� YAS:");
			yas=scan.nextInt();
			System.out.println("��SC� COCUKSAY�S�:");
			cs=scan.nextInt();
			
			Isci is=new Isci(ad,soyad,yas,cs);
			list.add(is);
			
		}
		for(Isci isci:list) {
			System.out.println("��C�: "+"id:"+isci.getId()+" AD:"+isci.getAd()+" SOYAD:"+isci.getSoyad()+" MAAS:"+isci.MaasHesapla()+" GOREV:"+isci.getGorev());
		}
		
		File file=new File("i��iler.txt");
		if(!file.exists()) {
			
			file.createNewFile();
		}
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(Isci i:list) {
			bw.write(i.getId()+" "+i.getAd()+" "+i.getSoyad()+" "+i.getCs()+" "+i.getGorev()+"\n");
			
		}
		bw.close();
		

	}

}
