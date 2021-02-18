
public class Main {
	public static void main(String[] args) {
		//Encapsulation = (sarmalama,kapsülleme)
		//Inheritance = (kalýtým)
		//Polymorphism = (çok biçimlilik)
		//Abstraction = (soyutlmama)
		
		//Sýnýflar Aras iliþkiler
		//-Bagýmlýlýk (Dependency) "uses a"
		//-Birleþtirme (composition) "has a"
		//-Kalýtým (inheritance) "is a"
		
		Book b1=new Book("Harry Poter","Rowling",400,"Kodlama Vakti");
		//b1.pagesize();
		
		b1.setNumberOfPage(200);
		System.out.println(b1.getNumberOfPage());
		
		Book b2=new Book("Lord of the","Petter Jacson",500,"Kodlama");
		b2.setName("Lord of the Rings");
		System.out.println(b2.getName());
		
		
		
	}

}
