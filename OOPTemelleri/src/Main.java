
public class Main {
	public static void main(String[] args) {
		//Encapsulation = (sarmalama,kaps�lleme)
		//Inheritance = (kal�t�m)
		//Polymorphism = (�ok bi�imlilik)
		//Abstraction = (soyutlmama)
		
		//S�n�flar Aras ili�kiler
		//-Bag�ml�l�k (Dependency) "uses a"
		//-Birle�tirme (composition) "has a"
		//-Kal�t�m (inheritance) "is a"
		
		Book b1=new Book("Harry Poter","Rowling",400,"Kodlama Vakti");
		//b1.pagesize();
		
		b1.setNumberOfPage(200);
		System.out.println(b1.getNumberOfPage());
		
		Book b2=new Book("Lord of the","Petter Jacson",500,"Kodlama");
		b2.setName("Lord of the Rings");
		System.out.println(b2.getName());
		
		
		
	}

}
