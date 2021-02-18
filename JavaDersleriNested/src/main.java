
public class main {

	public static void main(String[] args) {
		// Nested class (i� i�e s�n�flar)
		//  -Innner class(i� s�n�flar)
		//      -Static
		//      -Non- Static
        //   -Local class(yerel s�n�flar)
		//   -Anonymous class(Anonim s�n�flar)
		
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
				System.out.println("Anonim s�n�f�na ait run metodu");
			}
			public void print() {
				System.out.println("print");
			}
			
		};
		a.run();//override etigim metod calisir
		//a.print(); hata verir bulamaz cunku anonim s�n�f�nda boyle bir metod yok
	}

}
