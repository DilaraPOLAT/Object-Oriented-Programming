package QuizSorusu;

import java.util.Scanner;

public class AnaSayfa {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int ogrRS,ogrMS,yas,gs;
		String ad,soyad;
		
		Ogretmen ogrt=new Ogretmen();
		
		System.out.println("Kac matematik ögretmeni girilecek:");
	    ogrMS=scan.nextInt();
	    System.out.println("Kac resim ögretmeni girilecek:");
	    ogrRS=scan.nextInt();
	    Ogretmen ogr=new Ogretmen();
	   MatematikOgretmeni mato=new MatematikOgretmeni();
	   ResimOgretmeni reso=new ResimOgretmeni();
	    
	    MatematikOgretmeni[] m = new MatematikOgretmeni[ogrMS]; 
	    ResimOgretmeni[] r = new ResimOgretmeni[ogrRS];
	    
		int i=0;
		for(i=0;i<ogrMS;i++)
		{
			System.out.println("Matematik Öðretmeninin adi giriniz:");
			ad=scan.next();
			System.out.println("Matematik Öðretmeninin soyadi giriniz:");
			soyad=scan.next();
			System.out.println("Matematik Öðretmeninin yasi giriniz:");
			yas=scan.nextInt();
			System.out.println("Matematik Öðretmeninin görev suresi giriniz:");
			gs=scan.nextInt();
			m[i]= new MatematikOgretmeni(ad,soyad,yas,gs);
			
		}
		for(i=0;i<ogrRS;i++)
		{
			System.out.println("Resim Ogretmeninin adi giriniz:");
			ad=scan.next();
			System.out.println("Resim Öðretmeninin soyadi giriniz:");
			soyad=scan.next();
			System.out.println("Resim Öðretmeninin yasi giriniz:");
			yas=scan.nextInt();
			System.out.println("Resim Öðretmeninin görev suresi giriniz:");
			gs=scan.nextInt();
			r[i]= new ResimOgretmeni(ad,soyad,yas,gs);
			
		}
		int x=mato.getCount()+reso.getCount();
		ogr.SetOgretmenSayisiVer(x);
		System.out.println("->Okuldaki Ogretmen ayisi:"+ogr.getOgretmenSayisiVer());
		System.out.println("----------------------");
		System.out.println("-Matematik Ogretmenleri-");
		for(i=0;i<ogrMS;i++)
		{
			m[i].BilgileriYazdir();
		}
		System.out.println("----------------------");
		System.out.println("-Resim Ogretmeni-");
		for(i=0;i<ogrRS;i++)
		{
			r[i].BilgileriYazdir();
		}

		m=OgretmenSirala(m);
		r=OgretmenSiralar(r);
		System.out.println("-Matematik Ogretmenleri-");
		for(i=0;i<ogrMS;i++)
		{
			m[i].BilgileriYazdir();
		}
		System.out.println("----------------------");
		System.out.println("-Resim Ogretmeni-");
		for(i=0;i<ogrRS;i++)
		{
			r[i].BilgileriYazdir();
		}
		
		
	}
	public static MatematikOgretmeni[]  OgretmenSirala(MatematikOgretmeni[] m)
	{
		MatematikOgretmeni temp;
		for(int i=0;i<m.length;i++)
		{
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i].tp<m[j].tp)
				{
					
				    temp = m[i];
					m[i]=m[j];
					m[j]=temp;
					
				}
			}
		}
		return m;
	}
	
	public static ResimOgretmeni[]  OgretmenSiralar(ResimOgretmeni[] r)
	{
		ResimOgretmeni temp;
		for(int i=0;i<r.length;i++)
		{
			for(int j=i+1;j<r.length;j++)
			{
				if(r[i].tp<r[j].tp)
				{
					temp=r[i];
					r[i]=r[j];
					r[j]=temp;
				}
			}
		}
		return r;
	}

	
	
    
    
	
	

}
