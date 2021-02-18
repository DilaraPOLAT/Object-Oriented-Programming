package QuizSorusu;

public class MatematikOgretmeni extends Ogretmen
{
	private int ID;
	public int gs;
	public double tp;
	private static int count=0;
	public MatematikOgretmeni (String ad, String soyad, int yas ,int gs)
	{
		super ( ad,  soyad , yas);
		this.ID=++count;
		this.gs=gs;
		this.tp=0.4*gs;
		this.brans="Matematik";
		
		
		
	}
	public MatematikOgretmeni() {
		// TODO Auto-generated constructor stub
	}

	public void BilgileriYazdir()
	{
		System.out.println("ID:"+this.ID);
		System.out.println("AD:"+this.ad );
		System.out.println("Soyad:"+this.soyad);
		System.out.println("Yas:"+this.yas);
		System.out.println("Brans:"+this.brans);
		System.out.println("Tecrube Puani:"+this.tp);
		System.out.println();
		
	}
	public void yazdir()
	{
		System.out.println("dilara");
	}

}