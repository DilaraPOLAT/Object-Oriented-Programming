
public class Book {
	private String name,author,published;
	private int numberofpage;
	//Enctraction bir s�n�fa ait niteliklerin degiskenlerin degerleri ancak o s�n�f icinde kodlanm�s metodtlar
	//taraf�ndan ddegistirilebilmesi ve okunabilmesidir
	
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
			System.out.println("Sayfa say�s� negatif olamaz!");
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
