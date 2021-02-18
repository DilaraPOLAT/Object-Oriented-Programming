package KalitimOrnek;

public class SmartPhone {
	public String marka;
	public String model;
	public int hafiza;
	private int id;
	private static int count=0;
	
	public SmartPhone(String marka,String model,int hafiza) {
		this.marka=marka;
		this.model=model;
		this.hafiza=hafiza;
		this.id=++count;
	}
	
	public SmartPhone(String model,int hafiza)
	{
		this.id=++count;
		this.model=model;
		this.hafiza=hafiza;
	}
	
	SmartPhone()
	{
	  this.id=++count;
	  this.hafiza=0;
	  this.marka="Tanimlanmadi";
	  this.model="Tanimlanmadi";
	  }
	
	public void BilgileriYazdýr() {
		System.out.println("------------------------");
		System.out.println("Telefonun hýzý:"+this.id);
		System.out.println("Telefonun markasý:"+this.marka);
		System.out.println("Telefonun modeli:"+this.model);
		System.out.println("Telefonun hafýzasý:"+this.hafiza);
		
	}
	public final void HafizaDegerlendir(int hafiza) {
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

















