import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		
		for(Integer obj:a) {
			System.out.println(obj.doubleValue());
		}
		
		HashMap<Integer,String> c=new HashMap<>();
		c.put(1, "Ankara");
		c.put(2, "Adana");
		c.put(34, "Ýstanbul");
		
		for(Integer key:c.keySet()) {
			System.out.println("Key :" +key+"value:"+c.get(key));
		}

		for(String value:c.values()) {
			System.out.println(value);
		}
		
		
		
	}

}
