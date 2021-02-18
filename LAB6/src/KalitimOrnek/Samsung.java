package KalitimOrnek;

public class Samsung extends SmartPhone {
	private int id;
	private double hiz;
	private int kamera;
	private static int count=0;
	
	public Samsung(String model,int hafiza,double hiz,int kamera) {
		super(model,hafiza);
		this.marka="Samsung";
		this.id=++count;
		this.hiz=hiz;
		this.kamera=kamera;
		
	}
	
	public Samsung()
	{
		this.id=++count;
		this.hiz=0;
		this.kamera=0;
	}
	
	
	public void BilgileriYazdýr() {
		System.out.println("------------------------");
		System.out.println("Telefonun hýzý:"+this.id);
		System.out.println("Telefonun markasý:"+this.marka);
		System.out.println("Telefonun modeli:"+this.model);
		System.out.println("Telefonun hafýzasý:"+this.hafiza);
		System.out.println("Telefonun modeli:"+this.hiz);
		System.out.println("Telefonun hafýzasý:"+this.kamera);
		
		
	}
	
	public void HizDegerlendir()
	{
		if(this.hiz<=1.0)
           System.out.println("Hýz dusuk!");
		else
			System.out.println("Hýz normal!");
	}
	
	public void  KameraDegerlendir()
	{
		if(this.kamera<=16)
           System.out.println("Kamera dusuk!");
		else
			System.out.println("Kamera normal!");
	}
	
	
	
	

}
