package lab;

import java.util.Scanner;

/*• Örnek 6; Kullanýcýdan alýnan soru, doðru ve yanlýþ sayýsýna göre boþ ve
net sayýsýný hesaplayan Java kodunu yazýnýz. (4 yanlýþ bir doðruyu
götürmektedir.)*/

public class ornek6 {
	public static void main(String[] args) {
		int soru,dogru,yanlis,bos;
		float net;
		Scanner reader= new Scanner(System.in);
		System.out.println("Soru sayýsý giriniz:");
		soru=reader.nextInt();
		System.out.println("Dogru sayýsý giriniz:");
		dogru=reader.nextInt();
		System.out.println("Yanlýs sayýsý giriniz:");
		yanlis=reader.nextInt();
		bos=soru-(dogru+yanlis);
		float tdogru = (float)dogru;
		float tyanlis = (float)yanlis;
		net=tdogru-(tyanlis/4);
		System.out.println("Soru_sayisi:"+soru+" Dogru_sayisi:"+dogru+" Yanlis_sayisi:"+yanlis+"\n"+"Bos_sayisi:"+bos+"  Net_sayisi:"+net);
		
	}
	
	

}
