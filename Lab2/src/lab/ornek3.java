package lab;
/*• Örnek 3; Kullanýcýdan alýnan vize, final notuna göre geçme notunu
hesaplayan Java kodunu yazýnýz. (vize, final geçme notu double veri tipi
olmalý)*/

import java.util.Scanner;

public class ornek3 {
	public static void main(String[] args) {
		double vize_notu,final_notu,gecme_notu;
		Scanner scan = new Scanner(System.in);
		System.out.println("Vize notu giriniz:");
		vize_notu = scan.nextDouble();
		
		System.out.println("Final notu giriniz:");
		final_notu = scan.nextDouble();
		gecme_notu=(vize_notu*0.4)+(final_notu*0.6);
		
		System.out.println("Vize_notu:"+vize_notu+"  Final_notu:"+final_notu+"  Gecme_notu:"+gecme_notu);
		if(100<=gecme_notu || gecme_notu>=59.5) {
			System.out.println("CONGRATULATÝONS! you passed:)");
		}
		else {
			System.out.println("UNFORTUNATELY! you could not pass:(");
		}
			
	}

}