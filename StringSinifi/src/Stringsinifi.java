
public class Stringsinifi {
	public static void main(String[] args) {
		//str.length() = Girilen karakterin sayýsýný dondurur.
		//str1.concat(str2) = string Birleþtirme
		//str.indexOf('K') = karakterin konumunu verir
		//str.chartAt(5) = inedexof metoduna benzer sekilde bu sefer de konumu verilen karakteri okur
		//str.compareTo("Kodlama") = buyuk /kucuk fark duyarlý olarak karsýlastýrýlýr
		//str.compareToIgnoreCase("KODlama") = buyuk kucuk harf duyarlý olmadan karsýlastýrýr
		//str.contains("kod") = girilen deger string icinde geciyor mu diye kontrol eder
		//str.endsWith("a") = belirtilen karakerler ile bitiyorsa true degerini dondurur
		//str.replace("kodlama","vakti") = string degistirme icin kullanýlýr
		//str.toLowerCase() , str.toUpperCase() = 	
		//char[] str = {'k','O','D','L','A','M','A'};
		//String metin =new String(str);
		//System.out.println(metin);
		String metin1 = "KODLAMA HELLO";
		String metin2 =" VAKTÝ";
		System.out.println(metin1.length());
		System.out.println(metin1 + metin2);
		System.out.println(metin1.concat(metin2));
		System.out.println(metin1.indexOf('L'));
		System.out.println(metin1.endsWith("MA"));
		System.out.println(metin1.replace("HELLO","VAKTÝ"));
		System.out.println(metin1.toLowerCase());
		
	}

}
