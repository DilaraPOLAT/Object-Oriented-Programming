import java.util.*;
public class MainArrayList {
	public static void main(String[] args) {
		//ArrayList <E>
		//LinkedList <E>
		//Vector <E>
		ArrayList country=new ArrayList();
		country.add("Ankara");
		country.add("Siirt");
		country.add("Bolu");
		country.add("Ankara");
		
		country.add(1, "Ýstanbul");
		country.remove(1);
		Iterator itr=country.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//country.forEach(i  ->System.out.println(i));
		
		
		
	}

}
