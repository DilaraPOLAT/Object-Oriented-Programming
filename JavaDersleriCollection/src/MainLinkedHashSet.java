import java.util.*;
public class MainLinkedHashSet {
	public static void main(String[] args) {
		//HashSet <E>
		//LinkedHashSet <E>
		//TreeSet <E>
		//Hashset: Stringleri bir yere, int bir yere þeklinede sýralar null ve sayýyý bir kere yazabilirsin.
		//LinkedHashSet: Giriþ sýrana göre sýralama yapar. Null ve sayýyý bir kere yazabilirsin.
		//Tree set: Sadece sayýsal deðer girebilirsin. Bunlarý kendi sýralar ve ekrana yazar. Null yazamazsýn. Sayýyý bir kere yazabilirsin.
		
		LinkedHashSet gunler =new LinkedHashSet();
		gunler.add("Pazartesi");
		gunler.add("Salý");
		gunler.add("Çarþamba");
		gunler.add("Perþembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		gunler.add(null);
		
		gunler.remove("Pazar");
		gunler.add("Pazartesi");
		
		gunler.forEach(item -> System.out.print(item + " , "));
		
	}

}
