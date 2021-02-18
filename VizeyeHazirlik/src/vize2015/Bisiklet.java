package vize2015;

public class Bisiklet {
	public String renk; public int vites,hiz;
	
	public Bisiklet(String renk,int vites,int hiz)
	{
		this.renk=renk;
		this.vites=vites;
		this.hiz=hiz;
	}
	
	public static void main (String[] args) {
		
		Bisiklet bmx=new Bisiklet("Siyah",18,6);
		Bisiklet pinkyo=new Bisiklet("Beyaz",12,8);
		System.out.println(bmx.renk+","+bmx.vites+","+bmx.hiz);
		System.out.println(pinkyo.renk+","+pinkyo.vites+","+pinkyo.hiz);
		bmx=pinkyo;
		pinkyo.vites=6;
		System.out.println(bmx.renk+","+bmx.vites+","+bmx.hiz);
		System.out.println(pinkyo.renk+","+pinkyo.vites+","+pinkyo.hiz);
		pinkyo=bmx;
		pinkyo.hiz=10;
		System.out.println(bmx.renk+","+bmx.vites+","+bmx.hiz);
		System.out.println(pinkyo.renk+","+pinkyo.vites+","+pinkyo.hiz);
		
		
		System.out.println(bmx.carpim(7));
		System.out.println(bmx.Hesapla(6, 9));
		
	}
	public int carpim(int n)
	{
		int kalan=n%2;
		if(n==0)
			return 1;
		else if (kalan==0)
			n=n-1;
		return n*carpim(n-1);
		
	}
	public int Hesapla(int x,int y) {
		if(x<0)
			x=x*(-1);
		if(y<0)
			y=y*(-1);
		
		if(x==0 && y==0)
			return 0;
		else if(x==0)
			x=1;
		else if(y==0)
			y=1;
		int topla=1;
		return topla+Hesapla(x-1,y-1);
		
		
	}
	

}
