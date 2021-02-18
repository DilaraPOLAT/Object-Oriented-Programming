package QuizSorusu;

public class Isci extends Calisan implements Maas {
	public String gorev;
	
	

	public Isci(String ad, String soyad, int yas, int cs) {
		super(ad, soyad, yas, cs);
		this.gorev = "iþçi";
	}

	@Override
	public double MaasHesapla() {
		double Zam=ZamOraniHesapla();
		double maas=Zam+3000;
		return maas;
	}

	@Override
	public double ZamOraniHesapla() {
		double zam=(this.cs*1000) + (this.yas*(double)2/3);
		return zam;
		
	}

	public String getGorev() {
		return gorev;
	}



	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

	

	

}
