package interface1;

public class Anasayfa {
	public static void main(String[]args) {
		
		DikUcgen du=new DikUcgen(3,4);
		du.UcgenYazdir();
		du.CevreHesapla();
		du.AlanHesapla();
		
		ikizKenarUcgen eu=new ikizKenarUcgen(5,5,30);
		eu.UcgenYazdir();
		eu.AlanHesapla();
		
	}
	

}
