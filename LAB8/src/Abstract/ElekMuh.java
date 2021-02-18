package Abstract;

public class ElekMuh extends AbstractMuh {

	public ElekMuh(String ad, int yas) {
		super(ad, yas);
		this.brans="Elektrik Muhendisligi";
	}

	@Override
	public int PuanHesapla() {
		this.puan=yas*5;
		return this.puan;
	}

}
