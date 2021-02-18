package Alýþtýrma;
/*1. Kullanýcýdan 10’luk tabanda alýnan sayýnýn 2’lik, 8’lik ve 16’lýk tabandaki
karþýlýklarýný ekrana yazdýran Java kodunu yazýnýz*/

import java.util.Scanner;

public class ornek1 {
	public static void main(String[] args) {
		int sayi,kalan,i,x=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		sayi = scan.nextInt();
		System.out.println(" -BÝNARY SYSTEM-");
		
			for(i=1;;i*=10) {
			    kalan=sayi%2;
			    sayi=sayi/2;
			    if(kalan==1) {
			    	x=i+x;
			    }
			
				if(sayi==0) {
					break;
				}
			}
			
			
		
		System.out.println(x);
		System.out.println(" -OKTAL SYSTEM-");
		int a=0,syc=0,k=1,oktal=0,x1=x;
		while(true) {
		 for(i=1;;i*=2) {
		    kalan=x1%10;
		    x1=x1/10;
		    syc++;
		  
			if(kalan==1) {
				a=a+i;
			}
			if(syc==3) {
				oktal=(k*a)+oktal;
				k=k*10;
				a=0;
				syc=0;
				break;
			}
			
		   }
		   if(x1==0) {
			   break;
		   }
		
		}
		
		System.out.println(oktal);
		System.out.println(" -HEXADECÝMAL-");
		/*int x2=x,syc1=0,b=0,hexal=0,k=1;
		String m;
		while(true) {
			 for(i=1;;i*=2) {
			    kalan=x2%10;
			    x2=x2/10;
			    syc1++;
			  
				if(kalan==1) {
					b=b+i;
				}
				if(syc1==4) {
					
					if(b>=10) {
						if(hexal==10) {
							m="A";
						}
						else if(b==11) {
							m="B";
						}
						else if(b==12) {
							m="C";
						}
						else if(b==13) {
							m="D";
						}else if(b==14) {
							m="E";
						}
						else {
							m="F";
						}
					}
					hexal=(k*b)+hexal;
					k=k*10;
					b=0;
					syc1=0;
					break;
				}
				
			   }
			   if(x2==0) {
				   break;
			   }
			
			}
		
*/
		
	}

}
