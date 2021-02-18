import java.util.*;
public class MainQueue {

	public static void main(String[] args) {
		// -element() Kuyrugun basindaki ogeyi verir ama onu kuyruktan atmaz.
		// -offer(O e) Mumkunse verilen ogeyi kuyruga ekler.
		// -peek() Kuyrugun basindaki ogeyi verir ama onu kuyruktan atmaz.kuyruk bos ise null verir.
		// -poll() Kuyrugun basindaki ogeyi verir ama onu kuyruktan atar.kuyruk bos ise null verir.
		// -remove() Kuyrugun basindaki ogeyi verir ve onu kuyruktan atar.
		
		Queue q=new LinkedList();//polimorfizm
		q.add("Deniz");
		q.add("Ayse");
		
		q.offer("Ali");
		q.offer("Damla");
		
		System.out.println("remove() :"+q.remove());
		System.out.println("element() :"+q.element());
		System.out.println("peek()"+q.peek());
		
		q.forEach(i->System.out.println(i));
	}
	


}
