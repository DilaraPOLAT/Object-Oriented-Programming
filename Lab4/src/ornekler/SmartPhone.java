package ornekler;

public class SmartPhone {
	private String marka;
	private String model;
	private String renk;
	private int hafiza;
	private double hiz;
	
	public void BilgileriYzdýr() {
		System.out.println("Telefonun markasý:"+this.marka);
		System.out.println("Telefonun modeli:"+this.model);
		System.out.println("Telefonun rengi:"+this.renk);
		System.out.println("Telefonun hafýzasý:"+this.hafiza);
		System.out.println("Telefonun hýzý:"+this.hiz);
	}
	
	public  SmartPhone(String marka,String model,String renk,int hafiza,double hiz) {
		this.marka=marka;
		this.model=model;
		this.renk=renk;
		this.hafiza=hafiza;
		this.hiz=hiz;
	}
	
	
	public void SetMarka(String marka) {
		this.marka=marka;
	}
	
	public String getMarka() { 
		return this.marka;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		 this.model = model;
	}
	
	public String getrenk() {
		return renk;
	}
	

}
