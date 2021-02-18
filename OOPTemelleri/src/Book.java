
public class Book {
	private String name,author,published;
	private int numberofpage;
	//Enctraction bir sýnýfa ait niteliklerin degiskenlerin degerleri ancak o sýnýf icinde kodlanmýs metodtlar
	//tarafýndan ddegistirilebilmesi ve okunabilmesidir
	
	Book(String name,String author,int numberofpage,String published){
		this.author=author;
		this.name=name;
		this.published=published;
		if(numberofpage<1) {
			this.numberofpage=10;
			
		}
		else {
			this.numberofpage=numberofpage;
		}
	}
	
//	public void pagesize() {
//		System.out.println(numberofpage);
//	}
	public int getNumberOfPage() {
		return this.numberofpage;
	}
	public void setNumberOfPage(int size) {
		if(size<1) {
			System.out.println("Sayfa sayýsý negatif olamaz!");
			this.numberofpage=10;
		}
		else {
			this.numberofpage=size;
		}
	}
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name=n;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	
	
	
	
	

}
