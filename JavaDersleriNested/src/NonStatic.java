
public class NonStatic {
	private int a = 10;

	public class inner {
		int a = 1;// burayi b =1 yapsam System.out.println(a) hata verir bir alt sat�rdaki hata
					// vermez java bakar icinde yoksa bir ust s�n�fa bakar

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
