import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		System.out.println("program baslad�");
		int a=0,b;
		int[] arr= new int[3];
		Scanner scan=new Scanner(System.in);
		try {
			
			//a=2/0;//hata yakalad�k
			arr[0]=10;
			b=scan.nextInt();
			}catch(ArithmeticException e) {
			System.out.println("0'a bolme hatas�");
			System.out.println(e.getMessage());
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array boyut hatas�");
			System.out.println(e.toString());//hata atma terimini yazdir�yor
		}catch(Exception e) {
			System.out.println("Bir hata var!");
			System.out.println(e.toString());
		}finally {
			System.out.println("finally k�sm�");
		}
	
		System.out.println("program bitti");
	}

}
