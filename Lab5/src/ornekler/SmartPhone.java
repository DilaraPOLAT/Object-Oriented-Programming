package ornekler;

public class SmartPhone {
	private String marka;
	private String model;
	private int hafiza;
	private int id;
	private static int count=0;
	
	public SmartPhone(String marka,String model,int hafiza) {
		this.marka=marka;
		this.model=model;
		this.hafiza=hafiza;
		this.id=++count;
	}
	
	public void BilgileriYazdýr() {
		System.out.println("------------------------");
		System.out.println("Telefonun hýzý:"+this.id);
		System.out.println("Telefonun markasý:"+this.marka);
		System.out.println("Telefonun modeli:"+this.model);
		System.out.println("Telefonun hafýzasý:"+this.hafiza);
		
	}
	public void HafizaDegerlendir(int hafiza) {
		if(hafiza<=16) {
			System.out.println("Hafiza dusuk");
		}
		else {
			System.out.println("Hafiza dusuk egil");
		}
		
	}
	public int getSmartPhoneSayisi() {
		return count;
		
	}
	public int  getId() {
		return id;
	}
	public void SetMarka(String Marka) {
		this.marka=marka;
	}
	public String getMarka() {
		return this.marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model= model;
	}
	public int getHafiza() {
		return hafiza;
	}
	public void setHafiza(int hafiza) {
		this.hafiza= hafiza;
	}

}

















