import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("kod.txt");
		if(!file.exists()) {//var m� yok mu?
			file.createNewFile();
		}
		
		String val="Kodlama Vakti!";
		FileWriter fWriter=new FileWriter(file,false);
		BufferedWriter bWriter =new BufferedWriter(fWriter);//i�lemi h�zland�r�yor.
		bWriter.write(val);
		bWriter.write("\nJava dersleri");
		bWriter.close();
		
		FileReader Fread=new FileReader(file);
		String Line;
		BufferedReader bReader=new BufferedReader(Fread);
		
		while((Line= bReader.readLine())!=null) {
			System.out.println(Line);
		}
		
		bReader.close();
		
		
	}

}
