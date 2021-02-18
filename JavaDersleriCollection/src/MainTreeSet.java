import java.util.*;
public class MainTreeSet {

	public static void main(String[] args) {
		//HashSet <E>
		//LinkedHashSet <E>
		//TreeSet <E>
		
		TreeSet tree=new TreeSet();
		tree.add(10);
		tree.add(1);
		tree.add(2);
		tree.add(6);
		tree.add(7);
		try {
			tree.add(null);	
		}catch(Exception e) {
			System.out.println(e.toString());
			
		}
		
		
		tree.forEach(item -> System.out.print(item + " , "));

	}

}
