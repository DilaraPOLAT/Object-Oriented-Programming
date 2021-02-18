package interface2;

public abstract class  Sayilar implements BasamakToplamiHesapla {
	//hata vermedi interface implement edince neden?sayilar sinifi abstract oldugu icin implements etigi 
	//interface abstraclari oveeride etmek zorunda degil
	public int sayi;
	public Sayilar(int sayi) {
		
		this.sayi = sayi;
	}

	public abstract void SayiBilgisi();
	

}
