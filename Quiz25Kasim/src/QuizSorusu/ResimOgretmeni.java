package QuizSorusu;

public class ResimOgretmeni extends Ogretmen
{
	private  int ID;
	public int gs;
	public double tp;
	private static int count=0;
	
	public ResimOgretmeni (String ad, String soyad ,int yas, int gs)
	{
		super( ad,  soyad ,yas);
		this.ID=++count;
		this.gs=gs;
		this.tp=0.3*gs;
		this.brans="Resim";
		
	}
	public ResimOgretmeni() {
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
	public int getCount()
	{
		return this.count;
	}
}
