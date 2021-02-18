
public class main {

	public static void main(String[] args) {
		// Nested class (iç içe sýnýflar)
		//  -Innner class(iç sýnýflar)
		//      -Static
		//      -Non- Static
        //   -Local class(yerel sýnýflar)
		//   -Anonymous class(Anonim sýnýflar)
		
		//ctrl+shift+f->kodu duzenler
		NonStatic n=new NonStatic();
		NonStatic.inner Inner=n.new inner();
		//Inner.run();
		Static.Inner s=new Static.Inner();
		//s.run();
		Local l=new Local();
		//l.run();
		Anonim a=new Anonim() {
			public void run() {//metod override edildi
				System.out.println("Anonim sýnýfýna ait run metodu");
			}
			public void print() {
				System.out.println("print");
			}
			
		};
		a.run();//override etigim metod calisir
		//a.print(); hata verir bulamaz cunku anonim sýnýfýnda boyle bir metod yok
	}

}
