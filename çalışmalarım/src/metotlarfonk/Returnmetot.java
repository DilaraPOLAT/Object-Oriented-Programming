package metotlarfonk;

public class Returnmetot {
	static int power(int a,int b) {
		int result=1,i;
		for(i=0;i<=b;i++) {
			result*=a;
		}
		return result;
	}
	public static void main(String[] args) {
		int r2=power(3,3);
		System.out.println(r2);
	}

}
