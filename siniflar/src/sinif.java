
public class sinif {
	public static void main(String[] args) {
		//object oriented programming
		//sýnýfadý obje adý = new sýnýfadý();
		//HesapMakinesi makine1 = new HesapMakinesi();
		//makine1.sayi1 = 10;
		//makine1 nesnesinin sayi1 elemaný.
		//makine1.sayi2 = 20;
		//System.out.println(makine1.sayi1);
		//HesapMakinesi makine2 = new HesapMakinesi();
		//makine2.sayi1 = 30;
		//makine2 nesnesinin sayi1 elemaný.
		//System.out.println(makine2.sayi1);
		
		//CONSTRUCTOR(yapicilar)
//		HesapMakinesi makine1;
//		makine1=new HesapMakinesi(1,3);
//		System.out.println(makine1.sayi1+"-"+makine1.sayi2);
//		makine1.sayi1=5;
//		System.out.println(makine1.sayi1+"-"+makine1.sayi2);

		HesapMakinesi m1=new HesapMakinesi(10,5,"Siyah");
		System.out.println(HesapMakinesi.PI);//static oldugu icin m1.PI yazmaya gerk yok
		
		System.out.println(m1.area(10));
		
		
		/*System.out.println(m1.toplama());
		System.out.println(m1.cikarma());
		m1.sayi1=8;
		System.out.println(m1.toplama());
		HesapMakinesi m2=new HesapMakinesi(20,3,"Mavi");
		System.out.println(m2.toplama());*/
		
		
	}

	

}
