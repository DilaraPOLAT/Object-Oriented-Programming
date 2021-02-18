package ornekler;

import java.util.Scanner;

public class Sayıyıterscevirme {
	public static void main(String[] args) {
		int sayi,ters=0,kalan;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		sayi=scan.nextInt();
		
		while(sayi>0) {
			kalan=sayi%10;
			ters=ters*10+kalan;
			sayi=sayi/10;
		}
		System.out.println(ters);
	}

}
