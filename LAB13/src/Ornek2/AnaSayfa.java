package Ornek2;

public class AnaSayfa {

	public static void main(String[] args) {
		Thread thr1=new Thread(new ThreadOrnek(61));
		Thread thr2=new Thread(new ThreadOrnek(61));
		//ThreadOrnek thr1=new ThreadOrnek();
		//ThreadOrnek thr2=new ThreadOrnek();
		
		thr1.start();
		thr2.start();
		

	}

}
