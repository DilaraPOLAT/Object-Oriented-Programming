package Ornek2;

public class ThreadOrnek implements Runnable {
	public int sayi;
	
	public ThreadOrnek(int sayi) {
		this.sayi=sayi;
	
	}

	@Override
	public void run() {
	
		/*for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"Yazd�r�lan"+i);
		}*/
		
		int syc=0,tahmin;
		/*synchronized (ThreadOrnek.class) {
		 * bunun icine do while koydugumuzda mult�thread yap�s� bozulmus olur biri 
		 * calisir bulur sonra digeri ayn� anda calisam olmaz.Bu sayede mult�thread yap�s�n� y�km�s oluruz
			
		}*/
		do
		{
			tahmin=(int)(Math.random()*100+1);
			syc++;
			System.out.println(Thread.currentThread().getName()+"Tahmin"+tahmin);
		}while(sayi!=tahmin);
		
		System.out.println(Thread.currentThread().getName()+"Dogru Tahmin Deneme Sayisi"+syc);
	}
	

}
