package lab;

import java.util.Scanner;

/*� �rnek 6; Kullan�c�dan al�nan soru, do�ru ve yanl�� say�s�na g�re bo� ve
net say�s�n� hesaplayan Java kodunu yaz�n�z. (4 yanl�� bir do�ruyu
g�t�rmektedir.)*/

public class ornek6 {
	public static void main(String[] args) {
		int soru,dogru,yanlis,bos;
		float net;
		Scanner reader= new Scanner(System.in);
		System.out.println("Soru say�s� giriniz:");
		soru=reader.nextInt();
		System.out.println("Dogru say�s� giriniz:");
		dogru=reader.nextInt();
		System.out.println("Yanl�s say�s� giriniz:");
		yanlis=reader.nextInt();
		bos=soru-(dogru+yanlis);
		float tdogru = (float)dogru;
		float tyanlis = (float)yanlis;
		net=tdogru-(tyanlis/4);
		System.out.println("Soru_sayisi:"+soru+" Dogru_sayisi:"+dogru+" Yanlis_sayisi:"+yanlis+"\n"+"Bos_sayisi:"+bos+"  Net_sayisi:"+net);
		
	}
	
	

}
