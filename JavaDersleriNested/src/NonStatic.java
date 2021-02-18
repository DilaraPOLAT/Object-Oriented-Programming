
public class NonStatic {
	private int a = 10;

	public class inner {
		int a = 1;// burayi b =1 yapsam System.out.println(a) hata verir bir alt satýrdaki hata
					// vermez java bakar icinde yoksa bir ust sýnýfa bakar

		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(NonStatic.this.a);
		}
	}

	public void run() {
		System.out.println(a);
		System.out.println(this.a);
		inner i = new inner();
		System.out.println(i.a);
	}

}
