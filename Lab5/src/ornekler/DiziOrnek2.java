package ornekler;

import java.util.Scanner;

public class DiziOrnek2 {
	public static void main(String[] args) {
		int satir,sutun;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Dizinin satir sayisini giriniz: ");
		satir=scan.nextInt();
		
		System.out.println("Dizinin sutun sayisini giriniz: ");
		sutun=scan.nextInt();
		
		int[][] dizi =new int[satir][sutun];
		
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				System.out.println("Dizinin "+i+"'a"+j+".elemanýný giriniz: ");
				dizi[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<satir;i++) {
			int satirtoplam=0;
			for(int j=0;j<sutun;j++) {
				satirtoplam=satirtoplam+dizi[i][j];
			}
			System.out.println(" ");
		}
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				System.out.print(dizi[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<satir;i++) {
			int satirtoplam=0;
			for(int j=0;j<sutun;j++) {
				satirtoplam=satirtoplam+dizi[i][j];
			}
			satirtoplam=satirtoplam/sutun;
			System.out.println(i+".satýrýn ortalamasý :"+satirtoplam);
		}
		
		
		
		
	}

}
