import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		//Array(diziler)
		//veriTipi diziAd�[]=new veriTipi[elemanSayisi];
		//veriTipi[] diziAd�=new veriTipi(elemanSayisi);
        //veriTipi diziAd�[]={v1,v2,v3};
		int[] liste=new int[4];
		//int[] liste= {1,2,3,4};
		liste[0]=1;
		liste[1]=2;
		liste[2]=3;
		liste[3]=4;
//		System.out.println(liste[3]);
		int i;
		for (i=0;i<liste.length;i++){
			int value=liste[i];
			System.out.println(liste[i]);
			
		}
//		int[] liste1=new int[4];
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Lutfen 4 adet dizi eleman� giriniz :");
//		for(i=0;i<liste1.length;i++) {
//			liste1[i] =scan.nextInt();
//			
//		}
//		for(i=0;i<liste1.length;i++) {
//			System.out.println(liste1[i]);
//			
//		}
		System.out.println("----------------");
		 //Foreach Kullan�m�
		for(int value: liste) {
			System.out.println(value);
		}
			
		
	}

}
