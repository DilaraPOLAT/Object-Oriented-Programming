
public class Local {

	public void run() {

		class yerel {
			int a;

			yerel(int a) {
				this.a=a;
			}

			public void print() {
				System.out.println(a);
			}
		}
		yerel y=new yerel(10);
		y.print();
	}
}
