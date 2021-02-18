package ornekler;

public class metot {
	public static void Enbuyukbul(int sayi1,int sayi2) {
		if(sayi1>=sayi2) {
		   System.out.println("En buyuk sayi:"+sayi1);
		}
		else {
			System.out.println("En buyuk sayi:"+sayi2);
			
		}
	}
	public static void Enbuyukbul(int sayi1,int sayi2,int sayi3) {
		int enb;
		if(sayi1>=sayi2) {
		 enb=sayi1;
		}
		else if(sayi2>=sayi3) {
			enb=sayi2;	
		}
		else {
			enb=sayi3;
			
		}
		System.out.println("En buyuk sayi:"+enb);
	}
	public static void main(String[] args) {
		
		Enbuyukbul(10,20);
	    Enbuyukbul(4,90,45);
	}

}
