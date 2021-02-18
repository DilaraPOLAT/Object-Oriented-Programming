import java.util.*;
public class MainVector {

	public static void main(String[] args) {
		//ArrayList <E>
		//LinkedList <E>
		//Vector <E>
		
		Vector v=new Vector();//Vector(4) boyutunu belirleyebiliriz.veya Vector(4,2) boyutun kac artacaðinida verebiliriz.
		v.add("Elma");
		v.add("Kavun");
		v.add("Çilek");
		v.add("Kiraz");
		v.add("Üzüm");
		v.add("Portakal");
		v.add("Kavun");
		v.add("Çilek");
		v.add("Kiraz");
		v.add("Üzüm");
		v.add("Portakal");
		
		System.out.println("Boyut:"+v.size());
		System.out.println("Kapasite:"+ v.capacity());//10 fakat 11.eleman girerisek 20 olur yani degisiyor.
		
		v.remove(0);
		System.out.println(v.firstElement());//ilk elemani verir.

	}

}

