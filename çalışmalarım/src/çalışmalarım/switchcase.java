package �al��malar�m;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		System.out.println("Toplama i�lemi i�in - 1\n��karma i�lemi i�in - 2\n�arpma i�lemi i�in - 3\n"
				+ "B�lme i�lemi i�in - 4 bas�n�z." );
		Scanner scan=new Scanner(System.in);
		int sayi,sayi1,sayi2,sonuc;
		System.out.println("Hespa yapmak istedi�iniz se�en�e giriniz:");
		sayi=scan.nextInt();
		System.out.println("Yapaca��n�z i�lem i�in iki say� giriniz:");
		sayi1=scan.nextInt();
		sayi2=scan.nextInt();
		switch (sayi){
		case 1:
			sonuc=sayi1+sayi2;
			System.out.println(sonuc);
			break;
		case 2:
			sonuc=sayi1-sayi2;
			System.out.println(sonuc);
			break;
		case 3:
			sonuc=sayi1*sayi2;
			System.out.println(sonuc);
			break;
		case 4:
			sonuc=sayi1/sayi2;	
			System.out.println(sonuc);
			break;
		
		}
		
	}

}
