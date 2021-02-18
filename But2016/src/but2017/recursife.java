package but2017;

public class recursife {

	public static int say7(int n) {
		if(n==0)
			return 0;
		int kalan,syc=0;
		kalan=n%10;
		n=n/10;
		if(kalan==7)
			syc++;
		return syc+say7(n);
	}
	public static void main(String[] args) {
		System.out.println(say7(1548));

	}

}
