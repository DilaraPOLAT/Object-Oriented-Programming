package Ornek2;

public class ThreadOrnek implements Runnable {
	public int sayi;
	
	public ThreadOrnek(int sayi) {
		this.sayi=sayi;
	
	}

	@Override
	public void run() {
	
		/*for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"Yazdırılan"+i);
		}*/
		
		int syc=0,tahmin;
		/*synchronized (ThreadOrnek.class) {
		 * bunun icine do while koydugumuzda multıthread yapısı bozulmus olur biri 
		 * calisir bulur sonra digeri aynı anda calisam olmaz.Bu sayede multıthread yapısını yıkmıs oluruz
			
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
