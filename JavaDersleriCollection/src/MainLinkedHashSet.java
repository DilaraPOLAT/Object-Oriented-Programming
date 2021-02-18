import java.util.*;
public class MainLinkedHashSet {
	public static void main(String[] args) {
		//HashSet <E>
		//LinkedHashSet <E>
		//TreeSet <E>
		//Hashset: Stringleri bir yere, int bir yere �eklinede s�ralar null ve say�y� bir kere yazabilirsin.
		//LinkedHashSet: Giri� s�rana g�re s�ralama yapar. Null ve say�y� bir kere yazabilirsin.
		//Tree set: Sadece say�sal de�er girebilirsin. Bunlar� kendi s�ralar ve ekrana yazar. Null yazamazs�n. Say�y� bir kere yazabilirsin.
		
		LinkedHashSet gunler =new LinkedHashSet();
		gunler.add("Pazartesi");
		gunler.add("Sal�");
		gunler.add("�ar�amba");
		gunler.add("Per�embe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		gunler.add(null);
		
		gunler.remove("Pazar");
		gunler.add("Pazartesi");
		
		gunler.forEach(item -> System.out.print(item + " , "));
		
	}

}
