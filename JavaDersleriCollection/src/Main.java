import java.util.*;
public class Main {
	public static void main(String[] args) {
		//set:farkli elemanlar yukler ,list: ayni veya farkli ve indexli yukler.Queue:ilk giren ilk c�kar
		//map:keyvalue mant�g� var.indexler key deger value python'daki gibi.
		//HashSet <E>
		//LinkedHashSet <E>
		//TreeSet <E>
		
		HashSet h=new HashSet();
		h.add("12 str");
		h.add(12);// tek bir tane yazar.birden fazla ayn� eleman olamaz
		h.add(12);
		h.add(12.0);
		h.add(true);
		h.add(null);
		
		h.remove(true);//s�ralama yok o yuzden indisleme mant�g�da yok
		h.size();//boyutunu yazd�r�r
		System.out.println(h.size());
		System.out.println(h.contains(12));//12 varsa true yoksa false
		//h.clear();//i�ini siler
		Iterator itr=h.iterator();
		
		while(itr.hasNext()){//sonras� var m�?
			System.out.println(itr.next());//null en yukarda yazd� farkl� hashledi
			
		}
		//h.forEach(item ->System.out.println(item + " "));
	}

}
