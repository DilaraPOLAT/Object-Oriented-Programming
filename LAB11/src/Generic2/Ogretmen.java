package Generic2;

public class Ogretmen {

	public String ad;
	public String soyad;
	public String brans;
	public int yas;
	
	public Ogretmen(String ad, String soyad, String brans, int yas) {
		this.ad = ad;
		this.soyad = soyad;
		this.brans = brans;
		this.yas = yas;
	}
	
	public String toString() {
		
		return "��retmen Bilgileri:"+ad+" "+soyad+" " +brans+" "+yas+" ";
	}
}
