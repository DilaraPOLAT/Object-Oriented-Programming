
public class AveBMain {
	public static void main(String[] args) {
		//Encapsulation = (sarmalama,kaps�lleme)
		//Inheritance = (kal�t�m)
		//Polymorphism = (�ok bi�imlilik)
		//Abstraction = (soyutlmama)
		
		//S�n�flar Aras ili�kiler
		//-Bag�ml�l�k (Dependency) "uses a"   A uses B
		//-Birle�tirme (composition) "has a"
		//-Kal�t�m (inheritance) "is a" insan ogretmen ogrenci bunlar�n ortak ozelli�i insan olmas�.
		
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
