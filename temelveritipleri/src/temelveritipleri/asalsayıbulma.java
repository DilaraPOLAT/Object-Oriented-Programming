package temelveritipleri;

import java.util.Scanner;

public class asalsayýbulma {
	public static void main(String[] args) {
		int num,bolen,sayac=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		num=reader.nextInt();
		for(int i=2;i<=num;i++)
		{
		bolen = num%i;
		if(bolen==0) {
			sayac++;
			
		}
		
		}
		if(sayac==1) {
			System.out.println("Sayi asaldýr:)");
		}
		else {
			System.out.println("Sayý asal deðildir!");
		}

		
		
	}

}
