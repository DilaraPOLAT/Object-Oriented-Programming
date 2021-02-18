package Generic2;

public class AnaSayfa {
	
	public static <T> String  Bilgiler(T nesne){
		
		System.out.println("Sýnýf Bilgisi"+nesne.getClass().getName());
		return nesne.toString();
	}

	public static void main(String[] args) {
		
		Ogrenci ogr=new Ogrenci("Eda","Ada",1024);
		Ogretmen ogrt=new Ogretmen ("Mehemt","Kýlýnç","Resim",30);
		
		System.out.println(Bilgiler(ogr));
		System.out.println(Bilgiler(ogrt));
		
		

	}

}