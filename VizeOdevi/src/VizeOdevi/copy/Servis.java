package VizeOdevi.copy;

public class Servis {
	private int depNo;
	private int servisID;
	private String servisGuzergah;
	private static int count=0;
	
	public Servis(int depNo,String servisGuzergah) {
		this.depNo=depNo;
		this.servisID=++count;
		this.servisGuzergah=servisGuzergah;
	}

	
	public void ServisYazdir(int k) {
		System.out.print(k+".Servis ID:"+this.servisID);
		System.out.println(" "+this.servisGuzergah);
		
	}
	

	public String getServisGuzergah() {
		return servisGuzergah;
	}

	public void setServisGuzergah(String servisGuzergah) {
		this.servisGuzergah = servisGuzergah;
	}


}
