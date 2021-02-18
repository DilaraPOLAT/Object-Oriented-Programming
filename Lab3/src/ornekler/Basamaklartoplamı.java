package ornekler;

import java.util.Scanner;

public class Basamaklartoplamý {
	public static void main(String[] args) {
		int sayi,bolen,toplam=0,syc=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		sayi=scan.nextInt();
		while(sayi>0) {
			bolen=sayi%10;
			toplam+=bolen;
			syc+=1;
			sayi=sayi/10;
			
		}
		System.out.println("Basamaklar toplamý:"+toplam+"\n"+"Basamak sayýsý:"+syc);
		
	}

}
