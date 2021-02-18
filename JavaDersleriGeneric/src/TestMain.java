
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test<Integer> i=new Test<Integer>(15);
//		System.out.println(i.getobj());
//		
//		Test<String> s=new Test<String>("Kodlama Vakti");
//		System.out.println(s.getobj());
//		
//		Test2<Integer,String> k=new Test2<>(20,"Dilara");
//		k.print();
		
		Integer[] intarr= {1,2,3,4};
		Double[] doublearr= {1.1,2.5};
		Character[] chararr= {'K','O','D'};
		
		genericMetod(intarr);
		genericMetod(doublearr);
		genericMetod(chararr);
	}
	public static <E> void genericMetod(E[] arr) {
		for(E item:arr) {
			System.out.println(item);
		}
	}

}
