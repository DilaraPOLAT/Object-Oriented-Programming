package Abstract;

public class BilMuh extends AbstractMuh{

	public BilMuh(String ad, int yas) {
		super(ad, yas);
		this.brans="Bilgisayar Muhendisli�i";
	}

	@Override
	public int PuanHesapla() {
		this.puan=yas*4;
		return this.puan;
	}

}
