import java.util.*;
public class Main {
	public static void main(String[] args) {
		//set:farkli elemanlar yukler ,list: ayni veya farkli ve indexli yukler.Queue:ilk giren ilk cýkar
		//map:keyvalue mantýgý var.indexler key deger value python'daki gibi.
		//HashSet <E>
		//LinkedHashSet <E>
		//TreeSet <E>
		
		HashSet h=new HashSet();
		h.add("12 str");
		h.add(12);// tek bir tane yazar.birden fazla ayný eleman olamaz
		h.add(12);
		h.add(12.0);
		h.add(true);
		h.add(null);
		
		h.remove(true);//sýralama yok o yuzden indisleme mantýgýda yok
		h.size();//boyutunu yazdýrýr
		System.out.println(h.size());
		System.out.println(h.contains(12));//12 varsa true yoksa false
		//h.clear();//içini siler
		Iterator itr=h.iterator();
		
		while(itr.hasNext()){//sonrasý var mý?
			System.out.println(itr.next());//null en yukarda yazdý farklý hashledi
			
		}
		//h.forEach(item ->System.out.println(item + " "));
	}

}
