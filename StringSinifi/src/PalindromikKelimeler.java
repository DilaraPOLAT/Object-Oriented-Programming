import java.util.Scanner;

public class PalindromikKelimeler {
	public static void main(String[] args) {
		//yatay,te�et,121
		Scanner scan=new Scanner(System.in);
		String str,tmp="";
		System.out.println("Kelime giriniz:");
		str=scan.nextLine();
		int i;
		for(i=str.length()-1;i>=0;i--) {
			tmp+=str.charAt(i);
			
		}
		
		if(tmp.equals(str)) {
			System.out.println("PAL�NDROM�K");
		}
		else {
			System.out.println("PAL�NDROM�K DE��L");
		}
		
	}

}
