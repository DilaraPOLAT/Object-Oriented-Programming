import java.util.Scanner;

public class Ortalama {
	public static void main(String[] args) {
		int[] notlar=new int[3];
		Scanner scan =new Scanner(System.in);
		System.out.println("HOÞGELDÝNÝZ lütfen notlarý sýrayla giriniz:");
		System.out.println("turkce notu :");
		notlar[0]=scan.nextInt();
		System.out.println("matematik notu :");
		notlar[1]=scan.nextInt();
		System.out.println("ingilizce notu :");
		notlar[2]=scan.nextInt();
		int top=0;
		for(int value:notlar) {
			top+=value;
		}
		System.out.println("ortalama :" + (top/notlar.length));
		
		
	}

}
