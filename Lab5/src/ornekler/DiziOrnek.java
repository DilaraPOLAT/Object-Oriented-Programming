package ornekler;

import java.util.Scanner;

public class DiziOrnek {
	public static void main(String[] args) {
		int db,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Dizi boyutunu giriniz:");
		db=scan.nextInt();
		int[] dizi=new int[db];
		for(i=0;i<db;i++) {
			System.out.println(i+".Dizi elemanýný giriniz:");
			dizi[i]=scan.nextInt();			
		}
		System.out.println("Dizi sýralamanmamýs hali:");
        for(i=0;i<dizi.length;i++) {
        	System.out.println(dizi[i]);
			
		}
        BubbleSort(dizi);
        System.out.println("BubbleSort fonksiyonundan sonra");
        for(i=0;i<dizi.length;i++) {
        	System.out.println(dizi[i]);
			
		}
        
		
	
	}
	private static void  BubbleSort(int[] dizi) {
		int gecici;
		for(int i=0;i<dizi.length;i++) {
			for(int j=0;j<dizi.length-1;j++) {
				if(dizi[j]>dizi[j+1]) {
					gecici=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=gecici;
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
