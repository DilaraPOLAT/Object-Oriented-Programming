package VizeOdevi;

public class Departman {
	
	private int depNo;
	private String depAd;
	public Personel Personeller[];
	public Servis Servisler[];
	
	public  Departman(String depAd, int depNo) {//constructor tanimladim
		this.depAd=depAd;
		this.depNo=depNo;
	}
	
	public void diziPBoyut(int p)//Personeller dizisinin boyutunu belirliyorum
	{
		Personeller=new Personel[p];
	}
	
	public void diziSBoyut(int s)//Servisler dizisinin boyutunu belirliyorum
	{
		Servisler=new Servis[s];
	}
	
	public Departman() {//Bos constructor tanimladim cunku eleman almayan bir constructor yapýsina anasayfada ihtiyacim vardi.
		// TODO Auto-generated constructor stub
	}
	
	public void BilgileriYazdir()
	{
		System.out.print("Departman No:"+this.depNo);
		System.out.println(" "+"Departman Ad:"+this.depAd);
	}
	
	
	
	 public String getDepAd() {
		return depAd;
	}

	public void setDepAd(String depAd) {
		this.depAd = depAd;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	

}
