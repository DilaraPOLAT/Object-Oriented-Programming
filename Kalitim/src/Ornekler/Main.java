package Ornekler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Akademisyen a=new Akademisyen("Dilara","@gmail.com","0537...","CENG","hoca","veriYapilari");
		//System.out.println(a.getAdsoyad());
		
		OgretimUyesi o=new OgretimUyesi("Helena","@gmail.com","0550000000","CENG","Hoca","CENG 101","yard.Doçent");
		//System.out.println(o.giris());
				
//		Calisan c=new Calisan("Mehmet","@gmail.com","053000000000");
//		System.out.println(c.giris());
//		Calisan c= new Akademisyen("Ahmet","@gmail.com","0537...","CENG","hoca","veriYapilari");
		
    	Memurlar m=new Memurlar("Aslý","@gmail.com","053000000000","Bilgi islem","tam zamanlý");
    	o.Dersegir(10);
    	
    	//System.out.println(m.giris());
    	//Calisan[] girisListesi= {a,o,m};
    	//Calisan.listele(girisListesi);
//    	System.out.println(a.giris());
//		OgretimUyesi ou=new OgretimUyesi();
//		ou.Dersegir();
//		a.Dersegir();
		//System.out.println(Akademisyen.giris());
		//System.out.println(m.giris());

	}

}
