
public class Static { // static:nesne uretmeden o sýnýfa ulasabiliyorum
	private int a = 10;
	private static int b = 2;

	public static class Inner {
		int a = 1;

		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(b);
		}
	}
}
