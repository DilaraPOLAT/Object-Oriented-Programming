package dosya;

import java.io.*;
import java.util.Scanner;

public class ornek1 {
	public static void main(String[] args) throws IOException {
		 File f=new File("Dosya.txt");
		Scanner s =new Scanner(f);
		 int sayi;
		 while(s.hasNextInt()) {
			 sayi=s.nextInt();
			 System.out.println(sayi);
		 }
		 s.close();
		 
	}

}
