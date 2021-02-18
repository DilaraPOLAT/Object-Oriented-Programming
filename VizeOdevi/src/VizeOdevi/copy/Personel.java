package VizeOdevi.copy;

public class Personel {
	private int depNo;
	private int perID;
	private String perAd;
	private String perSoyad;
	private int perYas;
	private static int count=0;
	
	public Personel(int depNo,String perAd,String perSoyad,int perYas) {
		
		this.depNo=depNo;
		this.perID=++count;
		this.perAd=perAd;
		this.perSoyad=perSoyad;
		this.perYas=perYas;
		
	}
 
public void PersonelYazdir(int j) {
	   System.out.print(j+".Personel :"+this.perID);
	   System.out.print(" "+this.perAd);
	   System.out.print(" "+this.perSoyad);
	   System.out.println(" "+this.perYas);
	  
   }
   
//personel en buyuk yas bulmayý sagliyor.
public int perEnBYas(int yas)
   {
	   if(yas<=this.perYas)
	   {
		   return this.perYas;//Eger gelen parametre personel yasýndan kucukse personel yasi donduruyorum.
			   
	   }
	   return yas;//Degil ise gelen  parametreyi tekrar yoluyorum.
   }
   
   public int perEnKYas(int yas)
   {
	   if(yas>this.perYas)
	   {
		   return this.perYas;//Eger gelen parametre personel yasýndan buyukse personel yasi donduruyorum.
			   
	   }
	  
	   return yas;//Degil ise gelen  parametreyi tekrar yoluyorum.
   }
   
   public String getPerAd() {
	return perAd;
   }

   public void setPerAd(String perAd) {
	this.perAd = perAd;
   }
   public int getPerYas() {
 		return perYas;
 	}
 	public void setPerYas(int perYas) {
 		this.perYas = perYas;
 	}

	
  
}
