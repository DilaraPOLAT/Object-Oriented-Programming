package dosya;

import java.io.*;

public class ornek3 {

	public static void main(String[] args) throws IOException {
		File f=new File("Dosya1.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=2;i<=100;i=i+2) {
			bw.write(i+ "\n");
			
		}
		bw.close();
		fw.close();
		

	}

}
