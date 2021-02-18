package metotlarfonk;

public class recursivemetot {
	static int r(int x) {
		if(x==1) {
			return 1;
		}
		return x + r(x-1);
	}
	public static void main(String[] args) {
		System.out.println(r(10));
	}

}
