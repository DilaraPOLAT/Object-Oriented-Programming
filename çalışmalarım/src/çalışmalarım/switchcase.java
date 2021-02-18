package çalýþmalarým;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		System.out.println("Toplama iþlemi için - 1\nÇýkarma iþlemi için - 2\nÇarpma iþlemi için - 3\n"
				+ "Bölme iþlemi için - 4 basýnýz." );
		Scanner scan=new Scanner(System.in);
		int sayi,sayi1,sayi2,sonuc;
		System.out.println("Hespa yapmak istediðiniz seçenðe giriniz:");
		sayi=scan.nextInt();
		System.out.println("Yapacaðýnýz iþlem için iki sayý giriniz:");
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
