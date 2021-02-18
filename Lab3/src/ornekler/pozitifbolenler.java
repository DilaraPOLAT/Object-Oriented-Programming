package ornekler;

import java.util.Scanner;

public class pozitifbolenler {
	public static void main(String[] args) {
		
		int sayi,i,bolen;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		sayi=scan.nextInt();
		
		for( i=1;i<=sayi;i++) {
		    bolen=sayi%i;
			if(bolen==0) {
				System.out.print(i+"\t");
			}
		}
		
	}

}
