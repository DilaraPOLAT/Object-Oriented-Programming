import java.util.Scanner;

public class PalindromikKelimeler {
	public static void main(String[] args) {
		//yatay,teðet,121
		Scanner scan=new Scanner(System.in);
		String str,tmp="";
		System.out.println("Kelime giriniz:");
		str=scan.nextLine();
		int i;
		for(i=str.length()-1;i>=0;i--) {
			tmp+=str.charAt(i);
			
		}
		
		if(tmp.equals(str)) {
			System.out.println("PALÝNDROMÝK");
		}
		else {
			System.out.println("PALÝNDROMÝK DEÐÝL");
		}
		
	}

}
