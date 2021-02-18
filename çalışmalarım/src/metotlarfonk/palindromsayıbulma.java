package metotlarfonk;

import java.util.Scanner;

public class palindromsayýbulma {
	static int palindrom(int x) {
		
		int kalan,ters=0;
		while(x>0) {
			kalan=x%10;
			ters=ters*10+kalan;
			x=x/10;	
		}
		return ters;
		
		
	}
	public static void main(String[] args) {
		
		int a,sayi;
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		a=scan.nextInt();
		sayi = palindrom(a);
		if(sayi==a) {
			System.out.println("PALÝNDROM SAYÝ");
		}
		else{
			System.out.println("PALÝNDROM SAYÝ DEÐÝL");
		}
		
	}

}
