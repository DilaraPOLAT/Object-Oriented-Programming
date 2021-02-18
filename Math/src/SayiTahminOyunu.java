import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
	public static void main(String[] args) {
		//0-100 arasýnda sayýlar olacak ve kullanýcý 5 hakký olacak sayýyý tahmin etmek icin
		int tahmin,can=5,a=0 ;
		Random rand=new Random();
		int sayi=rand.nextInt(100);
		Scanner scan=new Scanner(System.in);
		int[] tahminler=new int[5];
		while(can!=0) {
			System.out.println("sayý tahmini:");
			tahmin=scan.nextInt();
			can--;
			tahminler[a++]=tahmin;
			if(tahmin==sayi) {
				System.out.println("---TEBRÝKLER dogru tahmin---");
				break;
				
			}
			else if(tahmin!=sayi) {
				System.out.println("---UZGUNUM yanlýs tahmin---");	
				if(sayi<100 && sayi>=80) {
					System.out.println("sayý 100-80 arasýnda");
				}
				else if(sayi<=79 && sayi>=60) {
					System.out.println("sayý 80-60 arasýnda");
					
				}
				else if(sayi<=59 && sayi>=40) {
					System.out.println("sayý 60-40 arasýnda");
					
				}
				else if(sayi<=39 && sayi>=20) {
					System.out.println("sayý 40-20 arasýnda");
					
				}
				else {
					System.out.println("sayý 20-0 arasýnda");
				}
					
			}
			
		}
		if(can==0) {
			System.out.println("---MALESEF hakkýnýz doldu---");
			System.out.println("sayi :"+sayi);
			System.out.println("Tahminleriniz :");
			for (int value:tahminler) {
				System.out.print(value+" ");
			}
			
		}
		
		
		
		
		
	}

}
