import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
	public static void main(String[] args) {
		//0-100 aras�nda say�lar olacak ve kullan�c� 5 hakk� olacak say�y� tahmin etmek icin
		int tahmin,can=5,a=0 ;
		Random rand=new Random();
		int sayi=rand.nextInt(100);
		Scanner scan=new Scanner(System.in);
		int[] tahminler=new int[5];
		while(can!=0) {
			System.out.println("say� tahmini:");
			tahmin=scan.nextInt();
			can--;
			tahminler[a++]=tahmin;
			if(tahmin==sayi) {
				System.out.println("---TEBR�KLER dogru tahmin---");
				break;
				
			}
			else if(tahmin!=sayi) {
				System.out.println("---UZGUNUM yanl�s tahmin---");	
				if(sayi<100 && sayi>=80) {
					System.out.println("say� 100-80 aras�nda");
				}
				else if(sayi<=79 && sayi>=60) {
					System.out.println("say� 80-60 aras�nda");
					
				}
				else if(sayi<=59 && sayi>=40) {
					System.out.println("say� 60-40 aras�nda");
					
				}
				else if(sayi<=39 && sayi>=20) {
					System.out.println("say� 40-20 aras�nda");
					
				}
				else {
					System.out.println("say� 20-0 aras�nda");
				}
					
			}
			
		}
		if(can==0) {
			System.out.println("---MALESEF hakk�n�z doldu---");
			System.out.println("sayi :"+sayi);
			System.out.println("Tahminleriniz :");
			for (int value:tahminler) {
				System.out.print(value+" ");
			}
			
		}
		
		
		
		
		
	}

}
