package Generic1;

public class AnaSayfa {

	public static void main(String[] args) {
		
		Ogrenci ogr=new Ogrenci("Dilara","Polat",64);
		
		Jenerik<Integer> nesne1=new Jenerik<Integer>(10);
		Jenerik<String> nesne2=new Jenerik<String>("Ayse");
		Jenerik<Double> nesne3=new Jenerik<Double>(5.8);
		Jenerik<Ogrenci> nesne4=new Jenerik<Ogrenci>(ogr);
		
		nesne1.NesneBilgileriniGoruntule();
		nesne2.NesneBilgileriniGoruntule();
		nesne3.NesneBilgileriniGoruntule();
		nesne4.NesneBilgileriniGoruntule();

	}

}
