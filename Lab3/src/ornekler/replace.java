package ornekler;

import java.util.Scanner;

public class replace {
	public static void main(String[] args) {
		String kelime;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz:");
		kelime=scan.nextLine();
		
		System.out.println("Kelimenin ilk harli:"+kelime);
		kelime =kelime.replace(" ","");
		
		System.out.println("Kelimenin ikinci hali:"+kelime);
		kelime =kelime.replace("a", "e");
		
		System.out.println("Kelimenin ücüncü hali:"+kelime);
	}

}
