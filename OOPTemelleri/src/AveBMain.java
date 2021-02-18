
public class AveBMain {
	public static void main(String[] args) {
		//Encapsulation = (sarmalama,kapsülleme)
		//Inheritance = (kalýtým)
		//Polymorphism = (çok biçimlilik)
		//Abstraction = (soyutlmama)
		
		//Sýnýflar Aras iliþkiler
		//-Bagýmlýlýk (Dependency) "uses a"   A uses B
		//-Birleþtirme (composition) "has a"
		//-Kalýtým (inheritance) "is a" insan ogretmen ogrenci bunlarýn ortak ozelliði insan olmasý.
		
		A a=new A();
		B bi=new B(2,5);
       for(int i=0;i<3;i++)
       {
    	a.dizi[i]=new B(2,3)  ; 
       }
//		a.dizi[0]=new B(2,3);
//		a.dizi[1]=new B(2,3);
//		a.dizi[2]=new B(2,3);
		bi.yazdir();
		for(int i=0;i<3;i++)
		{
			a.dizi[i].yazdir();
			System.out.println("-------");
		}
		
		//a.run(bi);
		
		
		
		
	}

}
