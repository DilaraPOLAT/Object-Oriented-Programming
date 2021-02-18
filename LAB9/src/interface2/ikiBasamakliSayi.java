package interface2;

public class ikiBasamakliSayi extends Sayilar {

	public int bs;
	public ikiBasamakliSayi(int sayi) {
		super(sayi);
	    bs=2;
	}

	@Override
	public void topla() {
		int toplam=0;
		int[] dizi;
		dizi=SayiBaBul();
		for(int i=0;i<dizi.length;i++)
		{
			toplam+=dizi[i];
		}
		System.out.println("Basamak toplamlari:"+toplam);
		
	}

	@Override
	public int[] SayiBaBul() {
		int[] dizi =new int[bs];
		int kalan,syc=0;
		while(sayi>0)
		{
			kalan=sayi%10;
			sayi=sayi/10;
			dizi[syc]=kalan;
			syc++;
		}
		return dizi;
	}

	@Override
	public void SayiBilgisi() {
		System.out.println("Bu iki basamakli bir sayidir.");
		
	}

}
